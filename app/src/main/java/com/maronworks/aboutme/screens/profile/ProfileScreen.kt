package com.maronworks.aboutme.screens.profile

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ProfileScreen(
    navController: NavHostController
) {
    Card {
        Text(text = "Profile Screen")

        Spacer(modifier = Modifier.height(50.dp))

        ElevatedButton(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Back to Home")
        }
    }

}
