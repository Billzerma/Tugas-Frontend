package com.example.tugasss.present

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasss.R
import com.example.tugasss.navigation.NavigationItem
import com.example.tugasss.navigation.Screen
import com.example.tugasss.present.component.shareItem


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TriviaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Elden Ring Trivis") },
                actions = {
                    IconButton(onClick = { shareItem(context) }) {
                        Icon(
                            imageVector = Icons.Default.Share, contentDescription = stringResource(
                                id = R.string.menu_share
                            )
                        )
                    }
                }
            )
        },

        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Gallery.route) {
                WeaponScreen()
            }

            composable(Screen.Course.route) {
               About()
            }

            composable(
                Screen.Detail.route + "/{bossId}",
                arguments = listOf(navArgument("bossId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailBoss(
                    navController = navController,
                    bossId = navBackStackEntry.arguments?.getInt("bossId")
                )
            }
            composable(
                Screen.DetailMap.route + "/{mapId}",
                arguments = listOf(navArgument("mapId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailMap(
                    navController = navController,
                    mapId = navBackStackEntry.arguments?.getInt("mapId")
                )
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_weapon),
                icon = Icons.Default.BrowseGallery,
                screen = Screen.Gallery
            ),
            NavigationItem(
                title = stringResource(id = R.string.about),
                icon = Icons.Default.Topic,
                screen = Screen.Course
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TriviaAppPrev() {
   TriviaApp()
}