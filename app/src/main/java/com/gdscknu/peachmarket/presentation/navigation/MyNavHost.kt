package com.gdscknu.peachmarket.presentation.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gdscknu.peachmarket.presentation.view.chat.ChatScreen
import com.gdscknu.peachmarket.presentation.view.home.HomeScreen
import com.gdscknu.peachmarket.presentation.view.local.LocalScreen
import com.gdscknu.peachmarket.presentation.view.myaround.MyAroundScreen
import com.gdscknu.peachmarket.presentation.view.mypage.MyPageScreen

enum class Router(val korean: String) {
    HOME("홈"),
    LOCAL("동네 생활"),
    MYAROUND("내 근처"),
    CHAT("채팅"),
    MYPAGE("마이페이지"),
}

@Composable
fun MyAppHost(navController: NavHostController, modifier: Modifier){
    NavHost(
        navController = navController,
        startDestination = Router.HOME.name,
        modifier = modifier
    ){
        composable(Router.HOME.name){
            HomeScreen()
        }
        composable(Router.LOCAL.name){
            LocalScreen()
        }
        composable(Router.MYAROUND.name){
            MyAroundScreen()
        }
        composable(Router.CHAT.name){
            ChatScreen()
        }
        composable(Router.MYPAGE.name){
            MyPageScreen()
        }

    }
}
