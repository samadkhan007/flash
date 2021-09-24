package edu.uol.mad.flash;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashscreen<SPLASH_TIME_OUT> extends AppCompatActivity {



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

}
