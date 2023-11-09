package com.gdscknu.peachmarket.presentation.view.home

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.gdscknu.peachmarket.data.model.home.SaleItemModel
import com.gdscknu.peachmarket.presentation.navigation.Router
import com.gdscknu.peachmarket.presentation.view.common.DefaultLayout
import com.gdscknu.peachmarket.presentation.view.home.component.FromModel
import com.gdscknu.peachmarket.presentation.view.home.component.SaleItem
import java.time.LocalDate
import java.time.LocalDateTime


@Composable
fun HomeScreen(navController: NavHostController){
    val saleItems = TestSaleItem.saleItems
    DefaultLayout(title = "제목 테스트") {
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