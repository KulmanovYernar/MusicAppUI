package com.example.musicappui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.musicappui.Screen
import com.example.musicappui.viewmodel.MainViewModel

@Composable
fun NavGraph(
    navController: NavController,
    viewModel: MainViewModel,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screen.DrawerScreen.AddAccount.dRoute,
        modifier = Modifier.padding(paddingValues)
    ){
        composable(Screen.DrawerScreen.Account.route){

        }

        composable(Screen.DrawerScreen.AddAccount.route){

        }

        composable(Screen.DrawerScreen.Subscription.route){

        }
    }
}