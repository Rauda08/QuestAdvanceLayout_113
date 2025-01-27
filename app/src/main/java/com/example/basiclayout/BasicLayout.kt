package com.example.basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayout.ui.theme.BasiclayoutTheme

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection()
        DetailMhs(
            param = "Nama",
            argu = "Raudatul Jannah"
        )
        DetailMhs(
            param = "NIM",
            argu = "20220140113"
        )
        DetailMhs(
            param = "Prodi",
            argu = "Teknologi Informasi"
        )
        DetailMhs(
            param = "Fakultas",
            argu = "Teknik"
        )
        DetailMhs(
            param = "Universitas",
            argu = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            param = "Alamat",
            argu = "Tamantirto, Kasihan, Bantul, Yogyakarta"
        )
        DetailMhs(
            param = "Email",
            argu = "raudacantik@gmail.com"
        )
    }
}

@Composable
fun HeaderSection() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                contentAlignment = Alignment.BottomEnd,
                modifier = Modifier.size(72.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tiumy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .background(Color.Blue, shape = CircleShape)
                        .padding(4.dp),
                    tint = Color.White
                )
            }
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah YogyakartA")
            }
        }
    }
}

@Composable
fun DetailMhs(
    param: String, argu: String
) {
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = param,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = ":",
                modifier = Modifier.weight(0.1f)
            )
            Text(
                text = argu,
                modifier = Modifier.weight(2f)
            )
        }
    }
}





