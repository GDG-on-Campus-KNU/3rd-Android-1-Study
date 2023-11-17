package com.gdscknu.peachmarket.presentation.view.mypage

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout

@Composable
fun MyPageScreen(){
    DefaultLayout(
    title = Router.MYPAGE.korean,
) {
    Text(text ="마이페이지")
}
}