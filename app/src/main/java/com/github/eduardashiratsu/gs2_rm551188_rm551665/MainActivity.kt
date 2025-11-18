package com.github.eduardashiratsu.gs2_rm551188_rm551665

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.LoginScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.MenuScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.IMCScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.screens.EquipeScreen
import com.github.eduardashiratsu.gs2_rm551188_rm551665.ui.theme.GSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()

            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->

                NavHost(
                    navController = navController,
                    startDestination = "login",
                    modifier = Modifier.padding(innerPadding)
                ) {

                    composable("login") {
                        LoginScreen(navController = navController)
                    }

                    composable("menu") {
                        MenuScreen(navController = navController)
                    }

                    composable("imc") {
                        IMCScreen(nav = navController)
                    }

                    composable("equipe") {
                        EquipeScreen(nav = navController)
                    }
                }
            }
        }
    }
}

