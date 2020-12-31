package com.exemple.andikwashuleni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FormulaireIndividuel extends AppCompatActivity {

    private ImageView play; //on fqit appel a notre image pour clicker qui se trouve dqns xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire_individuel);

        this.play = (ImageView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), FormulaireTerminer.class);
                startActivity(otherActivity);
                finish();
            }

        });
    }
}