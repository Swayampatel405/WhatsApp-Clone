package com.appvantage.whatsapp.presentation.updatescreen

import com.appvantage.whatsapp.R

data class StatusData(
    val image: Int,
    val name:String,
    val time:String
)

val sampleStatusData = listOf(
    StatusData(image = R.drawable.kartik_aaryan, name ="Kartik Aryan", time ="10min ago"),
    StatusData(image = R.drawable.tripti_dimri, name ="Tripti Dimri", time ="5min ago"),
    StatusData(image = R.drawable.sharadha_kapoor, name ="Sharadha Kapoor", time ="Just Now"),
    StatusData(image = R.drawable.mrbeast, name ="Mr.Beast", time ="4min ago"),
    StatusData(image = R.drawable.rajkummar_rao, name ="Rajkumar Rao", time ="1hr ago")
)

data class ChannelData(
    val image: Int,
    val name:String,
    val description:String
)

val sampleChannelData = listOf(
    ChannelData(image = R.drawable.neat_roots, name ="Neat Roots" , description = "Latest news in tech"),
    ChannelData(image = R.drawable.img, name ="Food Lovers" , description = "Discover new food"),
    ChannelData(image = R.drawable.meta, name ="Meta" , description = "Explore the world"),
)

