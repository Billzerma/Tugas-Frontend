package com.tugasInfinite.tugasss.present.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasss.R
import com.tugasInfinite.tugasss.model.Weapon
import com.tugasInfinite.tugasss.ui.theme.TugasssTheme


@Composable
fun WeaponItem(
    weapon: Weapon,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = weapon.photo),
            contentDescription = weapon.name,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = weapon.name,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )

    }
}

@Preview
@Composable
private fun CourseItemPreview() {
    TugasssTheme {
        WeaponItem(
            weapon = Weapon(
                1,
                "greatSword",
                "full ok",
                R.drawable.great
            )
        )
    }
}