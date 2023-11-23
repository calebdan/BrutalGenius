package co.danjuma.brutalgenius.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.danjuma.brutalgenius.components.HeaderText
import co.danjuma.brutalgenius.components.TopSectionApp
import co.danjuma.brutalgenius.ui.theme.BGYellow

@Composable
fun BrutalGeniusApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = BGYellow
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                .padding(top = 15.dp),


            ) {

            TopSectionApp()

            Spacer(modifier = Modifier.height(130.dp))

            HeaderText("BrutalGenius")

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.shadow(
                    elevation = 10.dp,
                    shape = RectangleShape,
                    clip = true,
                    ambientColor = Color.Black

                )
            ) {

                Text(text = "Start Game")

            }

        }


    }
}

@Preview
@Composable
fun BrutalAppPreview() {
    BrutalGeniusApp()
}
