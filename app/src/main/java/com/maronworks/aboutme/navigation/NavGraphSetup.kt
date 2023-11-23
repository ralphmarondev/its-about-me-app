package com.maronworks.aboutme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.maronworks.aboutme.screens.home.HomeScreen
import com.maronworks.aboutme.screens.profile.ProfileScreen

@Composable
fun NavGraphSetup(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.Route
    ) {
        composable(Screens.Home.Route) {
            HomeScreen(navController = navController)
        }
        composable(Screens.Profile.Route) {
            ProfileScreen(navController = navController)
        }
    }
}
