package com.capitalism.empire.cards

import com.capitalism.empire.core.ui.resources.images.ResourceImagesCards
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
class Cards(resources: ResourceImagesCards) {

    val minimalCards = listOf(
        Card(
            designType = CardDesignType.MINIMAL,
            drawable = resources.minimal1
        ),
        Card(
            designType = CardDesignType.MINIMAL,
            drawable = resources.minimal2
        )
    )

    val designCards = listOf(
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design1
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design2
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design3
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design4
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design5
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design6
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design7
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design8
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design9
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design10
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design11
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design12
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design13
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design14
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design15
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design16
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design17
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design18
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design19
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design20
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design21
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design22
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design23
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design24
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design25
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design26
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design27
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design28
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design29
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design30
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design31
        ),
        Card(
            designType = CardDesignType.DESIGN,
            drawable = resources.design32
        )
    )

    val gradientCards = listOf(
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient1
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient2
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient3
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient4
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient5
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient6
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient7
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient8
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient9
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient10
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient11
        ),
        Card(
            designType = CardDesignType.GRADIENT,
            drawable = resources.gradient12
        )
    )

    val dualCards = listOf(
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual1
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual2
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual3
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual4
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual5
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual6
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual7
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual8
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual9
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual10
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual11
        ),
        Card(
            designType = CardDesignType.DUAL,
            drawable = resources.dual12
        )
    )
}

@OptIn(ExperimentalResourceApi::class)
data class Card(
    val designType: CardDesignType,
    val drawable: DrawableResource
)

enum class CardDesignType {
    MINIMAL,
    DESIGN,
    GRADIENT,
    DUAL
}