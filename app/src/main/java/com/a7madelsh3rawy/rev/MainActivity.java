package com.a7madelsh3rawy.rev;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.a7madelsh3rawy.rev.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        mainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Locale newLocale = new Locale("ar");
                Resources resources = getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.setLocale(newLocale);
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());


                recreate();
            }
        });

    }


}
