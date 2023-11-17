package com.gdscknu.peachmarket.presentation.view.home

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Divider
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.gdscknu.peachmarket.data.model.home.SaleItemModel
import com.gdscknu.peachmarket.presentation.model.UiState
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.theme.Colors.ORANGE
import com.gdscknu.peachmarket.presentation.theme.TextStyles.CONTENT1_STYLE
import com.gdscknu.peachmarket.presentation.theme.TextStyles.CONTENT2_STYLE
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout
import com.gdscknu.peachmarket.presentation.view.home.component.FromModel
import com.gdscknu.peachmarket.presentation.view.home.component.SaleItem
import java.time.LocalDateTime


@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeViewModel = viewModel()){

    val saleItems = TestSaleItem.saleItems
    DefaultLayout(
        title = "복현동",
        floatingActionButton = {
            ExtendedFloatingActionButton(
                containerColor = ORANGE,
                onClick = { /*TODO*/},
                icon = {
                    Icon(Icons.Filled.Edit, "글쓰기",tint = Color.White)
                },
                text = { Text(text = "글쓰기", style = CONTENT2_STYLE.copy(
                    color = Color.White
                )) },
            )
        }
    ) {
        Column {
            saleItems.forEach {
                Box(modifier = Modifier.clickable {
                    navController.navigate("${Router.SALEITEM.name}/${it.id}")
                }) {
                    SaleItem.FromModel(model = it)
                }

                Divider()
            }
        }
    }
}

object TestSaleItem{
    @RequiresApi(Build.VERSION_CODES.O)
    val saleItems = mutableListOf<SaleItemModel>(
        SaleItemModel(
            id = 1,
            title = "제목",
            price = 1000,
            image = "https://picsum.photos/200/300",
            createdAt = LocalDateTime.now()
        ),
        SaleItemModel(
            id = 2,
            title = "제목2",
            price = 2000,
            image = "https://picsum.photos/200/300",
            createdAt = LocalDateTime.now()
        ),
        SaleItemModel(
            id = 3,
            title = "제목3",
            price = 3000,
            image = "https://picsum.photos/200/300",
            createdAt = LocalDateTime.now()
        ),
    )
}