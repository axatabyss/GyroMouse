package com.axat.gyromouse.feature.home.screen

import android.annotation.SuppressLint
import android.graphics.BlurMaskFilter
import android.graphics.BlurMaskFilter.Blur.NORMAL
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.axat.gyromouse.R
import com.axat.gyromouse.ui.theme.MontserratFont
import com.axat.gyromouse.ui.theme.PrimaryColor


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceType")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun HomeScreen() {

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
                Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


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


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    Box(
                        modifier = Modifier
                            .size(128.dp)
                            .border(width = 3.dp, color = White, shape = CircleShape)
                            .background(shape = CircleShape, color = Blue.copy(0.5f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Start",
                            color = White,
                            textAlign = TextAlign.Center,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    
                    Text(
                        text = "Attach mouse piece before using",
                        color = Black,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                    )

                }


                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(vertical = 12.dp)
                ) {

                    OutlinedButton(
                        modifier = Modifier
                            .border(width = 3.dp, color = White, shape = RoundedCornerShape(50))
                            .background(shape = RoundedCornerShape(50), color = Blue.copy(0.5f)),
                        onClick = {}
                    ) {
                        Text(
                            text = "Customize",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = MontserratFont,
                            modifier = Modifier.padding(horizontal = 12.dp),
                        )
                    }

                    Spacer(modifier = Modifier.width(18.dp))

                    OutlinedButton(
                        modifier = Modifier
                            .border(width = 3.dp, color = White, shape = RoundedCornerShape(50))
                            .background(shape = RoundedCornerShape(50), color = Blue.copy(0.5f)),
                        onClick = {}
                    ) {
                        Text(
                            text = "Configure",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = MontserratFont,
                            modifier = Modifier.padding(horizontal = 12.dp),
                        )
                    }

                }



            }

        }

    }

}