package com.tugasInfinite.tugasss.present

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tugasInfinite.tugasss.data.dummyData
import com.tugasInfinite.tugasss.model.Boss
import com.tugasInfinite.tugasss.model.Map
import com.tugasInfinite.tugasss.navigation.Screen
import com.tugasInfinite.tugasss.present.component.MapItem
import com.tugasInfinite.tugasss.present.component.BossItem


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    boss: List<Boss> = dummyData.TheBoss,
    map: List<Map> = dummyData.TheMaps,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(boss, key = { it.id }) {
                    BossItem(boss = it) { bossId ->
                        navController.navigate(Screen.Detail.route + "/$bossId")
                    }
                }
            }
        }
        items(map, key = { it.id }) {
            MapItem(map = it) { mapId ->
                navController.navigate(Screen.DetailMap.route + "/$mapId")
            }
        }
    }
}