package com.example.questadvancelayout.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun Activitaspertama(modifier: Modifier){
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(stringResource( R.String.prodi),
            fontSize = 35.sp,
            fontWeight = Fontweight.Bold)
        Text(stringResource(R.String.univ),
        fontSize = 22.sp)
        spacer(modifier = Modifier.height(25.dp))
        Card(modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp)

    }
    ){
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGrey

            )){
                Row (){
                    val gambar = painterResource(R.drawable.logo_umy)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier.size(100.dp).padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column (){
                        Text(

                        )
                    }
                    }
                }
    }
    }
){

    )){
        Row (){
            Column (){
                Text(
                    text = stringResource(R.string.nama),
                    fontSize = 30.dp

                )
            }

        }
    }
}





