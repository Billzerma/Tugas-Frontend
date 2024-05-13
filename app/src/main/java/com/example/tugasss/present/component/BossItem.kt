package com.example.tugasss.present.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasss.R
import com.example.tugasss.model.Boss
import com.example.tugasss.ui.theme.TugasssTheme


@Composable
fun BossItem(
    boss: Boss,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(boss.id)
        }
    ) {
        Image(
            painter = painterResource(id = boss.photo),
            contentDescription = boss.name, modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Text(
            text = boss.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(80.dp),
            maxLines = 1
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun BossHorizontalPreview() {
    TugasssTheme {
        BossItem(
            boss = Boss(1, "Morgot", "The Omen King", "Erdtree", R.drawable.morgot),
            onItemClicked = { bossId ->
                println("Boss Id : $bossId")
            }
        )
    }
}