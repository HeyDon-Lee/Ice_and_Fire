package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityMyrmexBase;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public abstract class ModelMyrmexBase extends ModelDragonBase {
    private static final ModelMyrmexLarva LARVA_MODEL = new ModelMyrmexLarva();
    private static final ModelMyrmexPupa PUPA_MODEL = new ModelMyrmexPupa();

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityMyrmexBase myrmex = (EntityMyrmexBase) entity;
        if (myrmex.getGrowthStage() == 0) {
            LARVA_MODEL.render(entity, f, f1, f2, f3, f4, f5);
        } else if (myrmex.getGrowthStage() == 1) {
            PUPA_MODEL.render(entity, f, f1, f2, f3, f4, f5);
        } else {
            renderAdult(entity, f, f1, f2, f3, f4, f5);
        }
    }

    public abstract void renderAdult(Entity entity, float f, float f1, float f2, float f3, float f4, float f5);
}
