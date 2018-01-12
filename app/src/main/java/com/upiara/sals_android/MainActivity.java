package com.upiara.sals_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    final int mUIFlag =
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // modo imersão
        getWindow().getDecorView().setSystemUiVisibility(mUIFlag);

        WebView webView = (WebView) findViewById(R.id.activity_main_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://sals.upiara.com");
    }

    @Override
    protected void onResume() {
        super.onResume();

        // modo imersão
        getWindow().getDecorView().setSystemUiVisibility(mUIFlag);
    }
}
