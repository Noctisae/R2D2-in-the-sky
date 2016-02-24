package fr.pierreyvesmingam.robotr2d2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide);
    }

    public void retour(View view){
        finish();

    }
}
