<div align="center">

# LilyLib
[![](https://img.shields.io/jitpack/version/com.github.Provismet/LilyLib?style=flat-square&logo=jitpack&color=F6F6F6)](https://jitpack.io/#Provismet/LilyLib)

</div>

I've started needing to reuse some of my modding code, so now I need a library I guess.

## License
The library is license GNU-LGPL, so feel free to use it and package it with a mod. Though I have no idea why anyone would want to.

## Dependency
Add to your build.gradle
```gradle
repositories {
    maven {
        url "https://jitpack.io"
    }
}
```

```gradle
dependencies {
    modImplementation "com.github.provismet:lilylib:${project.lilylib_version}"
    include "com.github.provismet:lilylib:${project.lilylib_version}"
}
```

Where `${project.lilylib_version}` can either be replaced with a release tag, or you can define a `lilylib_version` parameter in your gradle.properties file.

Check the [Jitpack.io](https://jitpack.io/#Provismet/LilyLib) page for working builds.
