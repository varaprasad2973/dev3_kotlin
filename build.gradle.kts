plugins{
    kotlin("jvm") version "2.0.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.13.2")
}

application{
    mainClass.set("org.example.MainKt")
}

tasks.test{
    useJUnit()

    testLogging{
        events("passed", "skipped", "failed")
        exceptionFormat=org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        showStandardStreams = true
    }
    outputs.upToDateWhen { false }
}
java{
    toolchain{
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
