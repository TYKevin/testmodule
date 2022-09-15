package com.test.testmodule;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activity);

        findViewById(R.id.btn_showToast).setOnClickListener(view -> {
            Toast.makeText(this, "展示Toast信息", Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.btn_toActivity).setOnClickListener(view -> {
           Intent intent = new Intent(this, TestIntentActivity.class);
           startActivity(intent);
        });
    }
}
