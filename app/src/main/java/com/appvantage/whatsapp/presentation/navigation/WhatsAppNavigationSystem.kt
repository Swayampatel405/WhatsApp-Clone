package com.appvantage.whatsapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.appvantage.whatsapp.presentation.callscreen.CallScreen
import com.appvantage.whatsapp.presentation.communityscreen.CommunityScreen
import com.appvantage.whatsapp.presentation.homescreen.HomeScreen
import com.appvantage.whatsapp.presentation.splashscreen.SplashScreen
import com.appvantage.whatsapp.presentation.updatescreen.UpdateScreen
import com.appvantage.whatsapp.presentation.userregistrationscreen.UserProfileScreen
import com.appvantage.whatsapp.presentation.userregistrationscreen.UserRegistrationScreen
import com.appvantage.whatsapp.presentation.welcomescreen.WelcomeScreen

@Composable
fun WhatsAppNavigationSystem(modifier: Modifier = Modifier){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SplashScreen
    ){

        composable<Routes.SplashScreen>{
            SplashScreen(navHostController = navController)
        }

        composable<Routes.WelcomeScreen>{
            WelcomeScreen(navHostController = navController)
        }

        composable<Routes.UserRegistrationScreen>{
            UserRegistrationScreen(navController)
        }

        composable<Routes.UserProfileScreen>{
            UserProfileScreen(navController)
        }

        composable<Routes.HomeScreen>{
            HomeScreen()
        }

        composable<Routes.UpdateScreen>{
            UpdateScreen()
        }

        composable<Routes.CommunityScreen>{
            CommunityScreen()
        }

        composable<Routes.CallScreen>{
            CallScreen()
        }
    }
}