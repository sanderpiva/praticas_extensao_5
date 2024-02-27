package com.sanderpiva.appmatematico.Model.Proporcao;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.sanderpiva.appmatematico.R;

public class Vproporcao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        //getSupportActionBar().hide();

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = "https://www.youtube.com/playlist?list=PLqSrxnZNkztq5nCYKEAg2o_1gwL9g1XdA";
        //https://www.youtube.com/playlist?list=PLCXV5OW8ZZO8bpGnfT3L_G94zUysog06f
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