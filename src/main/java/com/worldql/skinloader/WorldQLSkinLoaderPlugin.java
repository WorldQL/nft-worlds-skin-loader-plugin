package com.worldql.skinloader;

import customskinloader.CustomSkinLoader;
import customskinloader.loader.ProfileLoader;
import customskinloader.plugin.ICustomSkinLoaderPlugin;

import java.util.List;

public class WorldQLSkinLoaderPlugin implements ICustomSkinLoaderPlugin {
    public WorldQLSkinLoaderPlugin() {
        CustomSkinLoader.logger.debug("Loaded WorldQL skin loader plugin!");
    }

    @Override
    public ProfileLoader.IProfileLoader getProfileLoader() {
        return new WorldQLProfileLoader();
    }

    @Override
    public List<IDefaultProfile> getDefaultProfiles() {
        return List.of(new WorldQLDefaultProfile());
    }
}
