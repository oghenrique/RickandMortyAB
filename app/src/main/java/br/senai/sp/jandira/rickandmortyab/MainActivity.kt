package br.senai.sp.jandira.rickandmortyab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.rickandmortyab.model.Character
import br.senai.sp.jandira.rickandmortyab.screens.CharacterDetails
import br.senai.sp.jandira.rickandmortyab.screens.CharactersList
import br.senai.sp.jandira.rickandmortyab.service.RetrofitFactory
import br.senai.sp.jandira.rickandmortyab.ui.theme.RickAndMortyABTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            RickAndMortyABTheme {
                // CharacterDetails()
                CharactersList()
            }
        }
    }
}

