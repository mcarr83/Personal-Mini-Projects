package com.example.travphrase;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String language;

    public void play(View view){
        Button counter = (Button) view;

        int tag = Integer.parseInt(counter.getTag().toString());
        Log.i("Pressing tag: ", counter.getTag().toString());

        MediaPlayer media;

        //Depending on tag says the phrase and language string
        //****************************Spanish*****************************************************
        if(language.equals("Spanish")){
            if (tag == 0){
                media = MediaPlayer.create(this, R.raw.spexcuseme);
                media.start();
            }else if(tag == 1){
                media = MediaPlayer.create(this, R.raw.spbye);
                media.start();
            }else if(tag == 2){
                media = MediaPlayer.create(this, R.raw.sphello);
                media.start();
            }else if(tag == 3){
                media = MediaPlayer.create(this, R.raw.sphowmuchisthis);
                media.start();
            }else if(tag == 4){
                media = MediaPlayer.create(this, R.raw.spiwillhavethis);
                media.start();
            }else if(tag == 5){
                media = MediaPlayer.create(this, R.raw.spplease);
                media.start();
            }else if(tag == 6){
                media = MediaPlayer.create(this, R.raw.spthankyou);
                media.start();
            }else if(tag == 7){
                media = MediaPlayer.create(this, R.raw.spwherecanifindsomewater);
                media.start();
            }else if(tag == 8){
                media = MediaPlayer.create(this, R.raw.spwheredoigo);
                media.start();
            }else if(tag == 9){
                media = MediaPlayer.create(this, R.raw.spwhereisthebathroom);
                media.start();
            }else if(tag == 10){
                media = MediaPlayer.create(this, R.raw.spwhereisthisplace);
                media.start();
            }//****************************French***************************************************
        }else if (language.equals("French")){
            //Toast.makeText(this, language+" coming soon", Toast.LENGTH_SHORT).show();
            if (tag == 0){
                media = MediaPlayer.create(this, R.raw.frexcuseme);
                media.start();
            }else if(tag == 1){
                media = MediaPlayer.create(this, R.raw.frgoodbye);
                media.start();
            }else if(tag == 2){
                media = MediaPlayer.create(this, R.raw.frhello);
                media.start();
            }else if(tag == 3){
                media = MediaPlayer.create(this, R.raw.frcost);
                media.start();
            }else if(tag == 4){
                media = MediaPlayer.create(this, R.raw.friwillhavethis);
                media.start();
            }else if(tag == 5){
                media = MediaPlayer.create(this, R.raw.frplease);
                media.start();
            }else if(tag == 6){
                media = MediaPlayer.create(this, R.raw.frthankyou);
                media.start();
            }else if(tag == 7){
                media = MediaPlayer.create(this, R.raw.frwater);
                media.start();
            }else if(tag == 8){
                media = MediaPlayer.create(this, R.raw.frwheredoigo);
                media.start();
            }else if(tag == 9){
                media = MediaPlayer.create(this, R.raw.frtoliet);
                media.start();
            }else if(tag == 10){
                media = MediaPlayer.create(this, R.raw.frwhereplace);
                media.start();
            }//****************************Italian**************************************************
        }else if (language.equals("Italian")){
            //Toast.makeText(this, language+" coming soon", Toast.LENGTH_SHORT).show();
            if (tag == 0){
                media = MediaPlayer.create(this, R.raw.itexcuse);
                media.start();
            }else if(tag == 1){
                media = MediaPlayer.create(this, R.raw.itgoodbye);
                media.start();
            }else if(tag == 2){
                media = MediaPlayer.create(this, R.raw.ithello);
                media.start();
            }else if(tag == 3){
                media = MediaPlayer.create(this, R.raw.itcost);
                media.start();
            }else if(tag == 4){
                media = MediaPlayer.create(this, R.raw.ithavethis);
                media.start();
            }else if(tag == 5){
                media = MediaPlayer.create(this, R.raw.itplease);
                media.start();
            }else if(tag == 6){
                media = MediaPlayer.create(this, R.raw.itthankyou);
                media.start();
            }else if(tag == 7){
                media = MediaPlayer.create(this, R.raw.itwater);
                media.start();
            }else if(tag == 8){
                media = MediaPlayer.create(this, R.raw.itwherego);
                media.start();
            }else if(tag == 9){
                media = MediaPlayer.create(this, R.raw.ittoliet);
                media.start();
            }else if(tag == 10){
                media = MediaPlayer.create(this, R.raw.itwhereplace);
                media.start();
            }//****************************Japanese*************************************************
        }else if (language.equals("Japanese")){
            //Toast.makeText(this, language+" coming soon", Toast.LENGTH_SHORT).show();
            if (tag == 0){
                media = MediaPlayer.create(this, R.raw.jpexcuse);
                media.start();
            }else if(tag == 1){
                media = MediaPlayer.create(this, R.raw.jpgoodbye);
                media.start();
            }else if(tag == 2){
                media = MediaPlayer.create(this, R.raw.jphello);
                media.start();
            }else if(tag == 3){
                media = MediaPlayer.create(this, R.raw.jpcost);
                media.start();
            }else if(tag == 4){
                media = MediaPlayer.create(this, R.raw.jpthis);
                media.start();
            }else if(tag == 5){
                media = MediaPlayer.create(this, R.raw.jpplease);
                media.start();
            }else if(tag == 6){
                media = MediaPlayer.create(this, R.raw.jpthankyou);
                media.start();
            }else if(tag == 7){
                media = MediaPlayer.create(this, R.raw.jpwater);
                media.start();
            }else if(tag == 8){
                media = MediaPlayer.create(this, R.raw.jpwherego);
                media.start();
            }else if(tag == 9){
                media = MediaPlayer.create(this, R.raw.jptoliet);
                media.start();
            }else if(tag == 10){
                media = MediaPlayer.create(this, R.raw.jpwhereplace);
                media.start();
            }//****************************German***************************************************
        }else if (language.equals("German")){
            //Toast.makeText(this, language+" coming soon", Toast.LENGTH_SHORT).show();
            if (tag == 0){
                media = MediaPlayer.create(this, R.raw.grexcuse);
                media.start();
            }else if(tag == 1){
                media = MediaPlayer.create(this, R.raw.grgoodbye);
                media.start();
            }else if(tag == 2){
                media = MediaPlayer.create(this, R.raw.grhello);
                media.start();
            }else if(tag == 3){
                media = MediaPlayer.create(this, R.raw.grcost);
                media.start();
            }else if(tag == 4){
                media = MediaPlayer.create(this, R.raw.grhavethis);
                media.start();
            }else if(tag == 5){
                media = MediaPlayer.create(this, R.raw.grplease);
                media.start();
            }else if(tag == 6){
                media = MediaPlayer.create(this, R.raw.grthankyou);
                media.start();
            }else if(tag == 7){
                media = MediaPlayer.create(this, R.raw.grwater);
                media.start();
            }else if(tag == 8){
                media = MediaPlayer.create(this, R.raw.grwherego);
                media.start();
            }else if(tag == 9){
                media = MediaPlayer.create(this, R.raw.grtoliet);
                media.start();
            }else if(tag == 10){
                media = MediaPlayer.create(this, R.raw.grwhereplace);
                media.start();
            }else
                Toast.makeText(this, "This shouldn't happen", Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(this, "Please pick a language", Toast.LENGTH_LONG).show();

    }

    public void startup(){
        ImageView wood = (ImageView)findViewById(R.id.woodView);
        ImageView wine = (ImageView)findViewById(R.id.wineView);
        ImageView desert = (ImageView)findViewById(R.id.desertView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        androidx.gridlayout.widget.GridLayout gridLayout = findViewById(R.id.grid);
        //Initial alpha to zero
        gridLayout.setAlpha(0);
        spinner.setAlpha(0);

        //Pic coming in left to right
        wood.animate().alpha(1);
        wood.setTranslationX(-1500);
        wood.animate().translationXBy(3000).setDuration(3000);

        //Pic coming in right to left
        wine.animate().alpha(1);
        wine.setTranslationX(1500);
        wine.animate().translationXBy(-3000).setDuration(3000).setStartDelay(2000);

        //pic coming in from bottom
        desert.animate().alpha(1);
        desert.setTranslationY(3000);
        desert.animate().translationYBy(-6000).setDuration(4000).setStartDelay(3500);

        //Displaying grid with buttons
        //GridLayout gridLayout = (GridLayout)findViewById(R.id.grid);
        gridLayout.animate().alpha(1).setStartDelay(7000);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Select Language");
        categories.add("Spanish");
        categories.add("French");
        categories.add("Italian");
        categories.add("German");
        categories.add("Japanese");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner.animate().alpha(1).setStartDelay(7000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startup();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        language = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
