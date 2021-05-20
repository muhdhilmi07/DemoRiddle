package sg.edu.rp.c346.id20017533.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer=findViewById(R.id.textView);
        Intent i=getIntent();
        String questionSelected=i.getStringExtra("Question");
        tvAnswer.setText(questionSelected+" answer is: Queue");
        }
    }