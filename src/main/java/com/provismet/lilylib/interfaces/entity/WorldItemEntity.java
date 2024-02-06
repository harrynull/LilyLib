package com.provismet.lilylib.interfaces.entity;

import net.minecraft.entity.FlyingItemEntity;

public interface WorldItemEntity extends FlyingItemEntity {
    public default float getXRotation (float tickDelta) {
        return 0f;
    }

    public default float getYRotation (float tickDelta) {
        return 0f;
    }

    public default float getZRotation (float tickDelta) {
        return 0f;
    }

    public default float getXOffset (float tickDelta) {
        return 0f;
    }
    
    public default float getYOffset (float tickDelta) {
        return 0f;
    }
    
    public default float getZOffset (float tickDelta) {
        return 0f;
    }
}
