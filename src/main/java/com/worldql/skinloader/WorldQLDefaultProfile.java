package com.worldql.skinloader;

import customskinloader.config.SkinSiteProfile;
import customskinloader.plugin.ICustomSkinLoaderPlugin;

public class WorldQLDefaultProfile implements ICustomSkinLoaderPlugin.IDefaultProfile {
    @Override
    public String getName() {
        return "WorldQL";
    }

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public void updateSkinSiteProfile(SkinSiteProfile skinSiteProfile) {
        skinSiteProfile.type = "WorldQL";
    }
}
