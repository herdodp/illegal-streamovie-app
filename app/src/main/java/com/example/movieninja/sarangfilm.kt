package com.example.movieninja

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class sarangfilm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sarangfilm)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val webviewsarangfilm = findViewById<WebView>(R.id.webviewsarangfilm)

        webviewsarangfilm.webViewClient = WebViewClient()
        webviewsarangfilm.settings.javaScriptEnabled = true
        webviewsarangfilm.loadUrl("https://sarangfilm21.store")



    }


    override fun onBackPressed() {
        val webview = findViewById<WebView>(R.id.webviewsarangfilm)
        if(webview.canGoBack()){
            webview.goBack()
        }else{
            super.onBackPressed()
        }
    }




}