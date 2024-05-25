package com.capitalism.empire.feature.wallet

import com.capitalism.empire.core.ui.resources.Resources
import com.capitalism.empire.core.ui.resources.icons.ResourceIconsWallet
import com.capitalism.empire.core.ui.resources.images.ResourceImagesWallet
import com.capitalism.empire.data.wallet.models.CardUIDetails
import com.capitalism.empire.data.wallet.models.CardUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import moe.tlaster.precompose.viewmodel.ViewModel
import org.jetbrains.compose.resources.ExperimentalResourceApi

data class WalletUiState(
    val cards: List<CardUi> = emptyList()
    //
)

@OptIn(ExperimentalResourceApi::class)
class WalletViewModel(
    val icons: ResourceIconsWallet,
    val images: ResourceImagesWallet
): ViewModel() {

    sealed interface Action {
        data object GoToTip: Action
        data object GoToCardSettings: Action // card id
        data object GoToAddNewCard: Action
    }

    private val _uiState = MutableStateFlow(getInitialState())
    val uiState = _uiState.asStateFlow()

    private fun getInitialState(): WalletUiState {
        return WalletUiState(
            cards = listOf(
                CardUi.Card(
                    cardDetails = CardUIDetails(
                        cardId = 1,
                        balance = "$10,000",
                        accountType = "Checking Account",
                        number = "****  ****  ****  2345",
                        expiration = "12/26",
                        cardIcon = icons.mastercard,
                        cardBackground = images.design1
                    )
                ),
                CardUi.Card(
                    cardDetails = CardUIDetails(
                        cardId = 2,
                        balance = "$25,000",
                        accountType = "Deposit Account",
                        number = "****  ****  ****  7895",
                        expiration = "08/28",
                        cardIcon = icons.visa_white,
                        cardBackground = images.design2
                    )
                ),
                CardUi.Card(
                    cardDetails = CardUIDetails(
                        cardId = 3,
                        balance = "$18,000,000,000,000,000,000",
                        accountType = "Credit Account",
                        number = "****  ****  ****  7895",
                        expiration = "08/28",
                        cardIcon = icons.visa_black,
                        cardBackground = images.design3
                    )
                ),
                CardUi.Card(
                    cardDetails = CardUIDetails(
                        cardId = 3,
                        balance = "$18,000,000,000,000,000,000",
                        accountType = "Credit Account",
                        number = "****  ****  ****  7895",
                        expiration = "08/28",
                        cardIcon = icons.visa_black,
                        cardBackground = images.design4
                    )
                ),
                CardUi.AddNewCard
            )
        )
    }

    fun onAddNewCardClicked() {
        // TODO
    }

    fun onCardSettingsClicked(cardUIDetails: CardUIDetails) {
        // TODO
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

    /*

    Interface
    ViewModel: Interface

    interface {
        ic_one
        ic_two
    }


    Resources {
        val images
        val icons
        val strings
    }


     */

}

