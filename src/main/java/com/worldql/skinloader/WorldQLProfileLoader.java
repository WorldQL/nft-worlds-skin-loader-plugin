package com.worldql.skinloader;

import com.mojang.authlib.GameProfile;
import customskinloader.config.SkinSiteProfile;
import customskinloader.loader.ProfileLoader;
import customskinloader.profile.ModelManager0;
import customskinloader.profile.UserProfile;

import java.util.UUID;

public class WorldQLProfileLoader implements ProfileLoader.IProfileLoader {
    @Override
    public UserProfile loadProfile(SkinSiteProfile skinSiteProfile, GameProfile gameProfile) throws Exception {
        UUID userId = gameProfile.getId();

        // TODO: Do some HTTP request to get an IPFS URL from userId,
        //       but for now let's just say:
        String fetchedSkinImageURL = "https://routing.nftworlds.com/ipfs/Qma8T5tX6XTizbpPiHuXkw8yo9vCf7SHWAr3kwKozn5wEK";

        UserProfile profile = new UserProfile();
        profile.put(ModelManager0.Model.SKIN_DEFAULT, fetchedSkinImageURL);

        return profile;
    }

    @Override
    public boolean compare(SkinSiteProfile skinSiteProfile, SkinSiteProfile skinSiteProfile1) {
        return false;
    }

    @Override
    public String getName() {
        return "WorldQL";
    }

    @Override
    public void init(SkinSiteProfile skinSiteProfile) {
    }
}
