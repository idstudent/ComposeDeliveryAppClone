package com.exam.composedeliveryappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.exam.composedeliveryappclone.screen.RouteScreen
import com.exam.composedeliveryappclone.ui.theme.ComposeDeliveryAppCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeDeliveryAppCloneTheme {
                RouteScreen(navController = rememberNavController())
            }
        }
    }
}
