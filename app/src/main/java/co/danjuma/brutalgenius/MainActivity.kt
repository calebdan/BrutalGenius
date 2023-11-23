package co.danjuma.brutalgenius

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.text.googlefonts.GoogleFont
import co.danjuma.brutalgenius.app.BrutalGeniusApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {



            BrutalGeniusApp()

        }
    }
}

