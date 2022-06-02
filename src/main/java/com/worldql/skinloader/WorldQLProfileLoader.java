package com.worldql.skinloader;

import com.mojang.authlib.GameProfile;
import customskinloader.config.SkinSiteProfile;
import customskinloader.loader.ProfileLoader;
import customskinloader.profile.ModelManager0;
import customskinloader.profile.UserProfile;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.UUID;

public class WorldQLProfileLoader implements ProfileLoader.IProfileLoader {
    @Override
    public UserProfile loadProfile(SkinSiteProfile skinSiteProfile, GameProfile gameProfile) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            UUID userId = gameProfile.getId();
            String root = skinSiteProfile.root == null ? "https://skins.nftworlds.com" : skinSiteProfile.root;

            WorldQLSkinAPI.Response fetchedSkins = WorldQLSkinAPI.getSkinsForUser(client, root, userId);

            UserProfile profile = new UserProfile();
            switch (fetchedSkins.skinType) {
                case "slim":
                    profile.put(ModelManager0.Model.SKIN_SLIM, fetchedSkins.skinUrl);
                    break;
                case "default":
                default:
                    profile.put(ModelManager0.Model.SKIN_DEFAULT, fetchedSkins.skinUrl);
            }

            if (fetchedSkins.capeUrl != null)
                profile.put(ModelManager0.Model.CAPE, fetchedSkins.capeUrl);

            if (fetchedSkins.elytraUrl != null)
                profile.put(ModelManager0.Model.ELYTRA, fetchedSkins.elytraUrl);

            return profile;
        }
    }

    @Override
    public boolean compare(SkinSiteProfile skinSiteProfile, SkinSiteProfile skinSiteProfile1) {
        return false;
    }

    @Override
    public String getName() {
        return "WorldQLAPI";
    }

    @Override
    public void init(SkinSiteProfile skinSiteProfile) {
    }
}
