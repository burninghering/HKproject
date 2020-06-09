package com.example.healthkeeperplz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TimePicker;

import java.util.Calendar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //물 누르는거에 대한 변수입니다
    TextView water_ = null;
    Button plus = null;
    Button minus = null;
    Button check = null;
    public int water;

    //이미지 뷰
    int i = 0;
    ImageView imageview = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup(); // 물 +- 함수 입니다 없으면 작동 안해요


        //여기여기~
        TextView tv_username = (TextView) findViewById(R.id.tv_username); //이 부분은.. 체크리스트의 결과를 불러옵니다
        Intent intent2 = getIntent(); //이 액티비티를 부른 인텐트를 받는다.
        String username = intent2.getStringExtra("itpangpang");
        tv_username.setText("오늘의 증상 체크 결과 : \n" + username);


        //이미지뷰 관련
        Button button = (Button)findViewById(R.id.button);
        imageview = (ImageView)findViewById(R.id.imageView);

    }


    //버튼 누를때 물 양 +-
    private void setup() {
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        water_ = (TextView) findViewById(R.id.water_);

        plus.setOnClickListener(listener);
        minus.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.plus:
                    water = water + 200;
                    water_.setText("" + water + "ml");
                    break;
                case R.id.minus:
                    water = water - 200;
                    water_.setText("" + water + "ml");
                    break;
            }

            if ( water <0 ){
                water = 0;
                water_.setText("" + water + "ml");
            }
            if ( water == 0 ){
                imageview.setImageResource(R.drawable.water0);
            }
            if ( water == 200 ){
                imageview.setImageResource(R.drawable.water1);
            }

            if ( water == 400 ){
                imageview.setImageResource(R.drawable.water2);
            }
            if ( water == 600 ){
                imageview.setImageResource(R.drawable.water3);
            }
        }
    };




    //메뉴 구현
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
                Intent intent4 = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent4);
                break;
        }
        return true;
    }

}
