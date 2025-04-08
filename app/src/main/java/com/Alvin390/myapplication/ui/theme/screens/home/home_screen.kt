package com.Alvin390.myapplication.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Alvin390.myapplication.navigation.ROUTE_CALC
import com.Alvin390.myapplication.navigation.ROUTE_INTENT
import com.Alvin390.myapplication.navigation.ROUTE_WEB

@Composable
fun home_screen(navController:NavHostController) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            text = "Home Screen",
            modifier = Modifier.padding(16.dp),
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
        Button(
            onClick = {navController.navigate(ROUTE_CALC)},
            modifier = Modifier
                .width(300.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )

        }
        Button(
            onClick = {navController.navigate(ROUTE_WEB)},
            modifier = Modifier
                .width(300.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Cyan,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Web",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )

        }
        Button(
            onClick = {navController.navigate(ROUTE_INTENT)},
            modifier = Modifier
                .width(300.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Intent",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive
            )

        }
    }


}
@Preview
@Composable
private fun home_prev() {
    home_screen(rememberNavController())
}