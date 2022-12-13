plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 33
    defaultConfig {
        applicationId = "ir.heydarii.loadingfragment"
        minSdk = 16
        targetSdk = 33
        versionCode = 200
        versionName = "2.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures { viewBinding = true }
    namespace = "ir.heydarii.loadingfragment"
}

dependencies {

    //LoadingFragment library
    implementation(project(":androidloadingfragment"))

    //support library
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    //test libraries
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test:runner:1.5.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
}
