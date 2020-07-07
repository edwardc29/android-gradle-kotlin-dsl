const val kotlinVersion = "1.3.72"

object Build {
    object Versions {
        const val buildToolsVersion = "4.0.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
}

object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
    const val buildToolsVersion = "29.0.3"
}

object Libraries {
    private object Versions {
        const val ktx = "1.3.0"
        const val appCompat = "1.1.0"
        const val constraintLayout = "1.1.3"
        const val glide = "4.11.0"

        const val junit = "4.13"
        const val androidxJunit = "1.1.1"
        const val androidxEspressoCore = "3.2.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val coreKtx = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.core:core-ktx:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val junit = "com.github.bumptech.glide:glide:${Versions.junit}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
    const val androidxEspressoCore = "androidx.test.espresso:espresso-core:${Versions.androidxEspressoCore}"
}