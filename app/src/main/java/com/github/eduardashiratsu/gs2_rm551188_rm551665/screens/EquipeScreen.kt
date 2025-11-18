package com.github.eduardashiratsu.gs2_rm551188_rm551665.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun EquipeScreen(nav: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0FFF5))
            .padding(32.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text("Equipe", style = MaterialTheme.typography.headlineMedium)
            Spacer(Modifier.height(24.dp))

            Text("• Eduarda Shiratsu – RM551188")
            Text("• Felipe Cortez – RM551665")

            Spacer(Modifier.height(32.dp))

            Button(onClick = { nav.popBackStack() }) {
                Text("Voltar")
            }
        }
    }
}
