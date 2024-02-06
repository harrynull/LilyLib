/*
 * Copyright (C) 2024 Provismet
 * 
 * See https://github.com/Provismet/LilyLib/blob/1.20/LICENSE for the full license.
 */

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
