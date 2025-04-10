package com.Alvin390.myapplication.ui.theme.screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
fun intent_screen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Text(
            text = "Intent Screen",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
        )

        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Email",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "SMS",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Dial",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Camera",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )
        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Share",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )
        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "STK",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(
                text = "Call",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
    }
}

@Preview
@Composable
private fun intent_prev() {
    intent_screen(rememberNavController())
}
