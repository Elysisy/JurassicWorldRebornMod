package mod.reborn.server.plant;

import mod.reborn.server.block.BlockHandler;
import net.minecraft.block.Block;

/**
 * Created by Codyr on 11/11/2016.
 */
public class StylophyllopsisPlant extends Plant {
    @Override
    public String getName() { return "Stylophyllopsis"; }

    @Override
    public Block getBlock() {
        return BlockHandler.STYLOPHYLLOPSIS;
    }

    @Override
    public int getHealAmount() {
        return 2000;
    }
}
