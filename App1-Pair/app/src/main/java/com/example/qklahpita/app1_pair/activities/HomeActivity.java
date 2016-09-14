package com.example.qklahpita.app1_pair.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.qklahpita.app1_pair.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView btnSetting;
    private ImageView btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    private void init(){
        btnPlay = (ImageView) findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(this);
        btnSetting = (ImageView) findViewById(R.id.btn_setting);
        btnSetting.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_play:
                Intent intent = new Intent(HomeActivity.this, PlayActivity.class);
                startActivity(intent);
                break;
        }
    }
}
