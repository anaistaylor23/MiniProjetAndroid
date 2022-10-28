package com.example.mylinkedin

import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylinkedin.ui.theme.Film
import com.example.mylinkedin.ui.theme.MainViewModel
import com.example.mylinkedin.ui.theme.MyLinkedinTheme
import com.example.mylinkedin.ui.theme.Texte
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.currentBackStackEntryAsState
import androidx.navigation.rememberNavController



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewmodel : MainViewModel by viewModels()
        setContent {
            MyLinkedinTheme {
                // A surface container using the 'background' color from the theme

                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    navHost(navController= navController, startDestination= "Profil"){
                        composable("Profil"){ Profil(navController)}
                        composable("Film"){ Film(navController)}
                    }
                }
            }
            }

    }
}







