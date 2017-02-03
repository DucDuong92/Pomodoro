package com.example.ducduong.pomodoro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;

public class BVN1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bvn1);
        getReferences();
        setupUI();
    }
    private Spinner spFruit;
    private ImageView aaa;
    private EditText etSimple;
    private Button btnTest;
    private CheckBox ch_time;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    private RadioButton rbUndefined;
    private RatingBar rtbSimple;
    private SeekBar sbSimple;

    private void getReferences(){
        spFruit = (Spinner) findViewById(R.id.sp_fruits);
        aaa = (ImageView) findViewById(R.id.aaa);
        etSimple = (EditText) findViewById(R.id.et_simple);
        btnTest = (Button) findViewById(R.id.btn_test);
        ch_time = (CheckBox)findViewById(R.id.ch_time);

        rbMale = (RadioButton) findViewById(R.id.rb_male);
        rbFemale = (RadioButton) findViewById(R.id.rb_female);
        rbUndefined = (RadioButton) findViewById(R.id.rb_undefined);
        rtbSimple = (RatingBar) findViewById(R.id.rtb_simple);
        sbSimple = (SeekBar) findViewById(R.id.sb_simple);
    }
    private void setupUI() {
        aaa.setImageResource(R.drawable.aaa);

        //Spiner
        String[] fruits = new String[]{
                "Apple",
                "Orange",
                "Kiwi",
                "Pineapple"
        };
        //2
        ArrayAdapter<String> fruitsArrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                fruits
        );
        //3
        spFruit.setAdapter(fruitsArrayAdapter);

        rbMale.setChecked(true);

    }

    private void addListeners(){
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //read
               // Log.d(TAG, "r");
            }
        });
        sbSimple.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }



}
