package com.github.eduardashiratsu.gs2_rm551188_rm551665.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE9FFE9))
            .padding(32.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("MENU", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(24.dp))

            Button(
                onClick = { navController.navigate("imc") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Cálculo de IMC")
            }

            Spacer(Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("equipe") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Equipe")
            }

            Spacer(Modifier.height(16.dp))

            Button(
                onClick = { navController.navigate("login") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Sair")
            }
        }
    }
}
