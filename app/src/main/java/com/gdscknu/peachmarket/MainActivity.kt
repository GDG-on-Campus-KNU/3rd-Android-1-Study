package com.gdscknu.peachmarket

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.gdscknu.peachmarket.presentation.navigation.MyAppHost
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.theme.PeachMarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PeachMarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PeachMarketApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PeachMarketApp(){
    val navController = rememberNavController()
    val items = listOf(
        Router.HOME,
        Router.LOCAL,
        Router.MYAROUND,
        Router.CHAT,
        Router.MYPAGE
    )
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                items.forEach { screen ->
                    NavigationBarItem(
                        selected = currentRoute == screen.name,
                        onClick = {
                            navController.navigate(screen.name){
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        },
                        icon = {
                            Text(text = " ${screen.korean}")
                        }
                    )
                }
            }
        }
    ) {paddingValues ->
        MyAppHost(navController = navController, modifier = Modifier.padding(paddingValues))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PeachMarketTheme {
        Greeting("Android")
    }
}