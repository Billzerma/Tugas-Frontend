package com.example.tugasss.present.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasss.R
import com.example.tugasss.model.Map
import com.example.tugasss.ui.theme.TugasssTheme

@Composable
fun MapItem(
    map: Map,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable {
                onItemClicked(map.id)
            }
            .fillMaxWidth().padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = map.photo),
            contentDescription = map.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier

                .size(80.dp)

        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = map.name, style = MaterialTheme.typography.titleMedium)

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    TugasssTheme {
        MapItem(
            map = Map(1, "Limgrave", "INi LIMGRAVE",R.drawable.limgrave),
            onItemClicked = { mapId ->
                println("Map Id : $mapId")
            }
        )
    }
}