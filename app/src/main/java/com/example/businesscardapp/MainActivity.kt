package com.example.businesscardapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xffdbe3db)
                ) {
                    BusinessCard(modifier = Modifier)
                }
            }
        }
    }
}

@SuppressLint("InvalidColorHexValue")
@Composable
fun BusinessCard(modifier: Modifier) {
    val imageSource = painterResource(id = R.drawable.android_logo)
    val shareIcon = painterResource(id = R.drawable.baseline_share_24)
    val phoneIcon = painterResource(id = R.drawable.baseline_phone_24)
    val emailIcon = painterResource(id = R.drawable.baseline_email_24)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(top = 150.dp)
        ) {

            Box(
                modifier = modifier
                    .size(width = 100.dp, height = 100.dp)
                    .background(color = Color(0xff192d35))
            ) {
                Image(painter = imageSource, contentDescription = "${R.string.android_logo}")
            }

            Spacer(modifier = modifier.size(width = 0.dp, height = 5.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
            ) {
                Text(
                    text = stringResource(id = R.string.my_name),
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    color = Color(0xff1b1d1a)
                )

                Spacer(modifier = modifier.size(width = 0.dp, height = 10.dp))

                Text(
                    text = stringResource(id = R.string.my_job),
                    textAlign = TextAlign.Center,
                    color = Color(0xff2f624b),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
        ) {

            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = phoneIcon,
                    contentDescription = stringResource(id = R.string.phone_icon),
                    tint = Color(0xff286147)
                )

                Spacer(modifier = modifier.size(width = 20.dp, height = 5.dp))

                Text(
                    fontWeight = FontWeight.Normal,
                    text = stringResource(id = R.string.phone_number),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color(0xff1a1e1d)
                )
            }

            Spacer(modifier = modifier.size(width = 0.dp, height = 15.dp))

            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = shareIcon,
                    contentDescription = stringResource(id = R.string.share_icon),
                    tint = Color(0xff286147)
                )

                Spacer(modifier = modifier.size(width = 20.dp, height = 5.dp))

                Text(
                    fontWeight = FontWeight.Normal,
                    text = stringResource(id = R.string.share_info),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color(0xff1a1e1d)
                )
            }

            Spacer(modifier = modifier.size(width = 0.dp, height = 15.dp))

            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = emailIcon,
                    contentDescription = stringResource(id = R.string.email_icon),
                    tint = Color(0xff286147)
                )

                Spacer(modifier = modifier.size(width = 20.dp, height = 5.dp))

                Text(
                    fontWeight = FontWeight.Normal,
                    text = stringResource(id = R.string.email),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    color = Color(0xff1a1e1d)
                )
            }






        }


    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        BusinessCard(modifier = Modifier)
    }
}