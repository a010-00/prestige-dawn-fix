package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalShortRef;

public class LocalShortRefImpl implements LocalShortRef {
    private short value;
    private byte state;

    public LocalShortRefImpl() {}
    public LocalShortRefImpl(short value) { this.value = value; }

    @Override public short get() { return this.value; }
    @Override public void set(short value) { this.value = value; }
}
