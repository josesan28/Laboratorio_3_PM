package com.example.laboratorio3_pm

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laboratorio3_pm.ui.theme.Laboratorio3PMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio3PMTheme {
                PantallaPrincipal()
            }
        }
    }
}

@Composable
fun PantallaPrincipal(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.blue_white_modern_login_page_mockup_mobile_prototype),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = stringResource(R.string.title),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF254C4A)
            )

            Spacer(modifier = Modifier.height(20.dp))


            ListaTareas()
        }
    }
}

@Composable
fun ListaTareas() {
    val context = LocalContext.current
    var nuevaTarea by remember { mutableStateOf("") }
    val tareas = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(tareas) { tarea ->
                Text(text = tarea, modifier = Modifier.padding(8.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            TextField(
                value = nuevaTarea,
                onValueChange = { nuevaTarea = it },
                modifier = Modifier.weight(1f),
                placeholder = { Text("Escribe tu tarea") }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                if (nuevaTarea.isNotBlank()) {
                    tareas.add(nuevaTarea)
                    nuevaTarea = ""
                } else {
                    Toast.makeText(
                        context,
                        "Debes escribir algo para agregarlo a la lista.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }) {
                Text("Agregar tarea")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaPrincipalPreview() {
    Laboratorio3PMTheme {
        PantallaPrincipal()
    }
}
