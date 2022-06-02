package com.worldql.skinloader;

import customskinloader.loader.ProfileLoader;
import customskinloader.plugin.ICustomSkinLoaderPlugin;

import java.util.List;

public class WorldQLSkinLoaderPlugin implements ICustomSkinLoaderPlugin {
    @Override
    public ProfileLoader.IProfileLoader getProfileLoader() {
        return new WorldQLProfileLoader();
    }

    @Override
    public List<IDefaultProfile> getDefaultProfiles() {
        return List.of(new WorldQLDefaultProfile());
    }
}
