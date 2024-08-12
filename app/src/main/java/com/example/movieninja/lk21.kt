package com.example.movieninja

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lk21 : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lk21)

        // Mengatur padding untuk elemen utama dengan memperhitungkan jendela sistem
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi WebView
        val webViewLk21 = findViewById<WebView>(R.id.webviewlk21)

        // Menyeting WebViewClient untuk menangani navigasi dan kesalahan
        webViewLk21.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: android.graphics.Bitmap?) {
                super.onPageStarted(view, url, favicon)
                // Tampilkan loading indicator atau pesan jika diperlukan
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                // Tindakan setelah halaman selesai dimuat
            }

            override fun onReceivedError(
                view: WebView?, request: WebResourceRequest?, error: android.webkit.WebResourceError?
            ) {
                super.onReceivedError(view, request, error)
                Toast.makeText(this@lk21, "Gagal memuat halaman", Toast.LENGTH_SHORT).show()
            }
        }

        // Menyeting WebChromeClient untuk menangani fitur tambahan seperti progress bar
        webViewLk21.webChromeClient = WebChromeClient()

        // Mengaktifkan JavaScript dan pengaturan media
        webViewLk21.settings.javaScriptEnabled = true
        webViewLk21.settings.domStorageEnabled = true
        webViewLk21.settings.allowContentAccess = true
        webViewLk21.settings.allowFileAccess = true

        // Memuat URL
        webViewLk21.loadUrl("https://tv.lk21official.online")
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        val webView = findViewById<WebView>(R.id.webviewlk21)
        if (webView.canGoBack()) {
            webView.goBack() // Kembali ke halaman sebelumnya di WebView
        } else {
            super.onBackPressed() // Keluar dari activity jika tidak bisa kembali
        }
    }
}
