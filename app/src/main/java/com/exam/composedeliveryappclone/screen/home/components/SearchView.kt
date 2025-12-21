package com.exam.composedeliveryappclone.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp
import com.exam.composedeliveryappclone.ui.theme.Color40F3ED
import com.exam.composedeliveryappclone.ui.theme.ColorCC

@Composable
fun SearchView() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color40F3ED)
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "배고프니까 일단 검색!",
                    fontSize = 14.sp,
                    color = ColorCC
                )

                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "",
                    tint = Color.Black
                )
            }
        }
    }
}