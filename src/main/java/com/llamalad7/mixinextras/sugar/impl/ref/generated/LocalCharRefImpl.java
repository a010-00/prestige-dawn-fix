package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalCharRef;

public class LocalCharRefImpl implements LocalCharRef {
    private char value;
    private byte state;

    public LocalCharRefImpl() {}
    public LocalCharRefImpl(char value) { this.value = value; }

    @Override public char get() { return this.value; }
    @Override public void set(char value) { this.value = value; }
}
