package com.example.healthkeeperplz;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class checklistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //액티비티의 화면이 보여지는 함수
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.enrmsenrms);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.xeroderma);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.anorexia);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.Urinaryfrequency);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.chest);
        final CheckBox cb6 = (CheckBox) findViewById(R.id.dizziness);
        final CheckBox cb7 = (CheckBox) findViewById(R.id.impotent);
        final CheckBox cb8 = (CheckBox) findViewById(R.id.dehydration);
        final CheckBox cb9 = (CheckBox) findViewById(R.id.pruritus);
        final CheckBox cb10 = (CheckBox) findViewById(R.id.chest1);
        final CheckBox cb11 = (CheckBox) findViewById(R.id.fatigue);
        final CheckBox cb12 = (CheckBox) findViewById(R.id.sick);

        Button b = (Button) findViewById(R.id.transbtn);
        final TextView tv = (TextView) findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";  // 결과를 출력할 문자열  ,  항상 스트링은 빈문자열로 초기화 하는 습관을 가지자
                if (cb1.isChecked() == true) result += cb1.getText().toString();
                if (cb2.isChecked() == true) result += cb2.getText().toString();
                if (cb3.isChecked() == true) result += cb3.getText().toString();
                if (cb4.isChecked() == true) result += cb4.getText().toString();
                if (cb5.isChecked() == true) result += cb5.getText().toString();
                if (cb6.isChecked() == true) result += cb6.getText().toString();
                if (cb7.isChecked() == true) result += cb7.getText().toString();
                if (cb8.isChecked() == true) result += cb8.getText().toString();
                if (cb9.isChecked() == true) result += cb9.getText().toString();
                if (cb10.isChecked() == true) result += cb10.getText().toString();
                if (cb11.isChecked() == true) result += cb11.getText().toString();
                if (cb12.isChecked() == true) result += cb12.getText().toString();

                tv.setText("선택결과:" + result);

                Intent intent = new Intent(checklistActivity.this, MainActivity.class);
                intent.putExtra("itpangpang",result);
                startActivity(intent);
            } // end onClick
        }); // end setOnClickListener

    } // end onCreate()

}

