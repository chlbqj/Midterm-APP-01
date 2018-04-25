package tw.edu.ntut.csie.app01_105590026;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mInput;
    private TextView mGrade;
    private Button mConvert;
    private TextView mOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrade = (TextView) findViewById(R.id.grade);
        mInput = (EditText) findViewById(R.id.input);
        mConvert = (Button) findViewById(R.id.convert);
        mOutput = (TextView) findViewById(R.id.ans);

        mConvert.setOnClickListener(convertClick);
    }

    private View.OnClickListener convertClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            letterGrade ml = new letterGrade();
            String _score;
            int score;
            _score = mInput.getText().toString();
            score = Integer.parseInt(_score);
            if(ml.letterGrade(score).equals((String)"等第：grade='X'")){
                mOutput.setText("輸入分數應介於[0..100]");
            }
            else {
                mOutput.setText(ml.letterGrade(score));
            }

        }
    };
}