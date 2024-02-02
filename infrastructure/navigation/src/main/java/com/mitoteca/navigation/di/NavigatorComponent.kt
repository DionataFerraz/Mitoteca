package com.mitoteca.navigation.di

import com.mitoteca.home.presentation.navigation.HomeNavigator
import br.com.jarvis.scopes.AppScope
import com.squareup.anvil.annotations.ContributesTo

@ContributesTo(AppScope::class)
interface NavigatorComponent {
    fun homeNavigator(): HomeNavigator
}