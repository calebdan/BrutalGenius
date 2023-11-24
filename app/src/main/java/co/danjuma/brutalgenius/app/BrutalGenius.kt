package co.danjuma.brutalgenius.app


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.danjuma.brutalgenius.R
import co.danjuma.brutalgenius.components.HeaderText
import co.danjuma.brutalgenius.components.TopSectionApp
import co.danjuma.brutalgenius.ui.theme.BGYellow
import co.danjuma.brutalgenius.ui.theme.GreyColor
import co.danjuma.brutalgenius.ui.theme.vinaSans

@Composable
fun BrutalGeniusApp() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = BGYellow
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                .padding(top = 15.dp),
        ) {

            TopSectionApp()


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp),

                horizontalAlignment = Alignment.CenterHorizontally

            ) {


                Spacer(modifier = Modifier.height(130.dp))

                HeaderText("Brutal Genius")

                Spacer(modifier = Modifier.height(90.dp))

                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(25.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color(0xFFF5F5F3),
                        containerColor = Color(0xFF323232)
                    ),

                    modifier = Modifier.size(
                        width = 230.dp,
                        height = 65.dp
                    )

                ) {

                    Text(
                        text = "Start Game",
                        fontSize = 19.sp,
                        fontFamily = vinaSans,
                        modifier = Modifier.clickable {


                        }
                    )

                }

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "How to Play?", fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                painterResource(id = R.drawable.question_mark),
                contentDescription = "Settings",
                modifier = Modifier

                    .size(width = 50.dp, height = 50.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(GreyColor)
                    .border(
                        border = BorderStroke(width = 3.dp, color = Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .clip(RoundedCornerShape(30.dp))
                    .shadow(
                        elevation = 40.dp,
                        shape = RectangleShape,
                        ambientColor = Color.Black
                    )
                    .padding(10.dp)

            )

        }
    }
}


@Preview
@Composable
fun BrutalAppPreview() {
    BrutalGeniusApp()
}
