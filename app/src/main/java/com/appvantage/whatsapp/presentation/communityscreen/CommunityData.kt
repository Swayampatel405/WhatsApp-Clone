package com.appvantage.whatsapp.presentation.communityscreen

import com.appvantage.whatsapp.R

data class CommunityData(
    val image:Int,
    val name:String,
    val memberCount:String
)

val sampleCommunityData = listOf(
    CommunityData(image = R.drawable.img, name = "Tech Enthusiasts", memberCount = "256 Members"),
    CommunityData(image = R.drawable.baseline_photo_camera_24, name = "Photography Lovers", memberCount = "230 Members"),
    CommunityData(image = R.drawable.tripti_dimri, name = "Travelers United", memberCount = "26 Members"),
)
