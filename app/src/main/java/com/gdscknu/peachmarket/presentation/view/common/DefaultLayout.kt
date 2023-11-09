package com.gdscknu.peachmarket.presentation.view.common

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultLayout(
    title: String? = null,
    body: @Composable () -> Unit
){
    Scaffold (
        topBar={
            title?.let {
                TopAppBar(
                    title = {
                        Text(text = title)
                    }
                )
            }
        }
    ){
        Box(modifier = Modifier.padding(it)) {
            body()
        }
    }
}