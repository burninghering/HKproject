package com.example.healthkeeperplz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;


import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    //각 입력한 데이터를 보여줄 객체 참조 변수 선언
    private TextView name;
    private TextView age;
    private TextView weight;
    private TextView height;
    TextView resulttext;
    String calculation, BMIresult;

    private TextView bodyfat;
    private TextView protein;
    private TextView mineral;
    private TextView bodywater;


    TextView result2text,result3text,result4text,result5text;
    String bfresult, ptresult, miresult, bwresult;
    String ptcalculation,bwcalculation, micalculation, bfcalculation ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.name = (TextView) findViewById(R.id.name);
        this.age = (TextView) findViewById(R.id.age);
        this.weight = (TextView) findViewById(R.id.weight);
        this.height = (TextView) findViewById(R.id.height);
        resulttext = findViewById(R.id.result);

        this.bodyfat = (TextView) findViewById(R.id.bodyfat);
        this.protein = (TextView) findViewById(R.id.protein);
        this.mineral = (TextView) findViewById(R.id.mineral);
        this.bodywater = (TextView) findViewById(R.id.bodywater);
        result2text = findViewById(R.id.result2);
        result3text = findViewById(R.id.result3);
        result4text = findViewById(R.id.result4);
        result5text = findViewById(R.id.result5);

        //이전에 실행된 액티비티 클래스에서 사용한 인텐트 객체에 접근
        Intent intent = this.getIntent();

        //이전 액티비티 클래스로부터 이름 가져오기
        String name = intent.getStringExtra("name");
        // String 형식의 데이터를 받아오므로 getStringExtra
        if(name == null) {
            this.name.setText("이름 가져오기 실패");
        }
        else{
            Log.d("mylogtag", "가져온 이름은" + name);
            this.name.setText(name);
        }

        //이전 액티비티 클래스로부터 나이 가져오기
        int age = intent.getIntExtra("age", -1);
        // int형 데이터를 받기위해서 getIntExtra를 사용
        if(age != -1) {
            Log.d("mylogtag", "가져온 나이는 = " + age);
            this.age.setText(age+"");
        }
        else{
            Log.d("mylogtag","나이 가져오기 실패");
            this.age.setText("나이 가져오기 실패");
        }

        //이전 액티비티 클래스로부터 몸무게 가져오기
        int weight = intent.getIntExtra("weight", -1);
        // int형 데이터를 받기위해서 getIntExtra를 사용
        if(weight != -1) {
            Log.d("mylogtag", "가져온 몸무게는 = " + weight);
            this.weight.setText(weight+"");
        }
        else{
            Log.d("mylogtag","몸무게 가져오기 실패");
            this.weight.setText("몸무게 가져오기 실패");
        }

        //이전 액티비티 클래스로부터 키 가져오기
        int height = intent.getIntExtra("height", -1);
        // int형 데이터를 받기위해서 getIntExtra를 사용
        if(height != -1) {
            Log.d("mylogtag", "가져온 키는 = " + height);
            this.height.setText(height+"");
        }
        else{
            Log.d("mylogtag","키 가져오기 실패");
            this.height.setText("키 가져오기 실패");
        }

        //이전 액티비티 클래스로부터 체지방 가져오기
        int bodyfat = intent.getIntExtra("bodyfat", -1);
        // int형 데이터를 받기위해서 getIntExtra를 사용
        if(bodyfat != -1) {
            Log.d("mylogtag", "가져온 체지방은 = " + bodyfat);
            this.bodyfat.setText(bodyfat+"");
        }
        else{
            Log.d("mylogtag","체지방 가져오기 실패");
            this.bodyfat.setText("체지방 가져오기 실패");
        }

        //이전 액티비티 클래스로부터 단백질 가져오기
        int protein = intent.getIntExtra("protein", -1);
        // int형 데이터를 받기 위해서 getIntExtra를 사용
        if(protein != -1) {
            Log.d("mylogtag", "가져온 단백질은= " + protein);
            this.protein.setText(protein+"");
        }
        else {
            Log.d("mylogtag", "단백질 가져오기 실패");
            this.protein.setText("단백질 가져오기 실패");
        }

        //이전 액티비티 클래스로부터 무기질 가져오기
        int mineral = intent.getIntExtra("mineral", -1);
        // int형 데이터를 받기 위해서 getIntExtra를 사용
        if(mineral != -1) {
            Log.d("mylogtag", "가져온 무기질은= " + mineral);
            this.mineral.setText(mineral+"");
        }
        else {
            Log.d("mylogtag", "무기질 가져오기 실패");
            this.mineral.setText("무기질 가져오기 실패");
        }

        //이전 액티비티 클래스로부터 체수분 가져오기
        int bodywater = intent.getIntExtra("bodywater", -1);
        // int형 데이터를 받기 위해서 getIntExtra를 사용
        if(bodywater != -1) {
            Log.d("mylogtag", "가져온 체수분은= " + bodywater);
            this.bodywater.setText(bodywater+"");
        }
        else {
            Log.d("mylogtag", "체수분 가져오기 실패");
            this.bodywater.setText("체수분 가져오기 실패");
        }

    }

    public void ClickedBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
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
    public void calculateBMI(View view) { //BMI - 혜린
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();
        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;
        float bmi = weightValue / (heightValue * heightValue);

        if(bmi < 16){
            BMIresult = "심각한 저체중";
        }else if(bmi < 18.5){
            BMIresult = "저체중";
        }else if(bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "보통 체중";
        }else if (bmi >= 25 && bmi <= 29.9){
            BMIresult = "과체중";
        }else{
            BMIresult = "데이터를 다시 입력해주세요.";
        }

        calculation = bmi + ", " + BMIresult;
        resulttext.setText(calculation);

        String S3 = bodywater.getText().toString();
        String S4 = protein.getText().toString();
        String S5 = mineral.getText().toString();
        String S6 = bodyfat.getText().toString();

        float bodywaterValue = Float.parseFloat(S3);
        float proteinValue = Float.parseFloat(S4);
        float mineralValue = Float.parseFloat(S5);
        float bodyfatValue = Float.parseFloat(S6);

        if(bodywaterValue < 36.9){
            bwresult = "체수분이 낮습니다.";
        }else if(bodywaterValue >= 36.9 && bodywaterValue<= 45.1){
            bwresult = "평균의 체수분입니다.";
        }else if(bodywaterValue > 45.1){
            bwresult = "체수분이 높습니다";
        }else{
            bwresult = "데이터를 다시 입력해주세요.";
        }

        bwcalculation = bodywaterValue + ", " + bwresult;
        result2text.setText(bwcalculation);

        if(proteinValue < 9.9){
            ptresult = "단백질이 낮습니다.";
        }else if(proteinValue >= 9.9 && proteinValue<= 12.1){
            ptresult = "평균의 단백질입니다.";
        }else if(proteinValue > 12.1){
            ptresult = "단백질이 높습니다";
        }else{
            ptresult = "데이터를 다시 입력해주세요.";
        }

        ptcalculation = proteinValue + ", " + ptresult;
        result3text.setText(ptcalculation);

        if(mineralValue < 3.42){
            miresult = "무기질이 낮습니다.";
        }else if(mineralValue >= 3.42 && mineralValue<= 4.18){
            miresult = "평균의 무기질입니다.";
        }else if(mineralValue > 4.18){
            miresult = "무기질이 높습니다";
        }else{
            miresult = "데이터를 다시 입력해주세요.";
        }

        micalculation = mineralValue + ", " + miresult;
        result4text.setText(micalculation);

        if(bodyfatValue < 7.9){
            bfresult = "체지방이 낮습니다.";
        }else if(bodyfatValue >= 7.9 && bodyfatValue<= 15.8){
            bfresult = "평균의 체지방입니다.";
        }else if(bodyfatValue > 15.8){
            bfresult = "체지방이 높습니다";
        }else{
            bfresult = "데이터를 다시 입력해주세요.";
        }

        bfcalculation = bodyfatValue + ", " + bfresult;
        result5text.setText(bfcalculation);
    }
}

