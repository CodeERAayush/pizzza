package com.aayushpandey.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar=findViewById(R.id.progressBar);
        getSupportActionBar().hide();
        Thread thread = new Thread() {
            public void run() {
try {
 sleep(3000);
}catch (Exception e){
    e.printStackTrace();
}
finally {
    try {
        progressBar.setVisibility(View.GONE);
    }catch (Exception e){
        e.printStackTrace();
    }
    finally {
        Intent intent =new Intent(SplashActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }


}
            }
        };thread.start();
    }
}