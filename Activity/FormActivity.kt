package com.example.latihanpam

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class FormActivity : ComponentActivity() {

    lateinit var inputNama: EditText
    lateinit var inputEmail: EditText
    lateinit var inputJK: EditText
    lateinit var inputUmur: EditText
    lateinit var inputAlamat: EditText
    lateinit var buttonSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        inputNama = findViewById(R.id.inputNama)
        inputEmail = findViewById(R.id.inputEmail)
        inputJK = findViewById(R.id.inputJK)
        inputUmur = findViewById(R.id.inputUmur)
        inputAlamat = findViewById(R.id.inputAlamat)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        // Menambahkan onClickListener pada tombol "Submit"
        buttonSubmit.setOnClickListener {
            // Membuat Intent untuk beralih ke DisplayActivity
            val intent = Intent(this, DisplayActivity::class.java)

            // Menambahkan data yang ingin dipindahkan ke DisplayActivity
            intent.putExtra("Nama", inputNama.text.toString())
            intent.putExtra("Email", inputEmail.text.toString())
            intent.putExtra("JK", inputJK.text.toString())
            intent.putExtra("Umur", inputUmur.text.toString())
            intent.putExtra("Alamat", inputAlamat.text.toString())

            // Memulai Activity DisplayActivity
            startActivity(intent)
        }
    }
}

