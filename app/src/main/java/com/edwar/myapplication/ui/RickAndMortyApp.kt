/*
package com.edwar.myapplication.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.edwar.myapplication.ui.detail.theme.RickAndMortyTheme

@Composable
fun RickAndMortyApp() {
    RickAndMortyTheme {
        val navController = rememberNavController()
        val navigationActions = remember(navController) {
            RickAndMortyActions(navController)
        }

        RickAndMortyNavGraph(
            navController = navController,
            navigateToHome = navigationActions.navigateToHome,
            navigateToDetail = navigationActions.navigateToDetail
        )
    }
}*/
