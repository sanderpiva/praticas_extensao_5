package com.sanderpiva.appmatematico.Model.PerimetroQuadrado;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.sanderpiva.appmatematico.R;

public class MaterialApoioPerimetroQuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = "https://drive.google.com/drive/folders/1qvGLwu9vJTJ1PLvp6Ijh2UNaLLqwK9H1?usp=sharing";
        //esc_machado: https://drive.google.com/drive/folders/1umYG2ZPPfyif-MZbKjHzXT-kuIdJzDmZ
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
