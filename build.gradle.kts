// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    //allprojects <repositories<jcenter() google()>.>
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    kotlin("kapt") version "2.2.21"
}