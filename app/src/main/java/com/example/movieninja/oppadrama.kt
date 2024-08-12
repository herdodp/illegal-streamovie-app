package com.example.movieninja

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("DEPRECATION")
class oppadrama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_oppadrama)




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        val webviewoppadrama = findViewById<WebView>(R.id.webviewoppadrama)

        webviewoppadrama.webViewClient = WebViewClient()
        webviewoppadrama.settings.javaScriptEnabled = true
        webviewoppadrama.loadUrl("http://176.97.113.113")

        webviewoppadrama.settings.mediaPlaybackRequiresUserGesture = false
        webviewoppadrama.settings.setSupportMultipleWindows(true)
        webviewoppadrama.settings.setSupportZoom(true)
        webviewoppadrama.settings.builtInZoomControls = true
        webviewoppadrama.settings.displayZoomControls = false
        webviewoppadrama.settings.domStorageEnabled = true
        webviewoppadrama.settings.allowContentAccess = true
        webviewoppadrama.settings.mediaPlaybackRequiresUserGesture = false


        webviewoppadrama.webChromeClient = WebChromeClient()




    }


    override fun onBackPressed(){
        val webview = findViewById<WebView>(R.id.webviewoppadrama)
        if(webview.canGoBack()){
            webview.goBack()
        }else{
            super.onBackPressed()
        }
    }



}