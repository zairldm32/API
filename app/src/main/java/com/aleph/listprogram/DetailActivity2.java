package com.aleph.listprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity2 extends AppCompatActivity {

    ImageView imageViewFotoProgram;
    TextView textViewNamaProgram, textViewInfoProgram, textLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        imageViewFotoProgram = findViewById(R.id.imageViewFotoProgram);
        textViewNamaProgram = findViewById(R.id.textViewNamaProgram);
        textViewInfoProgram = findViewById(R.id.textViewinfoProgram);
        textLink = findViewById(R.id.textLink);


        getIncomingExtra();

    }

    private void getIncomingExtra() {

        if (getIntent().hasExtra("foto program") && getIntent().hasExtra("nama program") && getIntent().hasExtra("info program") && getIntent().hasExtra("link")) {

            String fotoProgram = getIntent().getStringExtra("foto program");
            String namaProgram = getIntent().getStringExtra("nama program");
            String infoProgram = getIntent().getStringExtra("info program");
            String link = getIntent().getStringExtra(("link"));

            setDataActivity(fotoProgram,namaProgram,infoProgram,link);

        }

    }
    private void setDataActivity(String fotoProgram, String namaProgram, String infoProgram, String link){

        Glide.with(this).asBitmap().load(fotoProgram).into(imageViewFotoProgram);

        textViewNamaProgram.setText(namaProgram);
        textViewInfoProgram.setText(infoProgram);
        textLink.setText(link);
    }
}
