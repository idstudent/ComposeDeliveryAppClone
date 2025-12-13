package com.exam.composedeliveryappclone.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.ui.graphics.vector.ImageVector
import com.exam.composedeliveryappclone.R

sealed class NaviItem(
    val title: Int,
    val icon: ImageVector,
    val route: String
) {
    data object Home: NaviItem(R.string.home, Icons.Default.Home, "HOME")
    data object Shopping: NaviItem(R.string.shopoing, Icons.Filled.ShoppingBag , "SHOPPING")
    data object Like: NaviItem(R.string.like, Icons.Default.FavoriteBorder, "LIKE")
    data object OrderHistory: NaviItem(R.string.history_order, Icons.Filled.ReceiptLong,"ORDER_HISTORY")
    data object My: NaviItem(R.string.my, Icons.Filled.Person, "MY")

    companion object {
        private val BOTTOM_NAV_ROUTE = listOf("HOME", "SHOPPING", "LIKE", "ORDER_HISTORY", "MY")
        fun showBottomBar(route: String?): Boolean {
            return when {
                route == null -> true
                BOTTOM_NAV_ROUTE.contains(route) -> true
                else -> false
            }
        }
    }
}