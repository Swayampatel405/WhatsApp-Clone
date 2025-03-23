package com.appvantage.whatsapp.presentation.communityscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appvantage.whatsapp.R
import com.appvantage.whatsapp.presentation.bottomnavigation.BottomNavigation

@Preview(showSystemUi = true)
@Composable
fun CommunityScreen(modifier: Modifier = Modifier){
    Scaffold (
        topBar = { CommunityTopBar() },
        bottomBar = { BottomNavigation() }

    ){
        Column(
            modifier = Modifier.padding(it)
        ){
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 16.dp, end = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor =  colorResource(R.color.light_green),
                    contentColor = Color.White
                )
            ){
                Text("Start a new community", fontSize = 17.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Your Communities",
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )

            sampleCommunityData.forEach {community->
                CommunityItem(communityData = community)
            }

        }
    }

}