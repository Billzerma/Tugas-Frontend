package com.example.tugasss.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object Course: Screen("course")
    data object Detail: Screen("detail_mentors")
    data object DetailMap: Screen("detail_map")
}