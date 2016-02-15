package dev.maxgivno.projectchest.reference;

public class Names
{
    public static final class Blocks
    {
        public static final String PROJECT_CHEST = "projectchest";
    }

    public static final class Items
    {
        //public static final String ALCHEMICAL_BAG = "alchemicalBag";
    }

    public static final class NBT
    {
        public static final String ITEMS = "Items";
        public static final String MODE = "mode";
        public static final String CRAFTING_GUI_OPEN = "craftingGuiOpen";
        public static final String UUID_MOST_SIG = "UUIDMostSig";
        public static final String UUID_LEAST_SIG = "UUIDLeastSig";
        public static final String DISPLAY = "display";
        public static final String COLOR = "color";
        public static final String STATE = "teState";
        public static final String CUSTOM_NAME = "CustomName";
        public static final String DIRECTION = "teDirection";
        public static final String OWNER = "owner";
        public static final String OWNER_UUID_MOST_SIG = "ownerUUIDMostSig";
        public static final String OWNER_UUID_LEAST_SIG = "ownerUUIDLeastSig";
    }

    public static final class Containers
    {
        public static final String VANILLA_INVENTORY = "container.inventory";
        public static final String VANILLA_CRAFTING = "container.crafting";
        public static final String PROJECT_CHEST = "container.projectchest:" + Blocks.PROJECT_CHEST;

    }

    public static final class Keys
    {
        //public static final String CATEGORY = "key.categories.ee3";
        //public static final String CHARGE = "key.charge";
        //public static final String EXTRA = "key.extra";
        //public static final String RELEASE = "key.release";
        //public static final String TOGGLE = "key.toggle";
    }

    public static final class Commands
    {
        public static final String BASE_COMMAND = ModInfo.LOWERCASE_MOD_ID;
        public static final String RUN_TEST = "run-tests";
        public static final String DEBUG = "debug";
        public static final String ADMIN_PANEL = "admin";
    }
}
