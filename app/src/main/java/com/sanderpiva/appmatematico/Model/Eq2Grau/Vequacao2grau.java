package com.sanderpiva.appmatematico.Model.Eq2Grau;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.sanderpiva.appmatematico.R;

public class Vequacao2grau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        //getSupportActionBar().hide();

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        String url = "https://www.youtube.com/watch?v=HCylt5HtFMs&list=PLGyv8aUrOlzBk-ctqa9e7jBlLxnqGcrho";
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
