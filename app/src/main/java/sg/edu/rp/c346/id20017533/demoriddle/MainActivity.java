package sg.edu.rp.c346.id20017533.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Event handling Step 1
    TextView tvq1;
    TextView tvq2;
    Button btnRevealQn1;
    Button btnRevealQn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);
        tvq1 = findViewById(R.id.tvQ1);
        btnRevealQn1 = findViewById(R.id.btnRevealQ1);
        btnRevealQn2=findViewById(R.id.btnRevealQ2);
        tvq2 = findViewById(R.id.tvQ2);

        btnRevealQn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent( MainActivity.this, AnswerActivity1.class);
                i.putExtra("Question", "Q1");
                startActivity(i);
            }
        });

        btnRevealQn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(  MainActivity.this, AnsActivity2.class);
                i.putExtra( "Question",  "Q2");
                startActivity(i);
            }
        });
    }
}
