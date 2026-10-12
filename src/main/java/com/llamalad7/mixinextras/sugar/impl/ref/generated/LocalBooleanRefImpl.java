package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;

public class LocalBooleanRefImpl implements LocalBooleanRef {
    private boolean value;
    private byte state;

    public LocalBooleanRefImpl() {}
    public LocalBooleanRefImpl(boolean value) { this.value = value; }

    @Override public boolean get() { return this.value; }
    @Override public void set(boolean value) { this.value = value; }
}
