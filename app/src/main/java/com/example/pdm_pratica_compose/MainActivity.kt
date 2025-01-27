package com.example.pdm_pratica_compose

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pdm_pratica_compose.ui.theme.PdmpraticacomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PdmpraticacomposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtigoSobreCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ArtigoSobreCompose(modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = stringResource(id = R.string.app_name)
        )

        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun TaskManagerCompose(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = stringResource(id = R.string.app_name)
        )

        Text(
            text = "All tasks completed",
            modifier = Modifier.padding(24.dp, 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(text = "Nice work!", fontSize = 16.sp)
    }
}

@Composable
fun QuadrantesCompose(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Define o número fixo de colunas
        modifier = Modifier.fillMaxSize()
    ) {
        item {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFEADDFF)
                    )
                ) {
                    Text(
                        text = "Text composable", modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Displays text and follows the recommended Material Design guidelines.")
                }
            }
        }

        item {
            Box(modifier = Modifier.fillMaxSize()) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFD0BCFF)
                    )
                ) {
                    Text(
                        text = "Image composable", modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "Creates a composable that lays out and draws a given Painter class object.")
                }
            }
        }

        item {
            Box(modifier = Modifier.fillMaxSize()) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFB69DF8)
                    )
                ) {
                    Text(
                        text = "Row composable", modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "A layout composable that places its children in a horizontal sequence.")
                }
            }
        }

        item {
            Box(modifier = Modifier.fillMaxSize()) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFEADDFF)
                    )
                ) {
                    Text(
                        text = "Column composable", modifier = Modifier.padding(bottom = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PdmpraticacomposeTheme {
        QuadrantesCompose()
    }
}