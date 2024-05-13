package com.example.tugasss.present

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.tugasss.DataDummy.dummyData
import com.example.tugasss.model.Map

@Composable
fun DetailMap(
    modifier: Modifier = Modifier,
    navController: NavController,
    mapId: Int?
) {
    val newMap = dummyData.TheMaps.filter { map ->
        map.id == mapId
    }
    Column(
        modifier = modifier.verticalScroll(rememberScrollState())
    ) {
        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.Start)

                .padding(8.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Kembali"
            )
        }
        DetailMapContent(newMapList=newMap)
    }
}

@Composable
private fun DetailMapContent(
    newMapList: List<Map>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newMapList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 350.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster Movie"
        )
        Spacer(modifier = Modifier.width(16.dp))

    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(5.dp)
    ) {

        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(2.dp)) {
            Text(
                text = newMapList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newMapList[0].desc}",
                style = MaterialTheme.typography.titleSmall,
                textAlign = TextAlign.Justify ,
                fontWeight = FontWeight.Normal,


            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailMapContentPreview() {
    DetailMapContent(newMapList = dummyData.TheMaps)
}