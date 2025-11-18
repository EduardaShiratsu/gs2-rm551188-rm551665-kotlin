package com.github.eduardashiratsu.gs2_rm551188_rm551665.navigation

import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.LoginScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.MenuScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.IMCScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.EquipeScreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable



@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("menu") {
            MenuScreen(navController)
        }

        composable("imc") {
            IMCScreen(navController)
        }

        composable("equipe") {
            EquipeScreen(navController)
        }
    }
}
