package com.example.neshop.frontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.neshop.R

@Composable
fun HomeScreen(navController:NavController) {
    var searchBar by remember{
        mutableStateOf("")
    }
    val buttonSearch by remember{
        mutableStateOf("")
    }
    val cartButton by remember{
        mutableStateOf("")
    }
    val settingButton by remember{
        mutableStateOf("")
    }
    val mailButton by remember{
        mutableStateOf("")
    }
    val notificationButton by remember {
        mutableStateOf("")
    }
    Surface(){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .background(colorResource(id = R.color.Biru_Nesas))
        ){
            Column(
                modifier = Modifier.padding(top = 28.dp,start = 10.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ){
                Text(text = "NeShop", fontSize = 24.sp, fontWeight = FontWeight.SemiBold ,modifier = Modifier.padding(bottom = 10.dp), color = Color.White)
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 75.dp)
                .fillMaxHeight(1f)
                .background(colorResource(id = R.color.white))
        ){
            Row(
                modifier = Modifier.padding(top = 20.dp, start = 10.dp, end = 10.dp, bottom = 10.dp)
            ){
                OutlinedTextField(
                    value = searchBar,
                    onValueChange = {
                        searchBar = it
                    },
                    placeholder = {
                        Text(text = "search", fontSize = 12.sp)
                    },
                    trailingIcon = {
                                   IconButton(onClick = {buttonSearch}) {
                                       Icon(painter = painterResource(id = R.drawable.search),
                                           contentDescription = "Search Icon",
                                           modifier = Modifier.requiredSize(15.dp)
                                       )
                                   }
                    },
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .height(45.dp)
                        .width(235.dp),
                    textStyle = TextStyle(fontSize = 12.sp)
                )
                IconButton(onClick = {mailButton}) {
                    Icon(painter = painterResource(id = R.drawable.mail), contentDescription = "MailIcon",
                        modifier = Modifier.requiredSize(20.dp))
                }
                IconButton(onClick = {notificationButton}) {
                    Icon(painter = painterResource(id = R.drawable.notif), contentDescription = "NotifIcon",
                        modifier = Modifier.requiredSize(20.dp))
                }
                IconButton(onClick = {cartButton}) {
                    Icon(painter = painterResource(id = R.drawable.cart), contentDescription = "CartIcon",
                        modifier = Modifier.requiredSize(20.dp))
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxSize(1f)
                    .padding(start = 10.dp, end = 10.dp)
            ){
                Row(){
                    Card(shape = RoundedCornerShape(8.dp), elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), modifier = Modifier
                        .padding(16.dp)
                        .background(colorResource(id = R.color.white))
                        .fillMaxWidth()) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(text = "Halo", fontSize = 24.sp, color = Color.Black)
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = "This is a simple card example in Jetpack Compose.", fontSize = 16.sp, color = Color.Gray)
                        }
                    }
                    Column(
                        modifier = Modifier.padding(15.dp)
                    ) {
                    }
                        Card(shape = RoundedCornerShape(8.dp), elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), modifier = Modifier
                            .padding(16.dp)
                            .background(colorResource(id = R.color.white))
                            .fillMaxWidth()) {
                            Column(
                                modifier = Modifier.padding(16.dp)
                            ) {
                                Text(text = "Halo", fontSize = 24.sp, color = Color.Black)
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(text = "This is a simple card example in Jetpack Compose.", fontSize = 16.sp, color = Color.Gray)
                            }
                        }
                }
            }
        }
    }
}