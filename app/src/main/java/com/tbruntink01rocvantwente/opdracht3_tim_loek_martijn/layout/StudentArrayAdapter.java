package com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.R;
import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.data.Student;

import java.util.List;


/**
 * Created by Tim on 23-9-2016.
 */
public class StudentArrayAdapter extends ArrayAdapter<Student> {


    private final Context context;
    private final List<Student> students;

    private TextView textViewName, textViewNumber, textViewKlas;
    private ImageView imageViewStudent;


    public StudentArrayAdapter(Context context, int resource, List<Student> students) {
        super(context, resource, students);

        this.students = students;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // return super.getView(position, convertView, parent);
       LayoutInflater inflater = LayoutInflater.from(getContext());
       View view = inflater.inflate(R.layout.student_listview_row,null);

        textViewName = (TextView) view.findViewById(R.id.textViewStudentName);
        textViewKlas = (TextView) view.findViewById(R.id.textViewStudentKlasnaam);
        textViewNumber = (TextView) view.findViewById(R.id.textViewStudentNumber);
        imageViewStudent = (ImageView) view.findViewById(R.id.imageViewStudent);

        Student student = students.get(position);

        textViewName.setText(student.getStudentName());
        textViewNumber.setText(student.getStudentNumber());
        textViewKlas.setText(student.getStudentKlasnaam());
        imageViewStudent.setImageResource(student.getImageRecourceID());




        return  view;
    }
}
