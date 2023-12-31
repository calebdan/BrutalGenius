package co.danjuma.brutalgenius.components


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.danjuma.brutalgenius.ui.theme.GreyColor
import co.danjuma.brutalgenius.R
import co.danjuma.brutalgenius.data.Question
import co.danjuma.brutalgenius.ui.theme.TextGrey
import co.danjuma.brutalgenius.ui.theme.kanti
import co.danjuma.brutalgenius.ui.theme.montserrat
import co.danjuma.brutalgenius.ui.theme.vinaSans

@Composable
fun HeaderText(text: String) {
    val offset = Offset(5.0f, -5.0f)

    Text(
        text = text,
        fontFamily = kanti,
        color = TextGrey,
        style = TextStyle.Default.copy(
            fontSize = 25.sp, shadow = Shadow(
                color = Color.Red, offset = offset
            )
        ),
    )
}

@Composable
fun SubHeaderText(text: String) {
    val offset = Offset(5.0f, -5.0f)

    Text(
        text = text,
        fontFamily = kanti,
        color = TextGrey,
        style = TextStyle.Default.copy(
            fontSize = 20.sp,
            shadow = Shadow(
                color = Color.Black, offset = offset
            )
        ),
    )
}

@Composable
fun NormalText(questionText: Question) {
    Text(
        text = questionText.questionText,
        fontFamily = kanti,
        color = Color.Black,
        fontSize = 20.sp

    )
}


@Composable
fun AnswerButton(answer: String, isCorrectAnswer: Boolean, onAnswerSelected: () -> Unit) {
    Button(
        onClick = onAnswerSelected,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isCorrectAnswer) Color.Green else Color.White,
            contentColor = Color.Black,
            disabledContainerColor = Color.Gray,
            disabledContentColor = Color.DarkGray
        )
    ) {
        Text(text = answer)
    }
}


@Composable
fun CountDownTimerText() {
    Text(
        text = "3:00",
        fontWeight = FontWeight.Bold,
        fontFamily = montserrat,
        fontSize = 15.sp
    )
}

@Composable
fun TopSectionApp() {

    Row(modifier = Modifier.fillMaxWidth()) {
        Image(
            painterResource(id = R.drawable.settings),
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
                    elevation = 40.dp, shape = RectangleShape, ambientColor = Color.Black
                )
                .padding(10.dp)

        )

    }


}

@Preview(showBackground = true)
@Composable
fun AppComponentsPreview() {
    HeaderText(text = "Test")
}