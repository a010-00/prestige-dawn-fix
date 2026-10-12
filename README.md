# prestige-dawn-fix

Quick fix for Prestige crashing on inject with `ClassNotFoundException: com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl` on clients that use MixinExtras `@Local` (like Feather/Dawn).

![preview](preview.png)

## Why this happens

MixinExtras creates its `LocalRef` classes directly in memory at runtime instead of shipping them inside a jar. When Prestige tries to retransform hooked classes (like `Mouse`), its injector looks for the actual `.class` file on disk to calculate stack frames, finds nothing, and throws:

```text
Failed to transform class 'net.minecraft.class_312'
java.lang.ClassNotFoundException: com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
    at PrestigeClassLoader//net.lenni0451.classtransform.utils.tree.BasicClassProvider.getClass(...)
    at PrestigeClassLoader//net.lenni0451.classtransform.utils.tree.ClassTree.getTreePart(...)
    at PrestigeClassLoader//net.lenni0451.classtransform.utils.tree.TreeClassWriter.getCommonSuperClass(...)
```
This mod just bundles dummy `.class` stubs for those generated types so the classloader actually finds them on disk and ASM can finish computing frames without blowing up.

## Setup

1. Grab `prestige-dawn-fix-1.0.0.jar` from `release/`.
2. Drop it in your `mods/` directory.
3. Start the game and inject.

## Building from source

Requires JDK 17+.

The interfaces in `sugar/ref/` are just copied from [MixinExtras](https://github.com/LlamaLad7/MixinExtras) so you can compile with standard `javac` without setting up Gradle.

Windows:
```cmd
build.bat
```

Built jar is saved to `release/prestige-dawn-fix-1.0.0.jar`.

## License

MIT
