package com.example.toshiba.breastcancer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

        private List<Article> articleItemList = null;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button artBtn=findViewById(R.id.articleBtn);
            Button survivalBtn=findViewById(R.id.survivalBtn);
            Button educateBtn=findViewById(R.id.educateBtn);
            Button earlyBtn=findViewById(R.id.earlyBtn);


artBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(MainActivity.this,ArticleActivity.class);
        startActivity(i);
    }
});

            survivalBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(MainActivity.this,PreviousExpActivity.class);
        startActivity(i);
    }
});

            educateBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(MainActivity.this,AwarenessActivity.class);
                    startActivity(i);
                }
            });

            earlyBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i=new Intent(MainActivity.this,EarlyDetectionActivity.class);
                    startActivity(i);
                }
            });
    }
}
