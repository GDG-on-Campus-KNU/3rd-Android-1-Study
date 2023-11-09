package com.gdscknu.peachmarket.presentation.view.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gdscknu.peachmarket.data.model.home.SaleItemModel
import java.time.LocalDateTime


object SaleItem
@Composable
fun SaleItem.FromModel(model: SaleItemModel) {
    SaleItemBase(
        title = model.title,
        price = model.price,
        image = model.image,
        createdAt = model.createdAt
    )
}
@Composable
fun SaleItemBase(title: String, price: Int, image: String, createdAt: LocalDateTime) {
    Row {
        Column(
            modifier = Modifier.height(120.dp).padding(vertical = 8.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(title)
            Text("$price 원")
            Text(createdAt.toString())
        }
    }
}