package com.capitalism.empire.data.wallet.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.capitalism.empire.data.wallet.models.CardUIDetails
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WalletCard(
    cardDetails: CardUIDetails,
    iconCardSettings: DrawableResource,
    onCardSettingsClicked: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {

    Card(
        shape = RoundedCornerShape(24.dp),
        elevation = CardDefaults.elevatedCardElevation(8.dp),
        modifier = modifier
            .height(224.dp)
            .padding(16.dp)
    ) {
        Box {
            Image(
                painter = painterResource(cardDetails.cardBackground),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
            Column(
                modifier = Modifier
                    .background(Color.Transparent)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {
                    Text(
                        text = cardDetails.accountType,
                        fontSize = 20.sp
                    )

                    // Card Settings Button
                    Icon(
                        painter = painterResource(iconCardSettings),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                            .clickable {
                                onCardSettingsClicked.invoke(cardDetails.cardId)
                            }
                    )
                }

                Text(
                    text = "Balance",
                    fontSize = 14.sp,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(top = 8.dp, bottom = 4.dp)
                )

                Text(
                    text = cardDetails.balance,
                    fontSize = 24.sp,
                    textAlign = TextAlign.End,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(bottom = 16.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(bottom = 16.dp)
                    ,
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ) {

                    Text(
                        text = cardDetails.number,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                    )

                    Text(
                        text = cardDetails.expiration,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(horizontal = 32.dp)
                    )

                    Image(
                        painter = painterResource(cardDetails.cardIcon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(48.dp)
                    )

                }
            }
        }
    }
}