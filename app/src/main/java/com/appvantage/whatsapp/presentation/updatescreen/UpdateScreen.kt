package com.appvantage.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appvantage.whatsapp.R
import com.appvantage.whatsapp.presentation.bottomnavigation.BottomNavigation

@Preview(showSystemUi = true)
@Composable
fun UpdateScreen(modifier: Modifier = Modifier){

    val scrollState = rememberScrollState()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                contentColor = Color.White,
                modifier = Modifier.size(65.dp)
            ) {
                Icon(painter = painterResource(R.drawable.baseline_photo_camera_24), contentDescription = null)
            }
        },
        bottomBar = {
            BottomNavigation()
        },
        topBar = {
            TopBar()
        }

    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ){
            Text(
                text = "Status",
                fontWeight = FontWeight.Bold,
                fontSize = 23.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 12.dp, top = 10.dp)
            )

            MyStatus()

            Text(
                text = "Recent updates",
                color = Color.DarkGray,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(10.dp)
            )

            sampleStatusData.forEach {
                StatusItem(statusData = it)
            }

            HorizontalDivider()

            Text(
                text = "Channels",
                fontWeight = FontWeight.Bold,
                fontSize = 23.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 12.dp, top = 10.dp)
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ){
                Text(
                    text = "Stay updated on topics that matter to you.Find channels to follow below",
                    fontSize = 15.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 14.dp, top = 10.dp)
                )
                Text(
                    text = "Find channels to follow",
                    fontSize = 15.sp,
                    color = Color.DarkGray,
                    modifier = Modifier.padding(start = 14.dp, top = 10.dp)
                )

            }


        }
    }

}