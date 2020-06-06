package com.example.healthkeeperplz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class inbodyqna1Activity extends AppCompatActivity {
    ArrayList<String> mDatas = new ArrayList<String>();
    ListView listview; //ListView 참조변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbodyqna1);
        //문자열 데이터 ArrayList에 추가

        mDatas.add("체성분 분석이 무엇인가요?");
        mDatas.add("BMI가 무엇인가요?");
        mDatas.add("인바디가 무엇인가요?");
        mDatas.add("인바디를 어디서 잴 수 있나요?");
        mDatas.add("인바디 검사를 받았는데 어떤 정보를 기입하면 되나요?");


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mDatas);


        listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter); //위에 만들어진 Adapter를 ListView에 설정 : xml에서 'entries'속성

        //ListView의 아이템 하나가 클릭되는 것을 감지하는 Listener객체 설정 (Button의 OnClickListener와 같은 역할)
        listview.setOnItemClickListener(listener);
    }


    //ListView의 아이템 하나가 클릭되는 것을 감지하는 Listener객체 생성 (Button의 OnClickListener와 같은 역할)

    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    Intent intent = new Intent(inbodyqna1Activity.this, inbodyans1Activity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent2 = new Intent(inbodyqna1Activity.this, inbodyqna1Activity.class);
                    startActivity(intent2);
                    break;


            }

        }

    };

}
