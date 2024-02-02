package com.mitoteca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mitoteca.navigation.NavigationScreen
import com.mitoteca.theme.MitotecaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MitotecaTheme {
                NavigationScreen()
            }
        }
    }
}

@Preview
@Composable
fun MainScreenView() {
    NavigationScreen()
}
