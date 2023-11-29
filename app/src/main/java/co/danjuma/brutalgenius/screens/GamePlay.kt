package co.danjuma.brutalgenius.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.danjuma.brutalgenius.components.HeaderText
import co.danjuma.brutalgenius.components.SubHeaderText
import co.danjuma.brutalgenius.ui.theme.BGYellow

@Composable
fun Gameplay() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BGYellow
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .padding(top = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            HeaderText(text = "Football Quiz")

            SubHeaderText("Brutal Genius 1 of 5")

        }


    }
}

@Preview
@Composable
fun gamePlayPreview() {
    Gameplay()
}