package com.example.healthkeeperplz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;


import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

public class InbodyActivity extends AppCompatActivity {

    //알림 시간설정-지연
    private TimePicker timePicker;
    private AlarmManager alarmManager;
    private int hour, minute;


    EditText editText;  // 이름입력
    EditText editText2; // 나이입력
    EditText editText3; // 몸무게 입력
    EditText editText4; // 키 입력
    EditText editText5; //체수분 입력
    EditText editText6; //단백질 입력
    EditText editText7; //무기질 입력
    EditText editText8; //체지방 입력

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbody);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);



    }

    public void Button1Clicked(View v) {
        // 사용자가 입력한 나이와 이름을 가져와서 임시 변수에 저장
        String inputName = this.editText.getText().toString().trim();
        String inputAge = this.editText2.getText().toString().trim();
        String inputWeight = this.editText3.getText().toString().trim();
        String inputHeight = this.editText4.getText().toString().trim();
        String inputbodywater = this.editText5.getText().toString().trim();
        String inputprotein = this.editText6.getText().toString().trim();
        String inputmineral = this.editText7.getText().toString().trim();
        String inputbodyfat = this.editText8.getText().toString().trim();


        // 데이터 입력여부 확인
        if(inputName.length() > 0 && inputAge.length() > 0) {

            //Intent 객체를 생성
            Intent intent = new Intent(this, ResultActivity.class);

            // 사용자가 입력한 이름과 나이를 인텐트 객체에 저장
            intent.putExtra("name", inputName);
            intent.putExtra("age", Integer.parseInt(inputAge));
            intent.putExtra("weight", Integer.parseInt(inputWeight));
            intent.putExtra("height", Integer.parseInt(inputHeight));
            intent.putExtra("bodywater", Integer.parseInt(inputbodywater));
            intent.putExtra("protein", Integer.parseInt(inputprotein));
            intent.putExtra("mineral", Integer.parseInt(inputmineral));
            intent.putExtra("bodyfat", Integer.parseInt(inputbodyfat));
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.menu2:
                Intent intent2 = new Intent(this, TrainerActivity.class);
                startActivity(intent2);
                break;
            case R.id.menu3:
                Intent intent3 = new Intent(this, InbodyActivity.class);
                startActivity(intent3);
                break;
            case R.id.menu4:
                Intent intent4 = new Intent(this, SettingActivity.class);
                startActivity(intent4);
                break;

        }
        return true;
    }

}

