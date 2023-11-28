package com.axat.gyromouse.feature.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.axat.gyromouse.R
import com.axat.gyromouse.ui.theme.MontserratFont
import com.axat.gyromouse.ui.theme.PrimaryColor


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GyroScreen(
    navController: NavHostController
) {

    Scaffold {

        Box(
            Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0XFFE5EEFE),
                            Color(0XFFE2EBFB),
                        )
                    )
                )
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .padding(horizontal = 5.dp)
                ) {


                    Icon(
                        imageVector = Icons.Outlined.ArrowBack,
                        contentDescription = null,
                        tint = PrimaryColor,
                        modifier = Modifier.size(25.dp)
                    )


                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .drawBehind {
                                val strokeWidthPx = 1.dp.toPx()
                                val verticalOffset = size.height - 1.sp.toPx()
                                drawLine(
                                    color = PrimaryColor,
                                    strokeWidth = strokeWidthPx,
                                    start = Offset(0f, verticalOffset),
                                    end = Offset(size.width, verticalOffset)
                                )
                            }
                            .padding(horizontal = 10.dp),
                    ) {

                        Image(
                            imageVector = ImageVector.vectorResource(id = R.drawable.ic_gyro),
                            contentDescription = "Image",
                            modifier = Modifier.size(24.dp)
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        Text(
                            text = "Gyro Mouse",
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontFamily = MontserratFont,
                            modifier = Modifier.padding(vertical = 12.dp),
                        )

                    }



                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = null,
                        tint = PrimaryColor,
                        modifier = Modifier.size(25.dp)
                    )


                }




                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 10.dp)
                ) {

                    OutlinedButton(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .height(80.dp)
                            .weight(1f),
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryColor
                        ),
                        border = BorderStroke(2.dp, color = Color.White),
                        onClick = {}
                    ) {
                        Text(
                            text = "LB",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = MontserratFont,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 12.dp),
                        )
                    }

                    Spacer(modifier = Modifier.width(18.dp))

                    OutlinedButton(
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .height(80.dp)
                            .weight(1f),
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 10.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryColor
                        ),
                        border = BorderStroke(2.dp, color = Color.White),
                        onClick = {}
                    ) {
                        Text(
                            text = "RB",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = MontserratFont,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 12.dp),
                        )
                    }

                }




                Text(
                    text = "Tap back button to exit",
                    color = Color.Black,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 10.dp)
                )


            }

        }

    }

}