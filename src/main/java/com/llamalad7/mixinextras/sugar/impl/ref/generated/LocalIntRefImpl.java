package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;

public class LocalIntRefImpl implements LocalIntRef {
    private int value;
    private byte state;

    public LocalIntRefImpl() {}
    public LocalIntRefImpl(int value) { this.value = value; }

    @Override public int get() { return this.value; }
    @Override public void set(int value) { this.value = value; }
}
