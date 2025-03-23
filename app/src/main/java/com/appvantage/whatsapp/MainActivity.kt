package com.appvantage.whatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import com.appvantage.whatsapp.presentation.callscreen.CallScreen
import com.appvantage.whatsapp.presentation.communityscreen.CommunityScreen
import com.appvantage.whatsapp.presentation.homescreen.ChatDesign
import com.appvantage.whatsapp.presentation.homescreen.HomeScreen
import com.appvantage.whatsapp.presentation.navigation.WhatsAppNavigationSystem
import com.appvantage.whatsapp.presentation.splashscreen.SplashScreen
import com.appvantage.whatsapp.presentation.updatescreen.UpdateScreen
import com.appvantage.whatsapp.presentation.userregistrationscreen.UserRegistrationScreen
import com.appvantage.whatsapp.presentation.welcomescreen.WelcomeScreen
import com.appvantage.whatsapp.ui.theme.WhatsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ){pD->
                    WhatsAppNavigationSystem(modifier = Modifier.padding(pD))
                }
            }
        }
    }
}
