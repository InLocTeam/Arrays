package com.deitel.hicham.arrays;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    String[] str = {"Martin","Jacob"};
    int[] LandmarkVisitors = {6180000, 9260000, 72600000};
    double estimatedToureiffeilvisitors = LandmarkVisitors[0]*1.07;
    double estimatedLouvresVisitors= LandmarkVisitors[1]*1.04;
    double estimatedNotredameVisitors = LandmarkVisitors[2]*1.04;

    private ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.InForLoc);
        String[] str = {"Martin","Jacob"};

        ArrayAdapter<String> myAdapter=new
                ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                str);
        ListView myList=(ListView)
                findViewById(R.id.listView);
        myList.setAdapter(myAdapter);
    }


        String man2=  Double.toString(estimatedToureiffeilvisitors);
        String man3= Double.toString(estimatedLouvresVisitors);
        String man4= Double.toString(estimatedNotredameVisitors);

         String [] man = {man2, man3, man4 };



        List<String> str = new ArrayList<String>();
        str.add(man2);
        str.add(man3);
        str.add(man4);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                str );

        lv.setAdapter(arrayAdapter);























    }
}
