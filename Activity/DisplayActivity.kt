package com.example.latihanpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView

class DisplayActivity : ComponentActivity() {

    lateinit var outputNama: TextView
    lateinit var outputEmail: TextView
    lateinit var outputJK: TextView
    lateinit var outputUmur: TextView
    lateinit var outputAlamat: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        outputNama = findViewById(R.id.outputNama)
        outputEmail = findViewById(R.id.outputEmail)
        outputJK = findViewById(R.id.outputJK)
        outputUmur = findViewById(R.id.outputUmur)
        outputAlamat = findViewById(R.id.outputAlamat)

        val nama = intent.getStringExtra("Nama")
        val email = intent.getStringExtra("Email")
        val jk = intent.getStringExtra("JK")
        val umur = intent.getStringExtra("Umur")
        val alamat = intent.getStringExtra("Alamat")

        if (nama != null && email != null && jk != null && umur != null && alamat != null) {
            outputNama.text = "Nama = $nama"
            outputEmail.text = "Email = $email"
            outputJK.text = "JK = $jk"
            outputUmur.text = "Umur = $umur tahun"
            outputAlamat.text = "Alamat = $alamat"
        }
    }
}