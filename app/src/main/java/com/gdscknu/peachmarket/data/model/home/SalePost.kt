package com.gdscknu.peachmarket.data.model.home

import java.time.LocalDateTime

data class SaleItemModel(
    val id: Long,
    val title: String,
    val price: Long,
    val createdAt: LocalDateTime,
    val image: String,
)
