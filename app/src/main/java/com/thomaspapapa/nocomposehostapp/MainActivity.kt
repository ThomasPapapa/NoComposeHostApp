package com.thomaspapapa.nocomposehostapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import com.thomas.mytestlibraryhelloworld.TestLibraryHelloWorld
import com.thomaspapapa.nocomposehostapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        
        binding.composeView.apply {
            setContent {
                // In Compose world
                TestLibraryHelloWorld().Greeting(text = "Hello Composable")
            }
        }

    }
}