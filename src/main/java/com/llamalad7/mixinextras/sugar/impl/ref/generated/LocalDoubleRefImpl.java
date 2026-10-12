package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef;

public class LocalDoubleRefImpl implements LocalDoubleRef {
    private double value;
    private byte state;

    public LocalDoubleRefImpl() {}
    public LocalDoubleRefImpl(double value) { this.value = value; }

    @Override public double get() { return this.value; }
    @Override public void set(double value) { this.value = value; }
}
