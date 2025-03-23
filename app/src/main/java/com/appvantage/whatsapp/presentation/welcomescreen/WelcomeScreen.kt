package com.appvantage.whatsapp.presentation.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.appvantage.whatsapp.R
import com.appvantage.whatsapp.presentation.navigation.Routes

//@Preview(showBackground = true)
@Composable
fun WelcomeScreen(navHostController: NavHostController){

    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.Gray)){
            append("Read Our ")
        }
        withStyle(style = SpanStyle(color = colorResource(R.color.light_green))){
            append("Privacy Policy ")
        }
        withStyle(style = SpanStyle(color = Color.Gray)){
            append("Tap 'Agree and Continue' to \n")
        }
        withStyle(style = SpanStyle(color = Color.Gray)){
            append("accepts the ")
        }
        withStyle(style = SpanStyle(color = colorResource(R.color.light_green))){
            append("Terms of Services")
        }
    }

    Column (
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(R.drawable.whatsapp_sticker),
            contentDescription = null,
            modifier = Modifier.size(295.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Welcome to Whatsapp", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))


        Text(text = annotatedString,textAlign = TextAlign.Center, fontSize = 15.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {navHostController.navigate(Routes.UserRegistrationScreen)},
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.dark_green)
            )
        ){
            Text("Agree and Continue", fontSize = 16.sp)
        }

    }


}