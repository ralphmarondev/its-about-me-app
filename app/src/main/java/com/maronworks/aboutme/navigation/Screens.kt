package com.maronworks.aboutme.navigation

sealed class Screens(var Route: String){
    object Home: Screens("home_screen")
    object Profile: Screens("profile_screen")
}
