package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Quest2 extends AppCompatActivity {

    TextView questions;
    EditText answer;
    Button submit;
    int QueCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest2);

        questions = findViewById(R.id.question);
        answer = findViewById(R.id.answer);
        submit = findViewById(R.id.button);



        questions.setText("Which creature is davey jones pet?");
        answer.setHint("1 word, 6 letters");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QueCount == 1){
                    if(answer.getText().toString().equalsIgnoreCase("Kraten")){
                        QueCount++;
                        Toast.makeText(Quest2.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("What was will turners job before he became a pirate?");
                        clear();
                        answer.setHint("1 word, 10 letters");

                    }

                    else{
                        Toast.makeText(Quest2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }

                if(QueCount == 2){
                    if(answer.getText().toString().equalsIgnoreCase("Blacksmith")){
                        QueCount++;
                        Toast.makeText(Quest2.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("Who frees jack sparrow from the prison?");
                        clear();
                        answer.setHint("2 words, 4 letters and 6 letters");

                    }

                    else{
                        Toast.makeText(Quest2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }

                if(QueCount == 3){
                    if(answer.getText().toString().equalsIgnoreCase("Will Turner")){
                        QueCount++;
                        Toast.makeText(Quest2.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("What piece of clothing makes Elizabeth faint ?");
                        clear();
                        answer.setHint("1 words, 6 letters");
                    }

                    else{
                        Toast.makeText(Quest2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }

                }

                if(QueCount == 4){
                    if(answer.getText().toString().equalsIgnoreCase("Corset")){
                        QueCount++;
                        Toast.makeText(Quest2.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        questions.setText("What does davey jones have growing out of his face?");
                        clear();
                        answer.setHint("1 words, 9 letters");
                    }

                    else{
                        Toast.makeText(Quest2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }

                if(QueCount == 5){
                    if(answer.getText().toString().equalsIgnoreCase("Tentacles")){
                        QueCount++;
                        Toast.makeText(Quest2.this, "Correct Answer!", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(Quest2.this, End_Screen.class));
                        finish();
                    }

                    else{
                        Toast.makeText(Quest2.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    void clear(){
        answer.setText("");
    }
}