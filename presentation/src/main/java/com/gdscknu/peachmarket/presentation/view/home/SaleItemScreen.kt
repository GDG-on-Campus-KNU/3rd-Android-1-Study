package com.gdscknu.peachmarket.presentation.view.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout

@Composable
fun SaleItemScreen(id: Int){
    DefaultLayout {
        Text(text = "SaleItemScreen $id")
    }
}