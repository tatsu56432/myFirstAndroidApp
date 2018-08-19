package com.example.t_nakajima.ap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView webView1 = (WebView) findViewById(R.id.webView02);
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("file:///android_asset/index.html");
//        webView1.loadUrl("https:google.com");
    }



    public void historyBack(View view){
        Intent intent = new Intent(WebActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
