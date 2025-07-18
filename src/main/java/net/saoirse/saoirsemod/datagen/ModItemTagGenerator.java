package net.saoirse.saoirsemod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.saoirse.saoirsemod.TheDarkCarnival;
import net.saoirse.saoirsemod.block.ModBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper){
        super(p_275343_, p_275729_, p_275322_, TheDarkCarnival.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.LOGS)
                .add(ModBlocks.PAGAN_T1_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T2_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T3_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T4_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T5_LOG.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PAGAN_T1_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T2_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T3_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T4_LOG.get().asItem())
                .add(ModBlocks.PAGAN_T5_LOG.get().asItem())

                .add(ModBlocks.PAGAN_T1_WOOD.get().asItem())
                .add(ModBlocks.PAGAN_T2_WOOD.get().asItem())
                .add(ModBlocks.PAGAN_T3_WOOD.get().asItem())
                .add(ModBlocks.PAGAN_T4_WOOD.get().asItem())
                .add(ModBlocks.PAGAN_T5_WOOD.get().asItem())

                .add(ModBlocks.STRIPPED_PAGAN_T1_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T2_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T3_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T4_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T5_LOG.get().asItem())

                .add(ModBlocks.STRIPPED_PAGAN_T1_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T2_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T3_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T4_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PAGAN_T5_WOOD.get().asItem())
                ;

        // don't add leaves/logs here


        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.PAGAN_T1_PLANKS.get().asItem())
                .add(ModBlocks.PAGAN_T2_PLANKS.get().asItem())
                .add(ModBlocks.PAGAN_T3_PLANKS.get().asItem())
                .add(ModBlocks.PAGAN_T4_PLANKS.get().asItem())
                .add(ModBlocks.PAGAN_T5_PLANKS.get().asItem())
        ;

    }
}
