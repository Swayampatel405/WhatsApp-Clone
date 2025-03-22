package com.appvantage.whatsapp.presentation.homescreen

import android.os.Message
import com.appvantage.whatsapp.R

data class ChatDesignModel(
    val image:Int,
    val name:String,
    val time:String,
    val message:String
)

val chatData = listOf(
    ChatDesignModel(
        image = R.drawable.boy1,
        name = "Shahrukh Khan",
        time = "10:00 AM",
        message = "Hi"
    ),
    ChatDesignModel(
        image = R.drawable.bhuvan_bam,
        name = "Bhuvan Bam",
        time = "10:00 AM",
        message = "Hi Bhuvan"
    ),
    ChatDesignModel(
        image = R.drawable.boy,
        name = "Salman Khan",
        time = "10:10 AM",
        message = "Kaise Ho"
    ),
    ChatDesignModel(
        image = R.drawable.carryminati,
        name = "Carryminati",
        time = "10:30 AM",
        message = "Hi"
    ),
    ChatDesignModel(
        image = R.drawable.kartik_aaryan,
        name = "Kartik Aryan",
        time = "11:50 PM",
        message = "Hi shubham"
    )
)
