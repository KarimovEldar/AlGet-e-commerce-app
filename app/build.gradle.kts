plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.alget_e_commerce_app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.alget_e_commerce_app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

val nav_version = "2.9.0"
val room_version = "2.7.1"
val lifecycle_version = "2.9.0"
val coroutine_version = "1.10.2"
val hilt_version = "2.56.2"

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui:$nav_version")

    //Room components
    implementation("androidx.room:room-runtime:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    androidTestImplementation("androidx.room:room-testing:$room_version")

    //Lifecycle components
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
//        implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'

    //Coroutine
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.8.22")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version")

    //Gson
    implementation("com.google.code.gson:gson:2.10.1")

    //Jsoup
    implementation("org.jsoup:jsoup:1.13.1")

    //Shimmer
    implementation("com.facebook.shimmer:shimmer:0.5.0")

    //DataStore
    implementation("androidx.datastore:datastore-preferences:1.1.0-alpha04")

    //Dagger - Hilt
    implementation("com.google.dagger:hilt-android:$hilt_version")
    kapt("com.google.dagger:hilt-android-compiler:$hilt_version")
    kapt("androidx.hilt:hilt-compiler:1.2.0")

    //Firebase
//        implementation platform('com.google.firebase:firebase-bom:32.2.3')
//        implementation 'com.google.firebase:firebase-auth-ktx:22.1.1'
//        implementation 'com.google.firebase:firebase-firestore-ktx:24.7.1'
//        implementation 'com.google.firebase:firebase-analytics-ktx:21.3.0'
//        implementation 'com.google.firebase:firebase-storage-ktx:20.2.1'

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")


    //Smooth Bottom Bar
//        implementation 'com.github.ibrahimsn98:SmoothBottomBar:1.7.9'

    //Coil (Image Loading library)
//        implementation "io.coil-kt:coil:2.4.0"

    //Image slide show
//        implementation 'com.github.denzcoskun:ImageSlideshow:0.1.2'

    //Payment
//        implementation "com.android.billingclient:billing:6.0.1"

    //Countries Code EditText
//        implementation 'com.hbb20:ccp:2.5.0'
//        implementation("com.github.leandroborgesferreira:loading-button-android:2.3.0")

    //PinView
//        implementation 'io.github.chaosleung:pinview:1.4.4'

    //Toggle Button
//        implementation 'com.github.GwonHyeok:StickySwitch:0.0.16'

    //Language
//        implementation 'com.akexorcist:localization:1.2.11'

//        implementation 'com.github.akshaaatt:Google-IAP:1.5.0'

}