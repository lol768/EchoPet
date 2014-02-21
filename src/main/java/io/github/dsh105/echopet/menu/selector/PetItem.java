package io.github.dsh105.echopet.menu.selector;

import io.github.dsh105.echopet.entity.PetType;
import org.bukkit.Material;


public enum PetItem {

    BAT(PetType.BAT, Material.getMaterial(383), (short) 65, "Bat Pet", "bat"),
    BLAZE(PetType.BLAZE, Material.getMaterial(383), (short) 61, "Blaze Pet", "blaze"),
    CAVESPIDER(PetType.CAVESPIDER, Material.getMaterial(383), (short) 59, "Cave Spider Pet", "cavespider"),
    CHICKEN(PetType.CHICKEN, Material.getMaterial(383), (short) 93, "Chicken Pet", "chicken"),
    COW(PetType.COW, Material.getMaterial(383), (short) 92, "Cow Pet", "cow"),
    CREEPER(PetType.CREEPER, Material.getMaterial(383), (short) 50, "Creeper Pet", "creeper"),
    ENDERDRAGON(PetType.ENDERDRAGON, Material.getMaterial(122), (short) 0, "EnderDragon Pet", "enderdragon"),
    ENDERMAN(PetType.ENDERMAN, Material.getMaterial(383), (short) 58, "Enderman Pet", "enderman"),
    GHAST(PetType.GHAST, Material.getMaterial(383), (short) 56, "Ghast Pet", "ghast"),
    GIANT(PetType.GIANT, Material.getMaterial(383), (short) 54, "Giant Pet", "giant"),
    HORSE(PetType.HORSE, Material.getMaterial(383), (short) 100, "Horse Pet", "horse"),
    HUMAN(PetType.HUMAN, Material.SKULL_ITEM, (short) 3, "Human Pet", "human"),
    IRONGOLEM(PetType.IRONGOLEM, Material.getMaterial(86), (short) 0, "Iron Golem Pet", "irongolem"),
    MAGMACUBE(PetType.MAGMACUBE, Material.getMaterial(383), (short) 62, "Magma Cube Pet", "magmacube"),
    MUSHROOMCOW(PetType.MUSHROOMCOW, Material.getMaterial(383), (short) 96, "Mushroom Cow Pet", "mushroomcow"),
    OCELOT(PetType.OCELOT, Material.getMaterial(383), (short) 98, "Ocelot Pet", "ocelot"),
    PIG(PetType.PIG, Material.getMaterial(383), (short) 90, "Pig Pet", "pig"),
    PIGZOMBIE(PetType.PIGZOMBIE, Material.getMaterial(383), (short) 57, "PigZombie Pet", "pigzombie"),
    SHEEP(PetType.SHEEP, Material.getMaterial(383), (short) 91, "Sheep Pet", "sheep"),
    SILVERFISH(PetType.SILVERFISH, Material.getMaterial(383), (short) 60, "Silverfish Pet", "silverfish"),
    SKELETON(PetType.SKELETON, Material.getMaterial(383), (short) 51, "Skeleton Pet", "skeleton"),
    SLIME(PetType.SLIME, Material.getMaterial(383), (short) 55, "Slime Pet", "slime"),
    SNOWMAN(PetType.SNOWMAN, Material.getMaterial(332), (short) 0, "Snowman Pet", "snowman"),
    SPIDER(PetType.SPIDER, Material.getMaterial(383), (short) 52, "Spider Pet", "spider"),
    SQUID(PetType.SQUID, Material.getMaterial(383), (short) 94, "Squid Pet", "squid"),
    VILLAGER(PetType.VILLAGER, Material.getMaterial(383), (short) 120, "Villager Pet", "villager"),
    WITCH(PetType.WITCH, Material.getMaterial(383), (short) 66, "Witch Pet", "witch"),
    WITHER(PetType.WITHER, Material.getMaterial(399), (short) 0, "Wither Pet", "wither"),
    WOLF(PetType.WOLF, Material.getMaterial(383), (short) 95, "Wolf Pet", "wolf"),
    ZOMBIE(PetType.ZOMBIE, Material.getMaterial(383), (short) 54, "Zombie Pet", "zombie");

    private String cmd;
    public PetType petType;
    private Material mat;
    private short data;
    private String name;

    PetItem(PetType petType, Material mat, short data, String name, String cmd) {
        this.cmd = "pet " + cmd;
        this.petType = petType;
        this.mat = mat;
        this.data = data;
        this.name = name;
    }

    public String getCommand() {
        return cmd;
    }

    public PetType getPetType() {
        return petType;
    }

    public Material getMat() {
        return mat;
    }

    public short getData() {
        return data;
    }

    public String getName() {
        return name;
    }
}