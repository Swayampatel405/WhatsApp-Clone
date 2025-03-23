package com.appvantage.whatsapp.presentation.updatescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.appvantage.whatsapp.R

@Preview(showSystemUi = true)
@Composable
fun TopBar(){

    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxWidth()) {
        Column{
            Row(modifier = Modifier.padding(top = 5.dp)) {
                if(isSearching){
                  TextField(
                      value = search,
                      onValueChange = {search = it},
                      placeholder = { Text("search") },
                      colors = TextFieldDefaults.colors(
                          focusedContainerColor = Color.Transparent,
                          unfocusedContainerColor = Color.Transparent,
                          focusedIndicatorColor = Color.Transparent,
                          unfocusedIndicatorColor = Color.Transparent
                      ),
                      modifier = Modifier.padding(start = 12.dp),
                      singleLine = true
                  )
                }else{
                    Text(
                        "Updates",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 12.dp,top = 18.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if(isSearching){

                    IconButton(onClick = {
                        isSearching = false
                        search = ""
                    }) {
                        Icon(
                            painter = painterResource(R.drawable.cross),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 18.dp).size(15.dp)
                        )
                    }
                }else{
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 18.dp).size(24.dp)
                        )
                    }
                    IconButton(
                        onClick = {isSearching = true}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 18.dp).size(24.dp)
                        )
                    }
                    IconButton(
                        onClick = {showMenu = true}
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.padding(top = 18.dp).size(24.dp)
                        )

                        DropdownMenu(expanded = showMenu, onDismissRequest = {showMenu = false}, modifier = Modifier.height(200.dp)){
                            DropdownMenuItem(
                                text = { Text("Status Privacy")},
                                onClick = {showMenu = false}
                            )
                            DropdownMenuItem(
                                text = { Text("Create Channel")},
                                onClick = {showMenu = false}
                            )
                            DropdownMenuItem(
                                text = { Text("Settings")},
                                onClick = {showMenu = false}
                            )

                        }
                    }

                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            HorizontalDivider()
        }
    }
}