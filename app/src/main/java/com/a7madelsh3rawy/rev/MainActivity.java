package com.a7madelsh3rawy.rev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.a7madelsh3rawy.rev.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        Bundle bundle = new Bundle();
        Intent intent = new Intent(this, MainActivity2.class);
        bundle.putString("k", "kkkkkkkkkkkkkkkkkkk");
        intent.putExtras(bundle);
        mainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });
    }


}
