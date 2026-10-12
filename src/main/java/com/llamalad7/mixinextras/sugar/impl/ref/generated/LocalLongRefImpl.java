package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;

public class LocalLongRefImpl implements LocalLongRef {
    private long value;
    private byte state;

    public LocalLongRefImpl() {}
    public LocalLongRefImpl(long value) { this.value = value; }

    @Override public long get() { return this.value; }
    @Override public void set(long value) { this.value = value; }
}
