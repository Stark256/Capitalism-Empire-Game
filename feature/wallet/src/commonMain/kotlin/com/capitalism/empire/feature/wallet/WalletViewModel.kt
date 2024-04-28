package com.capitalism.empire.feature.wallet

import com.capitalism.empire.core.ui.resources.Resources
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


    // create interface for card in data module
    // create card data class in data module

    // create AccountType: Checking, Savings, Business, Brokerage, Deposit, Credit(3)

    /*

    TODO
    Screens
    - Tips Dialog
    - Card Settings Screen
    - Add New Card Screen
    - Card Design Screen

    TODO
    Data Classes
    - CardDesignType enum class
    - CardDesign (designId, designType, design)
    - CardDesignListImpl() class and CardDesignList interface
    - AccountType enum class

    - WalletCard (id, accountType, cardDesignId, cardDesign)


    TODO
    - Add database


    TODO
    In Splash Screen Calculations
    if(defaultCardSaved) {
        useCard
    } else {
        initSacingDefaultCardIntoDB
    }



    // TODO
     UseCases(resources, domain)
     Domain(localDataSource, remoteDataSource)
     DataSource -> db or API

     */

    // fun clicked

}

