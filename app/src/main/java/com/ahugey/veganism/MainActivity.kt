package com.ahugey.veganism

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ahugey.veganism.ui.theme.VeganismTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VeganismTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    IntroScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun IntroScreen(modifier: Modifier = Modifier) {

}

@Composable
fun AllergiesFlow() {

}