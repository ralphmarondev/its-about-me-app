package com.maronworks.aboutme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maronworks.aboutme.R
import com.maronworks.aboutme.navigation.Screens
import com.maronworks.aboutme.screens.home.components.CardComponent

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavHostController
) {
    Scaffold(
        topBar = {
            TopBarComponent(navController = navController)
        },
        bottomBar = {
            BottomBarComponent(navController = navController)
        }
    ) { padding ->
        Contents(padding = padding)
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopBarComponent(
    navController: NavHostController
) {
    TopAppBar(
        title = {
            Text(text = "Its About Me")
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = ""
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.MailOutline,
                    contentDescription = ""
                )
            }
        }
    )
}

@Preview
@Composable
fun default_prev() {
    val navController = rememberNavController()

//    Column(
//        modifier = Modifier.wrapContentSize()
//    ) {
//        TopBarComponent(navController = navController)
//        Spacer(modifier = Modifier.height(50.dp))
//        BottomBarComponent(navController = navController)
//    }
    HomeScreen(navController = navController)
}

@Composable
private fun BottomBarComponent(
    navController: NavHostController
) {
    BottomAppBar {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = ""
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = ""
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = ""
                )
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = ""
                )
            }

            IconButton(onClick = { navController.navigate(Screens.Profile.Route) }) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = ""
                )
            }
        }
    }
}

@Composable
private fun Contents(
    padding: PaddingValues
) {
    Column(
        modifier = Modifier
            .padding(padding)
            .verticalScroll(rememberScrollState())
    ) {
        repeat(3) {
            CardComponent(
                profileImg = R.drawable.profile,
                name = "Cutie Name",
                postImg = R.drawable.post
            )
        }
    }
}
