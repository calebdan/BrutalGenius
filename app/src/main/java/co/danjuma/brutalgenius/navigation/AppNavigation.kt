package co.danjuma.brutalgenius.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.danjuma.brutalgenius.app.BrutalGeniusApp

@Composable
fun ComposeNavigation() {

    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "BrutalGeniusScreen" ){

        composable(route = "BrutalGeniusScreen"){
            BrutalGeniusApp(navController)
        }

        composable(route = "TipCalculatorScreen"){
           //TipCalculatorScreen(navController)
        }
    }

}
