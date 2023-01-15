package com.example.registroocupaciones.ui.carpetas.ocupaciones.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.registroocupaciones.R
import java.time.format.TextStyle

@Composable
fun Registro(){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(50.dp)){
        RegistroOcupaciones(Modifier.align(Alignment.Center))
    }
}

@Composable
fun RegistroOcupaciones(modifier: Modifier) {
    Column(modifier = modifier) {
        CenterText(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
        Descripcion()
        Spacer(modifier = Modifier.padding(4.dp),)
        Salario()
        Spacer(modifier = Modifier.padding(8.dp))
        GuardarButton(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun GuardarButton(modifier: Modifier) {
        OutlinedButton(
            onClick = { },
            contentPadding = PaddingValues(
                start = 50.dp,
                top = 20.dp,
                end = 60.dp,
                bottom = 18.dp
            ),

            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color(0xFF6A2377)
            ),
            modifier = modifier,
            shape = CircleShape,
        )
        {
            Image(painter = painterResource(id = R.drawable.save), contentDescription = "imagen" )
            //Icon(Icons.Filled.Add, contentDescription = "Agregar", modifier = Modifier.size(ButtonDefaults.IconSize))
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Guardar", fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                color = Color.White)
        }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Salario(){
    var text by remember {
        mutableStateOf("") }
    Surface(
        modifier = Modifier.padding(16.dp),
        border = BorderStroke(2.dp, Color.Black),
        contentColor = Color.Blue,
        elevation = 8.dp
    ) {
        OutlinedTextField(
            value = text, onValueChange = {text = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Salario",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.body1.merge(),
                color = Color(0xFF181515)
            )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color(0xFF857C7C),
                backgroundColor = Color(0xFFFFFFF),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}
@Composable
fun Descripcion(){
    var text by remember {
        mutableStateOf("") }
    Surface(
        modifier = Modifier.padding(16.dp),
        border = BorderStroke(2.dp, Color.Black),
        contentColor = Color.Blue,
        elevation = 8.dp,
    ) {
        OutlinedTextField(
            value = text, onValueChange = {text = it},
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Descripcion",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.body1.merge(),
                    color = Color(0xFF181515)
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color(0xFF857C7C),
                backgroundColor = Color(0xFFFFFFF),
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
    }
}
@Composable
fun CenterText(modifier: Modifier) {
    Text("Registro de Ocupaciones",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        fontSize = 28.sp,
        textAlign = TextAlign.Center,
        modifier = modifier)
}