package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;

public class LocalFloatRefImpl implements LocalFloatRef {
    private float value;
    private byte state;

    public LocalFloatRefImpl() {}
    public LocalFloatRefImpl(float value) { this.value = value; }

    @Override public float get() { return this.value; }
    @Override public void set(float value) { this.value = value; }
}
