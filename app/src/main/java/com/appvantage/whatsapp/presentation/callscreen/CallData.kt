package com.appvantage.whatsapp.presentation.callscreen

import android.media.Image
import com.appvantage.whatsapp.R

data class FavouritesItemData(
    val image: Int,
    val name:String
)

data class RecentCallsItemData(
    val image: Int,
    val name: String,
    val time:String,
    val isMissed:Boolean
)

val sampleFavouritesItem = listOf(
    FavouritesItemData(image = R.drawable.mrbeast, name ="Mr Beast" ),
    FavouritesItemData(image = R.drawable.tripti_dimri, name ="Tripti Dimri" ),
    FavouritesItemData(image = R.drawable.rajkummar_rao, name ="Rajkumar Rao" ),
    FavouritesItemData(image = R.drawable.sharadha_kapoor, name ="Sharadha Kapoor" ),
    FavouritesItemData(image = R.drawable.kartik_aaryan, name ="Kartik Aryan" ),
    FavouritesItemData(image = R.drawable.carryminati, name ="Carry Minati" ),
)

val sampleRecentCallsItem = listOf(
    RecentCallsItemData(image = R.drawable.boy1, name = "Shahrukh Khan", time = "Yesterday,8:30 PM", isMissed = true),
    RecentCallsItemData(image = R.drawable.boy, name = "Salman Khan", time = "Today,7:30 PM", isMissed = false),
    RecentCallsItemData(image = R.drawable.sharadha_kapoor, name = "Shradha Kapoor", time = "Today,6:45 PM", isMissed = true),
    RecentCallsItemData(image = R.drawable.bhuvan_bam, name = "Bhuvan Bam", time = "Yesterday,8:30 PM", isMissed = false),
    RecentCallsItemData(image = R.drawable.carryminati, name = "Carryminati", time = "Today,7:30 PM", isMissed = true)
)