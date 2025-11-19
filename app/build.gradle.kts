import com.android.build.gradle.internal.utils.isKotlinKaptPluginApplied
import org.gradle.kotlin.dsl.annotationProcessor
//import org.jetbrains.kotlin.fir.expressions.FirEmptyArgumentList.arguments



plugins {

    //id 'kotlin-kapt'
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    kotlin("kapt") version "2.2.21"
}

android {
    namespace = "com.example.smartshoppinglist"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.smartshoppinglist"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

      /*
      kapt{
            arguments{arg("room.schemaLocation", "$projectDir/schemas")}
        }*/
    }

   /* kapt {
        arguments {
            arg("key", "value")
        }
    }*/

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
    buildFeatures {
        compose = true
    }
}

/*kapt {
    arguments {
        arg("key", "value")
    }
}*/

dependencies {
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.2")

    implementation ("com.squareup.retrofit2:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:3.0.0")

    implementation("com.google.dagger:hilt-android:2.57.2")
    annotationProcessor ("com.google.dagger:hilt-compiler:2.57.2")

    kapt ("groupId:artifactId:version")

    androidTestImplementation  ("com.google.dagger:hilt-android-testing:2.57.2")
    androidTestAnnotationProcessor ("com.google.dagger:hilt-compiler:2.57.2")

    testImplementation ("com.google.dagger:hilt-android-testing:2.57.2")
    testAnnotationProcessor ("com.google.dagger:hilt-compiler:2.57.2")

//    def nav_version = "2.5.3"
 //   implementation ("android.arch.navigation:navigation-fragment-ktx:$nav_version")
  //  implementation ("android.arch.navigation:navigation-ui-ktx:$nav_version")
//*/
    implementation(libs.androidx.room.ktx)


    //implementation(libs.)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}