package com.exam.composedeliveryappclone.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.exam.composedeliveryappclone.navigation.BottomNavigationBar
import com.exam.composedeliveryappclone.navigation.NaviItem
import com.exam.composedeliveryappclone.navigation.NavigationGraph

@Composable
fun RouteScreen(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
            bottomBar = {
                if(NaviItem.showBottomBar(currentRoute)) {
                    BottomNavigationBar(navController, currentRoute)
                }
            },
            content = { paddingValues ->
                Box(modifier = Modifier.padding(paddingValues)) {
                    NavigationGraph(navController)
                }
            }
        )
    }
}