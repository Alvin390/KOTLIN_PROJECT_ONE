package com.Alvin390.myapplication.ui.theme.screens.web

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun web_screen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "Web Screen",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Youtube",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )
        }
    }
}

@Preview
@Composable
private fun web_prev() {
    web_screen(rememberNavController())
}
