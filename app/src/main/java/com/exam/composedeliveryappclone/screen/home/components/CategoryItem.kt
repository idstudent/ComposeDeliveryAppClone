package com.exam.composedeliveryappclone.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exam.composedeliveryappclone.ui.theme.ColorE8

@Composable
fun CategoryItem(
    emoji: String,
    title: String,
    modifier: Modifier = Modifier,
    bgColor: Color = ColorE8
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.width(70.dp)
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(bgColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = emoji,
                fontSize = 36.sp,
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            maxLines = 1,
            color = Color.Black
        )
    }
}