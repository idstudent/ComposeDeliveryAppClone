package com.exam.composedeliveryappclone.screen.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryTabView(
    modifier: Modifier = Modifier,
    onTabSelected: (Int) -> Unit = {}
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val tabs = listOf("음식배달", "픽업", "장보기,쇼핑", "배민연말특선", "선물하기", "혜택모아보기")

    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier.fillMaxWidth(),
        edgePadding = 8.dp,
        indicator = { tabPositions ->
            TabRowDefaults.SecondaryIndicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                color = Color.Black,
                height = 2.dp
            )
        },
        containerColor = Color.White, // 안쓰면 homescreen의 흰색따라갈줄알았는데 검은색나옴
        divider = {} // 안쓰면 라인그려짐
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                },
                text = {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        fontWeight = if(selectedTabIndex == index) FontWeight.Bold else FontWeight.Normal,
                        color = if(selectedTabIndex == index) Color.Black else Color.Gray
                    )
                }
            )
        }
    }
}