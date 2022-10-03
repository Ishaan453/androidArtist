package com.example.androidartist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Quest1 extends AppCompatActivity {
    EditText ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10;
    Button Submit;
    ImageView img;
    int QueCount = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest1);

        ans1 = findViewById(R.id.Ans1);
        ans2 = findViewById(R.id.Ans2);
        ans3 = findViewById(R.id.Ans3);
        ans4 = findViewById(R.id.Ans4);
        ans5 = findViewById(R.id.Ans5);
        ans6 = findViewById(R.id.Ans6);
        ans7 = findViewById(R.id.Ans7);
        ans8 = findViewById(R.id.Ans8);
        ans9 = findViewById(R.id.Ans9);
        ans10 = findViewById(R.id.Ans10);

        img = findViewById(R.id.imageView);

        Submit  = findViewById(R.id.submit);

        setWidth();
        textSize();

        img.setImageResource(R.drawable.elonmusk);
        ans5.setEnabled(false);
        ans5.getLayoutParams().width=10;
        ans6.setEnabled(false);
        ans6.getLayoutParams().width=10;
        ans5.setBackgroundResource(R.drawable.no_background);
        ans6.setBackgroundResource(R.drawable.no_background);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(QueCount == 1){
                    if((ans1.getText().toString().equals("E") || ans1.getText().toString().equals("e")) && (ans2.getText().toString().equals("L") || ans2.getText().toString().equals("l")) && (ans3.getText().toString().equals("O") || ans3.getText().toString().equals("o")) && (ans4.getText().toString().equals("N") || ans4.getText().toString().equals("n")) && (ans7.getText().toString().equals("M") || ans7.getText().toString().equals("m")) && (ans8.getText().toString().equals("U") || ans8.getText().toString().equals("u")) && (ans9.getText().toString().equals("S") || ans9.getText().toString().equals("s")) && (ans10.getText().toString().equals("K") || ans10.getText().toString().equals("k"))){
                        QueCount++;
                        Toast.makeText(Quest1.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                        img.setImageResource(R.drawable.blackadam);

                        ans5.setEnabled(true);
                        ans5.getLayoutParams().width=100;
                        ans5.setBackgroundResource(R.drawable.ans_back);

                        ans6.getLayoutParams().width=20;

                        //NEED TO EMPTY EDIT TEXTS!!!
                        clear();

                    }

                    else{
                        Toast.makeText(Quest1.this, "Wrong Answer!", Toast.LENGTH_SHORT).show();
                    }

                }
                else if(QueCount == 2){
                    //Yet to be made
                    if((ans1.getText().toString().equals("B") || ans1.getText().toString().equals("b")) && (ans2.getText().toString().equals("L") || ans2.getText().toString().equals("l")) && (ans3.getText().toString().equals("A") || ans3.getText().toString().equals("a")) && (ans4.getText().toString().equals("C") || ans4.getText().toString().equals("c")) && (ans5.getText().toString().equals("K") || ans5.getText().toString().equals("k")) && (ans7.getText().toString().equals("A") || ans7.getText().toString().equals("a")) && (ans8.getText().toString().equals("D") || ans8.getText().toString().equals("d")) && (ans9.getText().toString().equals("A") || ans9.getText().toString().equals("a")) && (ans10.getText().toString().equals("M") || ans10.getText().toString().equals("m"))){
                        QueCount++;
                        Toast.makeText(Quest1.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                        img.setImageResource(R.drawable.ic_launcher_background);

                        ans6.setEnabled(true);
                        ans6.getLayoutParams().width=100;
                        ans6.setBackgroundResource(R.drawable.ans_back);

                        clear();

                    }
                }

                else if(QueCount == 3){

                }
            }
        });


    }

    void clear(){
        ans1.setText("");
        ans2.setText("");
        ans3.setText("");
        ans4.setText("");
        ans5.setText("");
        ans6.setText("");
        ans7.setText("");
        ans8.setText("");
        ans9.setText("");
        ans10.setText("");
    }

    void setWidth(){
        int width = 100;
        ans1.getLayoutParams().width=width;
        ans2.getLayoutParams().width=width;
        ans3.getLayoutParams().width=width;
        ans4.getLayoutParams().width=width;
        ans5.getLayoutParams().width=width;
        ans6.getLayoutParams().width=width;
        ans7.getLayoutParams().width=width;
        ans8.getLayoutParams().width=width;
        ans9.getLayoutParams().width=width;
        ans10.getLayoutParams().width=width;
    }

    void textSize(){
        int size = 30;
        ans1.setTextSize(size);
        ans2.setTextSize(size);
        ans3.setTextSize(size);
        ans4.setTextSize(size);
        ans5.setTextSize(size);
        ans6.setTextSize(size);
        ans7.setTextSize(size);
        ans8.setTextSize(size);
        ans9.setTextSize(size);
        ans10.setTextSize(size);

    }
}