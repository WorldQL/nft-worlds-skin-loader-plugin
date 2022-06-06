package com.worldql.skinloader;

import customskinloader.config.SkinSiteProfile;
import customskinloader.plugin.ICustomSkinLoaderPlugin;

public class WorldQLDefaultProfile implements ICustomSkinLoaderPlugin.IDefaultProfile {
    @Override
    public String getName() {
        return "NFT Worlds";
    }

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public void updateSkinSiteProfile(SkinSiteProfile skinSiteProfile) {
        skinSiteProfile.type = "WorldQLAPI";

        if (skinSiteProfile.root == null)
            skinSiteProfile.root = "https://skins.nftworlds.com";
    }
}
