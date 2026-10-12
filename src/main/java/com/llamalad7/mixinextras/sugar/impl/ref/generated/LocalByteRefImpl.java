package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalByteRef;

public class LocalByteRefImpl implements LocalByteRef {
    private byte value;
    private byte state;

    public LocalByteRefImpl() {}
    public LocalByteRefImpl(byte value) { this.value = value; }

    @Override public byte get() { return this.value; }
    @Override public void set(byte value) { this.value = value; }
}
