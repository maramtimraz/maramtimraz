package com.example.toshiba.breastcancer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PreviousExpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_exp);
        String [] name=new String[]{" Randa" ,"Abeer ", "Haila"};
        int [] image=new int[] {R.drawable.randa ,R.drawable.abeer ,R.drawable.hala};

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 3; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_name", name[i]);
            hm.put("listview_image", Integer.toString(image[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image","listview_name"};
        int[] to = {R.id.listview_image, R.id.listview_name};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity, from, to);
       final ListView lst =  findViewById(R.id.lst);
        lst.setAdapter(simpleAdapter);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PreviousExpActivity.this, "open chat", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
