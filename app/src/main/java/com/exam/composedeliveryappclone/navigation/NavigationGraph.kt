
package com.exam.composedeliveryappclone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.exam.composedeliveryappclone.screen.main.FavoriteScreen
import com.exam.composedeliveryappclone.screen.home.HomeScreen
import com.exam.composedeliveryappclone.screen.main.ShoppingScreen
import com.exam.composedeliveryappclone.screen.main.OrderHistoryScreen
import com.exam.composedeliveryappclone.screen.main.MyPageScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NaviItem.Home.route
    ) {
        composable(NaviItem.Home.route) {
            HomeScreen()
        }

        composable(NaviItem.Shopping.route) {
            ShoppingScreen()
        }

        composable(NaviItem.Like.route) {
            FavoriteScreen()
        }

        composable(NaviItem.OrderHistory.route) {
            OrderHistoryScreen()
        }

        composable(NaviItem.My.route) {
            MyPageScreen()
        }
    }
}