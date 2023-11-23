package com.maronworks.aboutme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maronworks.aboutme.navigation.NavGraphSetup

@Composable
fun ItsAboutMe() {
    val navController = rememberNavController()

    NavGraphSetup(navController = navController)
}
