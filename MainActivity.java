package com.example.joker.findit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class FindItMainActivity extends Anagram {
    private TextView txvw;
    private EditText edvw;
    private Button ckbtn;
    private Button ngbtn;
    private String wordtofind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_it_main);
        setupuiviews();
        //newgame();
        ckbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                validate();
            }
        });
        ngbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                newgame();
            }
        });
    }
    public void setupuiviews()
    {
        txvw=(TextView)findViewById(R.id.hintid);
        edvw=(EditText)findViewById(R.id.tryid);
        ckbtn=(Button)findViewById(R.id.ckid);
        ngbtn=(Button) findViewById(R.id.newid);}

    public void validate(){
                  String w=edvw.getText().toString().toUpperCase();
                  if (wordtofind.equals(w))
                  {

                    // public static Toast.makeText (this,"CONGRATULATIONS!, you found the word" +wordtofind , Toast.LENGTH_SHORT).show();
                         Toast.makeText(FindItMainActivity.this,"CONGRATULATIONS!, you found the word" +" " +wordtofind , Toast.LENGTH_SHORT).show();
                      newgame();
                  }
                  else {
                      Toast.makeText(FindItMainActivity.this,"closer!!!, don't give up"  , Toast.LENGTH_SHORT).show();
                  }

              }
              public void newgame(){
                  wordtofind=Anagram.randomword();
                  String wordshuffle=Anagram.shuffleword(wordtofind);
                  txvw.setText(wordshuffle);
                  edvw.setText("");
              }
          }
