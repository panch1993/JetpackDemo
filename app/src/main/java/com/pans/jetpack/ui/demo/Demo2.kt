package com.pans.jetpack.ui.demo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

/**
 * Create by panchenhuan on 2021/12/2
 * walkwindc8@foxmail.com
 * Description: P14
 */
@Composable
fun ProfileCard() {
    Row() {
        Surface(Modifier.size(50.dp),
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.5f),
        shape = CircleShape) {

        }
        Column {
            Text(text = "Blooming_wind", fontWeight = FontWeight.SemiBold)
            Text(text = "5 min ago", style = MaterialTheme.typography.body2)
        }
    }
}