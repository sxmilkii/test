package com.example.gashkova_v_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class PersonalArea : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalArea()
        }
    }
}

@Composable
fun PersonalArea(onBackPress: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFFFFFFF)),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(top = 20.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 39.dp, start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
            ) {
               // Image(
                //    painter = painterResource(id = R.drawable.ic_example_icon),
                 //   contentDescription = null,
                 //   modifier = Modifier
                 //       .width(24.dp)
                //        .height(24.dp)
              //  )
                Text("Станция", color = Color(0xFF000000), fontSize = 24.sp)
                //Image(
                   // painter = painterResource(id = R.drawable.ic_example_icon),
                  //  contentDescription = null,
                  //  modifier = Modifier
                   //     .width(24.dp)
                   //     .height(24.dp)
               // )
            }
            Text(
                "Привет, User!",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 17.dp, start = 22.dp)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .fillMaxWidth()
                    .background(color = Color(0xFFF5F5F5))
                    .padding(vertical = 22.dp, horizontal = 20.dp)
            ) {
                Text(
                    "Ты запустил ракету ",
                    color = Color(0xFF2D2D2D),
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Text(
                    "22 декабря, в 11:20",
                    color = Color(0xFFFF5630),
                    fontSize = 24.sp,
                    modifier = Modifier.padding(bottom = 30.dp)
                )
                OutlinedButton(
                    onClick = { println("Сделать снимок нажато") },
                    border = BorderStroke(0.dp, Color.Transparent),
                  //  colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .background(color = Color(0xFFFF5630))
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(vertical = 26.dp)
                    ) {
                        Text("Сделать снимок", color = Color(0xFFFFFFFF), fontSize = 16.sp)
                    }
                }
            }

            // Блок изображения
            Box {
                //Image(
                 //   painter = painterResource(id = R.drawable.ic_example_image),
                   // contentDescription = null,
                  //  modifier = Modifier
                  //      .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                  //      .clip(RoundedCornerShape(16.dp))
                   //     .height(160.dp)
                    //    .fillMaxWidth()
              //  )
                Column(
                    modifier = Modifier
                        .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
                        .height(160.dp)
                        .fillMaxWidth()
                        .padding(top = 75.dp, bottom = 26.dp, start = 25.dp, end = 25.dp)
                ) {
                    Text(
                        "Сегодня состоялся запуск ракеты на станции Земля-1",
                        color = Color(0xFFFFFFFF),
                        fontSize = 16.sp,
                        modifier = Modifier.padding(bottom = 15.dp)
                    )
                    Text(
                        "22 декабря, в 11:20",
                        color = Color(0xFFFFFFFF),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPersonalArea() {
    PersonalArea()
}

