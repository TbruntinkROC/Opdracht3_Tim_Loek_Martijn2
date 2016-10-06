package com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.data;

import com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.R;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Tim on 24-9-2016.
 */
public class Students {


    //returns an array with all students
    public static List<Student> getAllStudents(){
        List<Student> result = new ArrayList<Student>();

        result.add(new Student(R.drawable.tim_bruntink,"Tim Bruntink","0267599","tbruntink01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.kelvin_cornelissens,"Kelvin Cornelissens","0267772","kcornelissens01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.martijn_dekker,"Martijn Dekker","0256907","mdekker04@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.dylan_doornbos,"Dylan Doornbos","0265788","ddoornbos01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.bart_van_es,"Bart van Es","0264650","bvanes01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.loek_gosen,"Loek Gosen","0267853","lgosen01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.bas_grave,"Bas Grave","0267617","bgrave01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.dylan_hofstra,"Dylan Hofstra","0263413","dhofstra02@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.jordy_mengerink,"Jordy Mengerink","0265597","jmengerink03@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.james_morsink,"James Morsink","0267422","jmorsink09@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.robin_tatlici,"Robin Talici","0187199","rtatlici01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.laurens_tel,"Laurens Tel","0179028","ltel01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.carlo_verver,"Carlo Verver","0269264","cverver01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.firdhan_yahya,"Firdhan Yahya","0267433","fyahya01@student.rocvantwente.nl"));
        result.add(new Student(R.drawable.jake_zweers,"Jake Zweers","0267956","jzweers05@student.rocvantwente.nl"));

        for (Student student : result){
            student.setStudentKlasnaam("I4AO1");
        }




        return result;

    }
}
