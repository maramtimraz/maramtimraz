package com.example.toshiba.breastcancer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ArticleActivity extends AppCompatActivity {
    private List<Article> articleItemList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        //  setTitle("dev2qa.com - Android CardView Example.");

        initializeCarItemList();

        // Create the recyclerview.
        RecyclerView articleRecyclerView = findViewById(R.id.recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        // Set layout manager.
        articleRecyclerView.setLayoutManager(gridLayoutManager);

        // Create article recycler view data adapter with article item list.
        ArticleRecyclerViewDataAdapter adapter = new ArticleRecyclerViewDataAdapter(getApplicationContext(),articleItemList,R.layout.activity_card_view_item);
        // Set data adapter.
        articleRecyclerView.setAdapter(adapter);

    }

    /* Initialise article items in list. */
    private void initializeCarItemList()
    {
        if(articleItemList == null)
        {
            articleItemList = new ArrayList<Article>();
            articleItemList.add(new Article("تقرير عن سرطان الثدي(أعراضه , أسبابه ,كيفية إكتشافه)", R.drawable.article1 ,"https://www.webteb.com/cancer/diseases/%D8%B3%D8%B1%D8%B7%D8%A7%D9%86-%D8%A7%D9%84%D8%AB%D8%AF%D9%8A"));
            articleItemList.add(new Article("الكشف المبكر عن سرطان الثدي", R.drawable.article2,"https://www.haad.ae/simplycheck/tabid/194/Default.aspx"));
            articleItemList.add(new Article("طريقة فحص سرطان الثدي", R.drawable.article3,"https://mawdoo3.com/%D8%B7%D8%B1%D9%82_%D8%A7%D9%84%D9%83%D8%B4%D9%81_%D8%A7%D9%84%D9%85%D8%A8%D9%83%D8%B1_%D8%B9%D9%86_%D8%B3%D8%B1%D8%B7%D8%A7%D9%86_%D8%A7%D9%84%D8%AB%D8%AF%D9%8A"));
            articleItemList.add(new Article("كيف تقي نفسك من سرطان الثدي", R.drawable.article4,"https://www.alarabiya.net/ar/medicine-and-health/2018/10/03/%D8%A7%D8%AA%D8%A8%D8%B9%D9%8A-%D9%87%D8%B0%D9%87-%D8%A7%D9%84%D8%AE%D8%B7%D9%88%D8%A7%D8%AA-%D8%A7%D9%84%D9%806-%D9%84%D8%AA%D9%82%D9%8A-%D9%86%D9%81%D8%B3%D9%83-%D9%85%D9%86-%D8%B3%D8%B1%D8%B7%D8%A7%D9%86-%D8%A7%D9%84%D8%AB%D8%AF%D9%8A.html"));

        }


    }
}
