
import org.gradle.api.initialization.dsl.VersionCatalogBuilder

fun VersionCatalogBuilder.addDependencies() {
    val moshi = "1.13.0"
    val moshiReflect = "1.10.0"

    library("moshi-core", "com.squareup.moshi:moshi:$moshi")
    // moshi-reflect should ONLY be used in test environment
    library("moshi-reflect", "com.squareup.moshi:moshi-kotlin:$moshiReflect")
    library("moshi-codeGen", "com.squareup.moshi:moshi-kotlin-codegen:$moshi")
}