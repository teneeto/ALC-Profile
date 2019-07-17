package com.example.myprofile;

import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    private WebView aboutAlcWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        ActionBar aboutAlcBar = getSupportActionBar();
        aboutAlcBar.setTitle("About ALC");

        aboutAlcWebView = findViewById(R.id.about_alc_view);
        aboutAlcWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        WebSettings webSettings = aboutAlcWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        aboutAlcWebView.loadUrl("https://andela.com/alc/");
    }

    @Override
    public void onBackPressed() {
        if (aboutAlcWebView.canGoBack()){
            aboutAlcWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
