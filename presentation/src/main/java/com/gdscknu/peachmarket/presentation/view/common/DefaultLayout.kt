package com.gdscknu.peachmarket.presentation.view.common

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gdscknu.peachmarket.presentation.constant.TextStyles.TITLE1_STYLE

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultLayout(
    title: String? = null,
    onSearchClick : () -> Unit = {},
    onAlarmClick : () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    body: @Composable () -> Unit
){
    Scaffold (
        topBar={
            title?.let {
                TopAppBar(
                    title = {
                        Text(text = title, style = TITLE1_STYLE)
                    },
                    actions = {
                        IconButton(onClick = onSearchClick) {
                            Icon(Icons.Rounded.Search, contentDescription = null)
                        }
                        IconButton(onClick = onSearchClick) {
                            Icon(Icons.Outlined.Notifications, contentDescription = null)
                        }
                    }
                )
            }
        },
        floatingActionButton = floatingActionButton,
    ){
        Box(modifier = Modifier.padding(it)) {
            body()
        }
    }
}