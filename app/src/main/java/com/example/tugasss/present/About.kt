package com.example.tugasss.present

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tugasss.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
fun About() {
    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Menggunakan painterResource() untuk mendapatkan Painter dari gambar
        val imagePainter = painterResource(R.drawable.fotoku)

        // Menggunakan Image() dengan Painter sebagai argumen
        Image(
            painter = imagePainter,
            contentDescription = "Foto Profil",
            modifier = Modifier.fillMaxWidth().padding(20.dp).size(width = 100.dp, height = 100.dp).clip(
                CircleShape)
        )
        Text(
            text = "Email: 211111030@gmail.com",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(vertical = 4.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Perguruan Tinggi: STIKI Malang",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(vertical = 4.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Jurusan: Informatika",
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(vertical = 4.dp),
            textAlign = TextAlign.Center
        )


    }
}
