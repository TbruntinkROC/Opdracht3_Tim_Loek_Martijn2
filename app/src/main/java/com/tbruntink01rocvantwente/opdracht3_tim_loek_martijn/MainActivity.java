package com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.data.Student;
import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.layout.SelectStudentActivity;

public class MainActivity extends AppCompatActivity {


    Button buttonSelectStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonSelectStudent = (Button)findViewById(R.id.buttonSelectStudent);

        buttonSelectStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SelectStudentActivity.class);


                startActivityForResult(intent,420);
            }
        });

    }





    //Deze methode wordt aangeroepen wanneer de SelectStudentActivity wordt gesloten
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == 420){
            Student student = (Student) data.getSerializableExtra("student");


        }
    }
}
