package com.example.furee.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.furee.R
import com.example.furee.ui.theme.*

object PaymentOptions{
    const val paypal = "Paypal"
    const val creditCard = "Credit Card"
}

@ExperimentalMaterialApi
@Composable
fun Appointment() {
    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) { scrollState.animateScrollTo(10000) }

        Column (modifier = Modifier
            .fillMaxSize()
            .background(WhiteBackground)
            .padding(18.dp)
            .verticalScroll(scrollState)){
            TopBar()
            AppointmentCard()
            AppointmentPaymentDetails()
            PaymentOptions()
            PayButton()
        }
}

@ExperimentalMaterialApi
@Composable
fun TopBar() {
    Row(
        verticalAlignment = CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(WhiteBackground)
            .fillMaxWidth()
            .padding(vertical = 20.dp)
    ) {
        Card(
            onClick = {/*TODO*/},
            shape = RoundedCornerShape(10.dp),
            backgroundColor = WhiteBackground,
            border = BorderStroke(width = 0.5.dp, color = Grey),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_hamburger_nav),
                contentDescription = stringResource(R.string.navigation_menu),
                tint = DarkBlue,
                modifier = Modifier
                    .padding(10.dp))
        }
        Text(
            text = "Appointment",
            style = MaterialTheme.typography.h1,
            color = DarkBlue)
        Card(
            onClick = {},
            shape = RoundedCornerShape(10.dp),
            backgroundColor = WhiteBackground,
            border = BorderStroke(width = 0.5.dp, color = Grey),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_notification),
                contentDescription = stringResource(R.string.navigation_menu),
                tint = DarkBlue,
                modifier = Modifier
                    .padding(10.dp))
        }

    }
}

@Composable
fun AppointmentCard(
    doctorName: String = "Dr. Corrie Anderson",
    specialist: String = "Cardiovascular",
    duration: Int = 1
) {
    Card(
        shape = RoundedCornerShape(15.dp),
        backgroundColor = DarkBlue,
        elevation = 7.dp,
        modifier = Modifier.padding(top = 15.dp)
    ) {
        Row (
            verticalAlignment = CenterVertically,
            modifier = Modifier
                .padding(22.dp)
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Doctor Avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(85.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier.padding(start = 25.dp)
            ) {
                Text(
                    text = doctorName,
                    style = MaterialTheme.typography.h2,
                    color = WhiteBackground
                )
                Text(
                    text = specialist,
                    style = MaterialTheme.typography.body1,
                    color = Grey,
                    modifier = Modifier.padding(top = 5.dp)
                )
                Text(
                    text = "0$duration hour consultation", //For further development, this needs to be a conditional for '0' and 'hour(s)'
                    style = MaterialTheme.typography.h3,
                    color = WhiteBackground,
                    modifier = Modifier.padding(top = 15.dp)
                )
            }
        }
    }
}

@Composable
fun AppointmentPaymentDetails(
    appointmentCost: String = "$95.00",
    adminFee: String = "$05.00",
    toPay: String = "$100.00",
    duration: Int = 1
) {
    Card(
        shape = RoundedCornerShape(15.dp),
        backgroundColor = LighterWhite,
        elevation = 1.dp,
        modifier = Modifier.padding(top = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 22.dp, horizontal = 18.dp)
                .fillMaxWidth()
        ){
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(bottom = 12.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Appointment Cost",
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
                Text(
                    text = appointmentCost,
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
            }
            Text(
                text = "Consultation fee for 0$duration hour",
                style = MaterialTheme.typography.body1,
                color = Grey,
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(bottom = 20.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Admin Fee",
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
                Text(
                    text = adminFee,
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "To pay",
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
                Text(
                    text = toPay,
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
            }
            Divider(
                color = Grey,
                modifier = Modifier.padding(top = 18.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = OrangeTransparent),
                border = BorderStroke(width = 0.5.dp, color = OrangeButton),
                shape = RoundedCornerShape(25.dp),
                elevation = ButtonDefaults.elevation(0.dp),
                modifier = Modifier
                    .padding(top = 18.dp)
                    .fillMaxWidth()
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp)
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_coupon), contentDescription = "Coupon", tint = OrangeButton)
                    Text(
                        text = "Use Promo Code",
                        style = MaterialTheme.typography.h2,
                        color = DarkBlue
                    )
                    Icon(painter = painterResource(id = R.drawable.ic_arrow), contentDescription = "Arrow", tint = OrangeButton)
                }
            }

        }
    }
}

@Composable
fun PaymentOptions() {
    Card(
        shape = RoundedCornerShape(15.dp),
        backgroundColor = LighterWhite,
        elevation = 1.dp,
        modifier = Modifier.padding(top = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 22.dp, horizontal = 18.dp)
                .fillMaxWidth()
        ){
            val selectedPayment = remember { mutableStateOf(value = "") }
            Text(
                text = "Payment Options",
                style = MaterialTheme.typography.h2,
                color = DarkBlue
            )
            Card(
                shape = RoundedCornerShape(15.dp),
                elevation = 0.dp,
                border = BorderStroke(width = 1.dp, color = Grey),
                modifier = Modifier.padding(top = 18.dp)
                ) {
                Column {
                    Row(
                        verticalAlignment = CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth()
                    ) {
                        Row(horizontalArrangement = Arrangement.spacedBy(15.dp)) {
                            RadioButton(
                                selected = selectedPayment.value == PaymentOptions.paypal,
                                onClick = { selectedPayment.value = PaymentOptions.paypal },
                                colors = RadioButtonDefaults.colors(Grey))
                            Text(
                                text = PaymentOptions.paypal,
                                style = MaterialTheme.typography.h2,
                                color = DarkBlue
                            )
                        }
                        Icon(painter = painterResource(id = R.drawable.ic_paypal), contentDescription = "Paypal", tint = Color.Unspecified)
                    }

                    Divider(color = Grey)

                    Row(
                        verticalAlignment = CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth()
                    ) {
                        Row(horizontalArrangement = Arrangement.spacedBy(15.dp)) {
                            RadioButton(
                                selected = selectedPayment.value == PaymentOptions.creditCard,
                                onClick = { selectedPayment.value = PaymentOptions.creditCard },
                                colors = RadioButtonDefaults.colors(Grey))
                            Text(
                                text = PaymentOptions.creditCard,
                                style = MaterialTheme.typography.h2,
                                color = DarkBlue
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Icon(painter = painterResource(id = R.drawable.ic_visa), contentDescription = "Visa", tint = Color.Unspecified, modifier = Modifier.size(30.dp))
                            Icon(painter = painterResource(id = R.drawable.ic_mastercard), contentDescription = "Mastercard", tint = Color.Unspecified, modifier = Modifier.size(30.dp))
                            Icon(painter = painterResource(id = R.drawable.ic_american_express), contentDescription = "American Express", tint =Color.Unspecified, modifier = Modifier.size(30.dp))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PayButton() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = OrangeButton),
        shape = RoundedCornerShape(18.dp),
        elevation = ButtonDefaults.elevation(3.dp),
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
    ){
        Text(
            text = "Pay & Confirm",
            style = MaterialTheme.typography.h2,
            color = WhiteBackground,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
        )
    }
}

