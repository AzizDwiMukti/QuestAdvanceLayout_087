package com.example.questadvancelayout
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // ⬇️ Panggil fungsi tampilan utama kamu di sini
            Surface(modifier = Modifier.fillMaxSize(), color = Color.White) {
                KartuMahasiswaScreen()
            }
        }
    }
}

@Composable
fun KartuMahasiswaScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Judul utama
        Text(
            text = "Teknologi Informasi",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2C2C2C),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Universitas Muhammadiyah Yogyakarta",
            fontSize = 14.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Card 1
        MahasiswaCard(
            nama = "Bambang Sumantri",
            alamat = "Turi, Sleman",
            warna = Color(0xFF2C2C2C)
        )

        // Card 2
        MahasiswaCard(
            nama = "Azis Dwi Mukti",
            alamat = "Gamping",
            warna = Color(0xFF1565C0)
        )

        // Card 3
        MahasiswaCard(
            nama = "Bahlil",
            alamat = "Isi Alamat",
            warna = Color(0xFF2E7D32)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "copyright, 2025",
            color = Color.Gray,
            fontSize = 12.sp
        )
    }
}

@Composable
fun MahasiswaCard(nama: String, alamat: String, warna: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = warna),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy), // pastikan nama file logonya sama
                contentDescription = "Logo",
                modifier = Modifier
                    .size(55.dp)
                    .padding(end = 12.dp)
            )

            Column {
                Text(
                    text = nama,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    text = alamat,
                    color = Color.Yellow,
                    fontSize = 14.sp
                )
            }
        }
    }
}