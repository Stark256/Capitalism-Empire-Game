package com.capitalism.empire.wallet

import com.capitalism.empire.ui.resources.Resources
import moe.tlaster.precompose.viewmodel.ViewModel

data class WalletUiState(
    val placeHolder: String,
    // val cards
    //
)

class WalletViewModel(
    val resources: Resources
): ViewModel() {

    sealed interface Action {
        data object GoToTip: Action
        data object GoToCardSettings: Action // card id
        data object GoToAddNewCard: Action
    }


    // create action state
    // create ui state

    // create data module for cards

    // create interface for card in data module
    // create card data class in data module

    // create Card types: Default, Savings, Business, Brokerage, Credit(2-4)

    // fun clicked
}