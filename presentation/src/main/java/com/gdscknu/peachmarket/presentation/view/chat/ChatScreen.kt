package com.gdscknu.peachmarket.presentation.view.chat

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout

@Composable
fun ChatScreen(){
    DefaultLayout(
        title = Router.CHAT.korean,
    ) {
        Text(text ="채팅")
    }
}