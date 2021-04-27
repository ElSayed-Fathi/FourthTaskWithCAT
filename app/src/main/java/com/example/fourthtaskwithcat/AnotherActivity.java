package com.example.fourthtaskwithcat;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, describtion;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);

        }//if()

        imageView = findViewById(R.id.another_imageview);
        title = findViewById(R.id.title_text);
        describtion = findViewById(R.id.describtion_text);


        for (int i = 0; i < 16; i++) {

            if (position == i) {

                Intent intent = getIntent();
                Bundle bundle = this.getIntent().getExtras();
                int pic = bundle.getInt("image");
                String aTitle = intent.getStringExtra("title");
                String aDescription = intent.getStringExtra("discribtion");

                imageView.setImageResource(pic);
                title.setText(aTitle);
                describtion.setText(aDescription);
                actionBar.setTitle(aTitle);
            }//if()

        }//for()


    }//onCreat()

}//AnotherActivity