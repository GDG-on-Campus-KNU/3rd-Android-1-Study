package com.gdscknu.peachmarket.presentation.view.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.gdscknu.peachmarket.core.utils.DataUtils.localDateTimeToString
import com.gdscknu.peachmarket.core.utils.DataUtils.longToMoneyString
import com.gdscknu.peachmarket.data.model.home.SaleItemModel
import com.gdscknu.peachmarket.presentation.theme.Constant.BORDER_RADIUS
import com.gdscknu.peachmarket.presentation.theme.TextStyles.CONTENT1_STYLE
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
fun SaleItemBase(title: String, price: Long, image: String, createdAt: LocalDateTime) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ){
        AsyncImage(
            model = image,
            contentDescription = null,
            modifier = Modifier
                .padding(horizontal = 12.dp)
                .size(90.dp).border(
                    width = 1.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(BORDER_RADIUS)
                ),
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = Modifier
                .height(120.dp)
                .padding(vertical = 8.dp),
            verticalArrangement = Arrangement.Top,
        ) {
            Text(title, style = CONTENT1_STYLE)
            Text(localDateTimeToString(createdAt), style = CONTENT1_STYLE.copy(
                color = Color.Gray
            ))
            Text(longToMoneyString(price), style = CONTENT1_STYLE)
        }
    }
}