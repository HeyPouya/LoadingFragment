plugins {
    id("com.android.library")
    id("kotlin-android")
    `maven-publish`
}

android {
    compileSdk = 33
    defaultConfig {
        minSdk = 16
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures { viewBinding = true }
    namespace = "ir.heydarii.androidloadingfragment"
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
    //Lottie
    implementation("com.airbnb.android:lottie:3.4.0")

    //Test Libraries
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test:runner:1.5.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.pouyaheydari.loading"
            artifactId = "main"
            version = "2.0.0"
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

