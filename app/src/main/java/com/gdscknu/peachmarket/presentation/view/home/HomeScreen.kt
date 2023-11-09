package com.gdscknu.peachmarket.presentation.view.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout

@Composable
fun HomeScreen(){
    DefaultLayout(title = "제목 테스트") {
        Text(text = "홈")
    }
}