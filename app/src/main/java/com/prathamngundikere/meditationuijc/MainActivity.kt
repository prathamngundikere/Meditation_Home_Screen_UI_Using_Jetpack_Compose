package com.prathamngundikere.meditationuijc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.prathamngundikere.meditationuijc.ui.HomeScreen
import com.prathamngundikere.meditationuijc.ui.theme.MeditationUIJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIJCTheme {
                HomeScreen()
            }
        }
    }
}