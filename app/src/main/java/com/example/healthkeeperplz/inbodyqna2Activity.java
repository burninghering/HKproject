package com.example.healthkeeperplz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class inbodyqna2Activity extends AppCompatActivity {
    ArrayList<String> mDatas = new ArrayList<String>();
    ListView listview; //ListView 참조변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbodyqna2);
        //문자열 데이터 ArrayList에 추가

        mDatas.add("체수분에 관한 식이요법이 궁금합니다.");
        mDatas.add("단백질에 관한 식이요법이 궁금합니다.");
        mDatas.add("무기질에 관한 식이요법이 궁금합니다.");
//        mDatas.add("");
//        mDatas.add("");


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
                    Intent intent = new Intent(inbodyqna2Activity.this, dietans1Activity.class);
                    startActivity(intent);
                    break;
                case 1:
                    Intent intent2 = new Intent(inbodyqna2Activity.this, dietans2Activity.class);
                    startActivity(intent2);
                    break;


            }

        }

    };

}
