package io.thedogofchaos.CropsNCogsCore.util;

import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import io.thedogofchaos.CropsNCogsCore.CropsNCogsCore;
import io.thedogofchaos.CropsNCogsCore.block.OreCropBlock;
import io.thedogofchaos.CropsNCogsCore.organic.Crop;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;

public class BlockStateUtils {
    public static void threeTextureCropCross(VariantBlockStateBuilder variantBuilder, RegistrateBlockstateProvider provider, Crop crop, CropBlock cropBlock) {
        variantBuilder.forAllStates(state -> cropStates(state, provider, crop, cropBlock));
    }

    private static ConfiguredModel[] cropStates(BlockState state, RegistrateBlockstateProvider provider, Crop crop, CropBlock cropBlock) {
        int cropAge = state.getValue(((OreCropBlock) cropBlock).getAgeProperty());
        String textureSetName = crop.getCropInfo().getTextures().getTextureSetName();
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(
                provider.models().withExistingParent(crop.getCropNameWithSuffix("crop_age") + cropAge, new ResourceLocation(CropsNCogsCore.MOD_ID, "block/plant_assets/flower_crop_cross"))
                        .texture("flower", "block/plant_assets/crop/1_tall/" + textureSetName + "/age" + cropAge + "/flower")
                        .texture("pistil", "block/plant_assets/crop/1_tall/" + textureSetName + "/age" + cropAge + "/pistil")
                        .texture("stem", "block/plant_assets/crop/1_tall/" + textureSetName + "/age" + cropAge + "/stem")
        );
        return models;
    }
}
