package com.llamalad7.mixinextras.sugar.impl.ref.generated;

import com.llamalad7.mixinextras.sugar.ref.LocalRef;

public class LocalRefImpl<T> implements LocalRef<T> {
    private T value;
    private byte state;

    public LocalRefImpl() {
    }

    public LocalRefImpl(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return this.value;
    }

    @Override
    public void set(T value) {
        this.value = value;
    }
}
