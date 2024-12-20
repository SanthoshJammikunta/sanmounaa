package com.maddunoor.myvillage.home

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.unit.dp

@SuppressLint("RestrictedApi")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color.Blue)) {

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.0f)
                    .background(Color.Gray)) {
                    Row(modifier = Modifier
                        .height(200.dp)
                        .width(200.dp)
                        .background(Color.White)) {

                    }
                }
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.0F)
                    .background(Color.Red)) {

                }

            }
        }
    }
}