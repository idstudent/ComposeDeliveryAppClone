package com.exam.composedeliveryappclone.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.exam.composedeliveryappclone.screen.home.components.SearchView
import com.exam.composedeliveryappclone.screen.home.components.TopHeader
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import com.exam.composedeliveryappclone.screen.home.components.BMartView
import com.exam.composedeliveryappclone.ui.theme.Color40F3ED

@Composable
fun HomeScreen() {
    val listState = rememberLazyListState()
    val density = LocalDensity.current
    var topAreaHeight by remember { mutableIntStateOf(0) }

    val headerHeight by remember {
        derivedStateOf {
            if (listState.firstVisibleItemIndex == 0) {
                val offset = listState.firstVisibleItemScrollOffset
                val maxHeight = 56
                (maxHeight - (offset / 2)).coerceAtLeast(0)
            } else {
                0
            }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color40F3ED))
    {
        LazyColumn(
            state = listState,
            // 리스트위에 헤더, 검색뷰를 얹기때문에 계산해서 쓰지않으면 보이지가 않음, height를 계산해서 그 아래로? 두는 방법
            contentPadding = PaddingValues(
                top = with(density) {
                    topAreaHeight.toDp()
                }
            )
        ) {
            item {
                BMartView()
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = (-8).dp)
                        .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                        .background(Color.White)
                        .padding(bottom = 20.dp)
                ) {
                    repeat(50) { index ->
                        Text("테스트 $index", modifier = Modifier.padding(16.dp))
                    }
                }
            }
        }

        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = Color40F3ED
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .onGloballyPositioned {
                        topAreaHeight = it.size.height
                    }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(headerHeight.dp)
                ) {
                    TopHeader()
                }

                SearchView()
            }
        }
    }
}