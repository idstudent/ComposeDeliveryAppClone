package com.exam.composedeliveryappclone.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.exam.composedeliveryappclone.ui.theme.Color005E02
import com.exam.composedeliveryappclone.ui.theme.Color40F3ED
import com.exam.composedeliveryappclone.ui.theme.Color620097
import com.exam.composedeliveryappclone.ui.theme.ColorD4E6F7
import com.exam.composedeliveryappclone.ui.theme.ColorE2CD11
import com.exam.composedeliveryappclone.ui.theme.ColorE8
import com.exam.composedeliveryappclone.ui.theme.ColorFF0000

@Composable
fun StoreCategoryView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
            .padding(top = 8.dp),
            thickness = 8.dp,
            color = ColorE8
        )

        Row(
          modifier = Modifier
              .fillMaxWidth()
              .horizontalScroll(rememberScrollState())
              .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            CategoryItem(
                emoji = "🏪",
                title = "B마트",
                bgColor = Color40F3ED
            )
            CategoryItem(
                emoji = "🟣",
                title = "CU",
                bgColor = Color620097
            )
            CategoryItem(
                emoji = "🔵",
                title = "GS25",
                bgColor = ColorD4E6F7
            )
            CategoryItem(
                emoji = "🟡",
                title = "이마트",
                bgColor = ColorE2CD11
            )
            CategoryItem(
                emoji = "🔴",
                title = "홈플슈퍼",
                bgColor = ColorFF0000
            )
            CategoryItem(
                emoji = "🟢",
                title = "GS더프레시",
                bgColor = Color005E02
            )
            CategoryItem(
                emoji = "🟡",
                title = "이마트슈퍼",
                bgColor = ColorE2CD11
            )
        }
    }
}