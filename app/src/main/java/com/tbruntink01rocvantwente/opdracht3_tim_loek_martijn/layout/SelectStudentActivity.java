package com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.R;
import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.data.Student;
import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.data.Students;


public class SelectStudentActivity extends AppCompatActivity {


    ListView listViewStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_student);



        listViewStudents = (ListView)findViewById(R.id.listViewStudents);


        StudentArrayAdapter adapter = new StudentArrayAdapter(this,R.layout.activity_select_student,Students.getAllStudents());

        listViewStudents.setAdapter(adapter);


        listViewStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = Students.getAllStudents().get(position);
                Intent intent = new Intent();

                //geef de geselecteerde student mee
                intent.putExtra("student",student);
                //Voeg de intent en een code toe aan de "Result"
                setResult(420,intent);
                //Sluit de activity en ga terug naar de eerste activity
                finish();
            }
        });
    }
}
