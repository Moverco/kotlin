import org.jetbrains.kotlin.gradle.dsl.Coroutinesapply {    plugin("kotlin")}dependencies {    compile(project(":kotlin-script-runtime"))    compile(project(":kotlin-scripting-jvm-host"))    compile(project(":kotlin-script-util"))    compile(projectDist(":kotlin-stdlib"))    compile(projectDist(":kotlin-reflect"))    compileOnly(project(":compiler:util"))    runtime(projectDist(":kotlin-compiler"))    testCompile(commonDep("junit"))    testRuntime("com.jcabi:jcabi-aether:0.10.1")    testRuntime("org.sonatype.aether:aether-api:1.13.1")    testRuntime("org.apache.maven:maven-core:3.0.3")}sourceSets {    "main" { projectDefault() }    "test" { projectDefault() }}kotlin {    experimental.coroutines = Coroutines.ENABLE}