package com.exam.composedeliveryappclone.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.composedeliveryappclone.ui.theme.Color40F3ED

@Composable
fun BMartView() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color40F3ED)
            .padding(16.dp)
    ) {
        Column {
            Text("B마트",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black)

            Text(
                "올해 마지막 혜택!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(Modifier.height(16.dp))
        }
    }
}