package com.doxua.www.facer4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsActivity extends AppCompatActivity {
    //When the notification is clicked on the phone, a new screen will appear

    public Button backMenu;
    int defaultValue = 0;
    private ImageView imageView;
    private TextView tv;
    static TextView result_information;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Log.d("PLAYGROUND", "Details ID: " + getIntent().getIntExtra("EXTRA_DETAILS_ID", defaultValue));
        counter =getIntent().getIntExtra("EXTRA_DETAILS_ID", defaultValue);

        imageView = (ImageView) findViewById(R.id.imageView);
        tv = (TextView) findViewById(R.id.predict_faces);
        result_information = (TextView) findViewById(R.id.result);

        pullFromMain();
        menuButton();
    }


    public void pullFromMain(){



    }


    public void menuButton(){

        backMenu=(Button)findViewById(R.id.BackButton);
        backMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuBu = new Intent(DetailsActivity.this, MainActivity.class);

                startActivity(menuBu);
            }
        });
    }


}









