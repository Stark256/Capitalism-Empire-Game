package com.capitalism.empire.data.wallet.models

sealed interface CardUi {
    data class Card(val cardDetails: CardUIDetails): CardUi
    data object AddNewCard: CardUi
}