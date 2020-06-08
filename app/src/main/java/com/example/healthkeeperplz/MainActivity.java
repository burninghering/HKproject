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
import android.widget.TimePicker;

import java.util.Calendar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //여기여기~
        TextView tv_username = (TextView) findViewById(R.id.tv_username); //이 부분은.. 체크리스트의 결과를 불러옵니다
        Intent intent2 = getIntent(); //이 액티비티를 부른 인텐트를 받는다.
        String username = intent2.getStringExtra("itpangpang");
        tv_username.setText("선택 결과 : " + username);

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
                Intent intent4 = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent4);
                break;
        }
        return true;
    }

}
