package sg.edu.rp.c346.id20017533.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnsActivity2 extends AppCompatActivity {
TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans2);

        tvAnswer=findViewById(R.id.textView2);
        Intent i=getIntent();
        String questionsSelected = i.getStringExtra("Question");
        tvAnswer.setText(" answer is:Gone");
    }
}