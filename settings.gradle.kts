rootProject.name = "gradle-scripts-ktlint"

apply {
    from("$rootDir/gradle/scripts/settings-flags.gradle")
}

val includeWithFlags: org.codehaus.groovy.runtime.MethodClosure by extra

includeWithFlags(":grpc-app", "java", "kotlin", "kotlin-grpc")
