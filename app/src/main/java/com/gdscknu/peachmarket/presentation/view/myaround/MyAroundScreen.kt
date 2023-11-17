package com.gdscknu.peachmarket.presentation.view.myaround

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout

@Composable
fun MyAroundScreen() {
    DefaultLayout(
        title = Router.MYAROUND.korean,
    ) {
        Text(text = "내 주변")
    }
}