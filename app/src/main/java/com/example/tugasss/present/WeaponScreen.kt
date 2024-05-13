package com.example.tugasss.present

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasss.DataDummy.dummyData
import com.example.tugasss.model.Weapon
import com.example.tugasss.present.component.WeaponItem
import com.example.tugasss.ui.theme.TugasssTheme


@Composable
fun WeaponScreen(
    modifier: Modifier = Modifier,
    weapons: List<Weapon> = dummyData.TheWeapon
) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        columns = GridCells.Adaptive(140.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(weapons, key = { it.id }) {
            WeaponItem(weapon = it)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    TugasssTheme {
        WeaponScreen(weapons = dummyData.TheWeapon)
    }
}