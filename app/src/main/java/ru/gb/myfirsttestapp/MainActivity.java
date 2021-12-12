package ru.gb.myfirsttestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView nameTV;
    private Button changeNameButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.new_activity_main);


        nameTV = findViewById(R.id.name_text_view);
        changeNameButton = findViewById(R.id.change_name_text_view);

        changeNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameTV.setText("Well Done");
            }
        });
    }
    }
