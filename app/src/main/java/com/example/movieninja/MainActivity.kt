package com.example.movieninja

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "MOVIENINJA"



        //declare
        val lk211 = findViewById<Button>(R.id.lk21)
        val oppadrama1 = findViewById<Button>(R.id.oppadrama)
        val sarangfilm1 = findViewById<Button>(R.id.sarangfilm)
        val idlix1 = findViewById<Button>(R.id.idlix)


        //move intent
        lk211.setOnClickListener{
            startActivity(Intent(this, lk21::class.java))
        }

        oppadrama1.setOnClickListener{
            startActivity(Intent(this, oppadrama::class.java))
        }

        sarangfilm1.setOnClickListener{
            startActivity(Intent(this, sarangfilm::class.java))
        }

        idlix1.setOnClickListener{
            startActivity(Intent(this, idlix::class.java))
        }









    }



    override fun onBackPressed(){

        AlertDialog.Builder(this)
            .setTitle("Exit")
            .setMessage("Ingin keluar dari aplikasi ? ")
            .setCancelable(false)
            .setPositiveButton("Ya"){_,_ ->

                finishAffinity()

            }
            .setNegativeButton("Tidak"){default,_ ->

                default.dismiss()
            }
            .create()
            .show()

        super.onBackPressed()

    }




}