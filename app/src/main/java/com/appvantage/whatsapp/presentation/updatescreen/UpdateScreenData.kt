package com.appvantage.whatsapp.presentation.updatescreen

import android.media.Image
import androidx.compose.ui.res.painterResource
import com.appvantage.whatsapp.R

data class StatusData(
    val image: Int,
    val name:String,
    val time:String
)

val sampleStatusData = listOf(
    StatusData(image = R.drawable.kartik_aaryan, name ="Kartik Aryan", time ="10 min ago"),
    StatusData(image = R.drawable.tripti_dimri, name ="Tripti Dimri", time ="5 min ago"),
    StatusData(image = R.drawable.sharadha_kapoor, name ="Sharadha Kapoor", time ="Just Now"),
    StatusData(image = R.drawable.mrbeast, name ="Mr.Beast", time ="4 min ago"),
    StatusData(image = R.drawable.rajkummar_rao, name ="Rajkumar Rao", time ="1 hr ago")
)