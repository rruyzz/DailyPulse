plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)

}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }
    iosArm64()
    iosX64()
    iosSimulatorArm64()
    sourceSets {
//        commonMain.dependencies {
//            //put your multiplatform dependencies here
//        }
//        commonTest.dependencies {
//            implementation(libs.kotlin.test)
//        }

        val commonMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.androidx.lifecycle.viewmodel.ktx)
            }
        }

        val iosArm64Main by getting {
            dependencies {
            }
        }
        val iosArm64Test by getting {
            dependencies {
            }
        }
        val iosX64Main by getting {
            dependencies {
            }
        }
        val iosSimulatorArm64Main by getting {
            dependencies {
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "com.rodolforuiz.dailypulse"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}
