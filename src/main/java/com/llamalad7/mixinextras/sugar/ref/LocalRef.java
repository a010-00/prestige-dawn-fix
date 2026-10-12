package com.llamalad7.mixinextras.sugar.ref;

public interface LocalRef<T> {
    T get();
    void set(T value);
}