package net.saoirse.saoirsemod.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Bootstrap;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> PAGAN_T1_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t1"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> PAGAN_T2_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t2"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> PAGAN_T3_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t3"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> PAGAN_T4_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t4"));

    public static final ResourceKey<ConfiguredFeature<?, ?>> PAGAN_T5_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, "pagan_t5"));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){


        // T1
        register(context, PAGAN_T1_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PAGAN_T1_LOG.get()),
                new StraightTrunkPlacer(5,4,3), //height randA randB

                BlockStateProvider.simple(ModBlocks.PAGAN_T1_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(3), 4),
                new TwoLayersFeatureSize(1, 0, 3)).build());


        // T2
                register(context, PAGAN_T2_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                        BlockStateProvider.simple(ModBlocks.PAGAN_T2_LOG.get()),
                        new StraightTrunkPlacer(5,4,3), //height randA randB

                        BlockStateProvider.simple(ModBlocks.PAGAN_T2_LEAVES.get()),
                        new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(3), 4),
                        new TwoLayersFeatureSize(1, 0, 2)).build());


        // T3
        register(context, PAGAN_T3_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PAGAN_T3_LOG.get()),
                new StraightTrunkPlacer(5,4,3), //height randA randB

                BlockStateProvider.simple(ModBlocks.PAGAN_T3_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(3), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());


        // T4
        register(context, PAGAN_T4_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PAGAN_T4_LOG.get()),
                new StraightTrunkPlacer(5,4,3), //height randA randB

                BlockStateProvider.simple(ModBlocks.PAGAN_T4_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(3), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());


        // T5
        register(context, PAGAN_T5_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PAGAN_T5_LOG.get()),
                new StraightTrunkPlacer(5,4,3), //height randA randB

                BlockStateProvider.simple(ModBlocks.PAGAN_T5_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(3), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE,
                ResourceLocation.fromNamespaceAndPath(TheDarkCarnival.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>>
    void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                  ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
