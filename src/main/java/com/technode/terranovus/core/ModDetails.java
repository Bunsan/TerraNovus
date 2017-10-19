package com.technode.terranovus.core;

public class ModDetails {
    public static final String MOD_ID = "terranovus";
    public static final String MOD_NAME = "Terra Novus";

    public static final int VERSION_MAJOR = 0;
    public static final int VERSION_MINOR = 1;
    public static final int VERSION_REVISION = 0;

    public static final String VERSION = VERSION_MAJOR + "." + VERSION_MINOR + "." + VERSION_REVISION;

    public static final String RESOURCE_MOD_ID = MOD_ID.toLowerCase();
    public static final String MOD_PREFIX = RESOURCE_MOD_ID + ":";

    public static final String DEPENDENCIES = "required-after:Forge@[14.23.0.2491,)";
    public static final String MOD_CHANNEL = "terranovus";

    public static final String SERVER_PROXY = "com.technode.terranovus.core.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "com.technode.terranovus.core.proxy.ClientProxy";

    public static final String DESC = "desc." + MOD_ID + ".";
    public static final String DESC_INFO = DESC+"info.";
    public static final String DESC_FLAVOUR = DESC+"flavour.";

    public static final String GUI = "gui." + MOD_ID + ".";
    public static final String GUI_CONFIG = "gui." + MOD_ID + ".config.";
    public static final String AssetPath = "/assets/" + MOD_ID + "/";
    public static final String AssetPathGui = "textures/gui/";

    public static final String ConfigFilePath = "/config/";
    public static final String ConfigFileName = "TerraNovus.cfg";
}
