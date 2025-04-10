package com.Alvin390.myapplication.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calculator_screen(navController: NavHostController) {
        var fnum by remember { mutableStateOf(TextFieldValue("")) }
        var snum by remember { mutableStateOf(TextFieldValue("")) }
        var answer by remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            ) { 
        Text(
            text = "Calculator",
            color = Color.Green,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace
        )

        OutlinedTextField(value = fnum, onValueChange = {fnum=it},
            label = { Text(text = "Enter First Number",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "First Number") },
        )
        OutlinedTextField(value = snum, onValueChange = {snum=it},
            label = { Text(text = "Enter Second Number",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            placeholder = { Text(text = "Second Number") },
        )
        Text(text = "= $answer ",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.Start)

        )
        OutlinedButton(onClick = {
            val myfnum=fnum.text.trim()
            val mysnum=snum.text.trim()
            if (myfnum.isEmpty()or mysnum.isEmpty()){
                answer="Please Enter Both Numbers"
            }
            else{
                answer=((myfnum.toDouble()+mysnum.toDouble())).toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "+",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
                )

        }
        OutlinedButton(onClick = {
            val myfnum=fnum.text.trim()
            val mysnum=snum.text.trim()
            if (myfnum.isEmpty()or mysnum.isEmpty()){
                answer="Please Enter Both Numbers"
            }
            else{
                answer=((myfnum.toDouble()/mysnum.toDouble())).toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "/",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
        OutlinedButton(onClick = {
            val myfnum=fnum.text.trim()
            val mysnum=snum.text.trim()
            if (myfnum.isEmpty()or mysnum.isEmpty()){
                answer="Please Enter Both Numbers"
            }
            else{
                answer=((myfnum.toDouble()-mysnum.toDouble())).toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "-",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }
        OutlinedButton(onClick = {
            val myfnum=fnum.text.trim()
            val mysnum=snum.text.trim()
            if (myfnum.isEmpty()or mysnum.isEmpty()){
                answer="Please Enter Both Numbers"
            }
            else{
                answer=((myfnum.toDouble()*mysnum.toDouble())).toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "*",
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp,
                color = Color.Black,
            )

        }

    }
}

@Preview
@Composable
private fun calc_prev() {
    Calculator_screen(rememberNavController())
}