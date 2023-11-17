package com.gdscknu.peachmarket.presentation.view.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gdscknu.peachmarket.presentation.model.UiState
import com.gdscknu.peachmarket.presentation.view.home.component.SaleItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val saleItems : MutableStateFlow<com.gdscknu.peachmarket.presentation.model.UiState<List<SaleItem>>> = MutableStateFlow(
        com.gdscknu.peachmarket.presentation.model.UiState.Loading())

    fun getSaleItems(){
        viewModelScope.launch {
            saleItems.value = com.gdscknu.peachmarket.presentation.model.UiState.Success(listOf())
        }
    }

}