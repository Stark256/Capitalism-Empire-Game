package com.capitalism.empire.data.wallet.models

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
data class CardUIDetails(
    val cardId: Int,
    val balance: String,
    val accountType: String,
    val number: String,
    val expiration: String,
    val cardIcon: DrawableResource,
    val cardBackground: DrawableResource
)