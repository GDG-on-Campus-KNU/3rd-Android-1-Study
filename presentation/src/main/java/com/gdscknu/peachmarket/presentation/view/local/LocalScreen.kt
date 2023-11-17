package com.gdscknu.peachmarket.presentation.view.local

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout

@Composable
fun LocalScreen(){
    DefaultLayout(
        title =Router.LOCAL.korean,
    ) {
        Text(text ="동네 생활")
    }

}