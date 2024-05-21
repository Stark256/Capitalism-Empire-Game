package com.capitalism.empire.data.wallet.models

data class CardUIDetails(
    val cardId: Int,
    val balance: String,
    val accountType: String,
    val number: String,
    val expiration: String,
    val cardIcon: Int,
    val cardBackground: Int
)