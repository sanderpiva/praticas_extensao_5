package com.sanderpiva.appmatematico.Model.Proporcao;


import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.sanderpiva.appmatematico.R;

public class MaterialApoioProporcao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = "https://drive.google.com/drive/folders/1n0XJK4q7tgtiqVZ3vLvXAt8zhsavQp38?usp=sharing";
        //https://drive.google.com/drive/folders/1F0RktWr6eyNGVEv_8vhXO1y3Vg-L8HSI
        //https://drive.google.com/drive/folders/1n0XJK4q7tgtiqVZ3vLvXAt8zhsavQp38?usp=sharing
        webView.loadUrl(url);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }
        });

    }
}