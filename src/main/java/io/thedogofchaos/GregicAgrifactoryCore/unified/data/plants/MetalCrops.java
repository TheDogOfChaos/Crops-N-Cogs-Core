package io.thedogofchaos.GregicAgrifactoryCore.unified.data.plants;

import io.thedogofchaos.GregicAgrifactoryCore.organic.Crop;
import io.thedogofchaos.GregicAgrifactoryCore.organic.CropTextures;
import net.minecraft.resources.ResourceLocation;

import static io.thedogofchaos.GregicAgrifactoryCore.GregicAgrifactoryCore.id;
import static io.thedogofchaos.GregicAgrifactoryCore.unified.data.ModPlants.*;

public class MetalCrops {
    public static void init() {
        // Vanilla
        Gold = new Crop.Builder(id("gold"))
                .setTextures(CropTextures.DEBUG)
                .setFlowerColor(0xfdf55f)
                .setPistilColor(0xf25833)
                .buildAndRegister();
        // GregTech
        Magnetite = new Crop.Builder(id("magnetite"))
                .setTextures(CropTextures.DEBUG)
                .setFlowerColor(0x9d9d9d)
                .setPistilColor(0x06070e)
                .buildAndRegister();
        Chalcopyrite = new Crop.Builder(id("chalcopyrite"))
                .setTextures(CropTextures.DEBUG)
                .setFlowerColor(0x96c185)
                .setPistilColor(0xe3af1a)
                .buildAndRegister();
    }
}
