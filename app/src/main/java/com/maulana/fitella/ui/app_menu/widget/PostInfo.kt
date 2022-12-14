package com.maulana.fitella.ui.app_menu.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maulana.fitella.R
import com.maulana.fitella.theme.Poppins

@Preview
@Composable
fun PostInfo() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
        elevation = 0.dp,
        backgroundColor = Color(0xFFF2F2F2),
        //Color(0xFFECECEC),
        shape = RoundedCornerShape(10.dp),
    ) {
        Column(modifier = Modifier.padding(horizontal = 9.dp, vertical = 10.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(31.dp)
                        .clip(CircleShape),
                    painter = painterResource(R.drawable.temp_1),
                    contentDescription = "Prof Pict"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontFamily = Poppins,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.Black
                            )
                        ) {
                            append("justin_27 ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontFamily = Poppins,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        ) {
                            append("is join Color Run 2022 - Gelora Bung Karno.")
                        }
                    }
                )
            }
            Spacer(modifier = Modifier.height(9.dp))
            Row(
                modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.size(15.dp),
                    imageVector = ImageVector.vectorResource(R.drawable.like),
                    contentDescription = "Like",
                )
                Spacer(modifier = Modifier.width(11.dp))
                Image(
                    modifier = Modifier.size(15.dp),
                    imageVector = ImageVector.vectorResource(R.drawable.comment),
                    contentDescription = "Comment",
                )
                Spacer(modifier = Modifier.width(11.dp))
                Image(
                    modifier = Modifier.size(15.dp),
                    imageVector = ImageVector.vectorResource(R.drawable.share),
                    contentDescription = "Share",
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "28 likes", style = TextStyle(
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = Poppins,
                        color = Color.Black,
                    )
                )
            }
            Text(
                modifier = Modifier.align(Alignment.End),
                text = "Just Now", style = TextStyle(
                    fontFamily = Poppins,
                    fontSize = 6.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Black
                )
            )
        }
    }
}