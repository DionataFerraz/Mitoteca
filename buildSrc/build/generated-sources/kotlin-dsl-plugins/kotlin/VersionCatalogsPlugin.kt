/**
 * Precompiled [version-catalogs.settings.gradle.kts][Version_catalogs_settings_gradle] script plugin.
 *
 * @see Version_catalogs_settings_gradle
 */
class VersionCatalogsPlugin : org.gradle.api.Plugin<org.gradle.api.initialization.Settings> {
    override fun apply(target: org.gradle.api.initialization.Settings) {
        try {
            Class
                .forName("Version_catalogs_settings_gradle")
                .getDeclaredConstructor(org.gradle.api.initialization.Settings::class.java, org.gradle.api.initialization.Settings::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
