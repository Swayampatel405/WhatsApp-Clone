package com.appvantage.whatsapp.presentation.callscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalWithComputedDefaultOf
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
fun CallScreen(modifier: Modifier = Modifier){

    Scaffold(
        topBar = { CallTopBar() },
        bottomBar = { BottomNavigation() },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = RoundedCornerShape(30),
                modifier = Modifier.size(65.dp),
                containerColor = colorResource(R.color.light_green),
                contentColor = Color.White
            ){
                Icon(
                    painter = painterResource(R.drawable.add_call),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

            }
        }
    ) {
        Column (
            modifier = Modifier.padding(it).padding(12.dp)
        ){
            Text(
                text = "Favourites",
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold
            )
            LazyRow {
                items(sampleFavouritesItem){item->
                    FavouritesItem(favouritesItemData = item)
                }
            }

            Spacer( modifier = Modifier.height(14.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.light_green),
                    contentColor = Color.White
                )
            ){
                Text("Start a new call", fontSize = 16.sp, fontWeight = FontWeight.Bold)

            }

            Spacer( modifier = Modifier.height(18.dp))

            Text(
                text = "Recent Calls",
                fontSize = 21.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(15.dp))

            sampleRecentCallsItem.forEach {call->
                RecentCallItem(recentCallsItemData = call)
            }

        }
    }

}