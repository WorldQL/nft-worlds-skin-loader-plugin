# nft-worlds-skin-loader-plugin

NFT Worlds plugin for the MCCustomSkinLoader mod

## Configuration

My `loadlist` in `CustomSkinLoader.json` looks like this:

```json
[
  {
    "name": "NFT Worlds",
    "type": "WorldQLAPI",
    "root": "http://127.0.0.1:3000"
  },
  {
    "name": "Mojang",
    "type": "MojangAPI",
    "apiRoot": "https://api.mojang.com/",
    "sessionRoot": "https://sessionserver.mojang.com/"
  },
  {
    "name": "LocalSkin",
    "type": "Legacy",
    "checkPNG": false,
    "skin": "LocalSkin/skins/{USERNAME}.png",
    "model": "auto",
    "cape": "LocalSkin/capes/{USERNAME}.png",
    "elytra": "LocalSkin/elytras/{USERNAME}.png"
  }
]
```

To use this plugin, `gradle build` and copy the artifact from `build/libs/skin-loader-plugin-*.jar` to your `.minecraft/CustomSkinLoader/Plugins` folder.
