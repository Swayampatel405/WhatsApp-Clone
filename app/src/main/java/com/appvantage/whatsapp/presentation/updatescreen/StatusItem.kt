package com.appvantage.whatsapp.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appvantage.whatsapp.R

@Preview(showBackground = true)
@Composable
fun MyStatus(){

    Row(
        modifier = Modifier.fillMaxWidth().padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.bhuvan_bam),
                contentDescription = null,
                modifier = Modifier.size(60.dp).clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(
                painter = painterResource(R.drawable.baseline_add_24),
                contentDescription = null,
                modifier = Modifier.size(23.dp)
                    .align(Alignment.BottomEnd)
                    .background(
                        color = colorResource(R.color.light_green),
                        shape = RoundedCornerShape(100)
                    )
                    .padding(2.dp),
                tint = Color.White

            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text("My Status", fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text("Tap to add status update", color = Color.Gray, fontSize = 14.sp)
        }
    }
}

@Composable
fun StatusItem(statusData: StatusData){

    Row(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
            Image(
                painter = painterResource(statusData.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(60.dp).clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = statusData.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Text(text = statusData.time, color = Color.Gray, fontSize = 14.sp)
            }
    }

}