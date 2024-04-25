package com.capitalism.empire.cards

import com.capitalism.empire.ui.resources.images.ResourceImagesCards
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
class Cards(resources: ResourceImagesCards) {

    val minimalCards = listOf(
        Card(
            type = CardType.MINIMAL,
            drawable = resources.minimal1
        ),
        Card(
            type = CardType.MINIMAL,
            drawable = resources.minimal2
        )
    )

    val designCards = listOf(
        Card(
            type = CardType.DESIGN,
            drawable = resources.design1
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design2
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design3
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design4
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design5
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design6
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design7
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design8
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design9
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design10
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design11
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design12
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design13
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design14
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design15
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design16
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design17
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design18
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design19
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design20
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design21
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design22
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design23
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design24
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design25
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design26
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design27
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design28
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design29
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design30
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design31
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design32
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design33
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design34
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design35
        ),
        Card(
            type = CardType.DESIGN,
            drawable = resources.design36
        )
    )

    val gradientCards = listOf(
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient1
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient2
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient3
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient4
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient5
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient6
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient7
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient8
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient9
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient10
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient11
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient12
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient13
        ),
        Card(
            type = CardType.GRADIENT,
            drawable = resources.gradient14
        )
    )

    val dualCards = listOf(
        Card(
            type = CardType.DUAL,
            drawable = resources.dual1
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual2
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual3
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual4
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual5
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual6
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual7
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual8
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual9
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual10
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual11
        ),
        Card(
            type = CardType.DUAL,
            drawable = resources.dual12
        )
    )
}

@OptIn(ExperimentalResourceApi::class)
data class Card(
    val type: CardType,
    val drawable: DrawableResource
)

enum class CardType {
    MINIMAL,
    DESIGN,
    GRADIENT,
    DUAL
}