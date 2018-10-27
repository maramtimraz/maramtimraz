package com.example.toshiba.breastcancer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EarlyDetectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_early_detection);
        String[] titlex=new String[]{"STEP 1: Breast self-exam (BSE)","STEP 2: Clinical breast exam (CBE)" ,"STEP 3: Mammogram"};
        String [] description =new String[]{"A BSE is something every woman should do once a month at home.","The CBE is performed by a healthcare professional who is trained to recognize many different types of abnormalities.","A mammogram is an X-ray that allows a specialist to examine the breast tissue for any suspicious areas. "};

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        for(int i = 0; i < 3; i++){
            HashMap<String, String> hm = new  HashMap<String, String>();
            hm.put("list_title",titlex[i]);
            hm.put("list_description",description[i]);
            aList.add(hm);
        }

        String[] from = {"list_title","list_description"};
        int[] to = {R.id.listview_title, R.id.listview_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_activity3, from, to);
        final ListView lst =  findViewById(R.id.early_list);
        lst.setAdapter(simpleAdapter);
        
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.youtube.com/watch?v=cc_eedRj7q8"));
                    startActivity(i);
                }
                else if(position==1){
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.youtube.com/watch?v=j9JL-kM9ww4"));
                    startActivity(i);
                }
                else if(position==2){
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("https://www.youtube.com/watch?v=LvAjOypHMOU"));
                    startActivity(i);
                }
            }
        });
    }
}
