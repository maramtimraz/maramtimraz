package com.example.toshiba.breastcancer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArticleRecyclerViewDataAdapter extends RecyclerView.Adapter<ArticleRecyclerViewDataAdapter.AricleViewHolder> {
    private List<Article> articleItemList;
    int layout;
    Context context;

    public ArticleRecyclerViewDataAdapter(Context context, List<Article> articleItemList, int layout) {
        this.context = context;
        this.articleItemList = articleItemList;
        this.layout = layout;

    }
    @Override
    public AricleViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(layout, parent, false);
      final   AricleViewHolder vh = new AricleViewHolder(view);
        // When click the item in recycle.
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int position=   vh.getAdapterPosition();
                String  url = articleItemList.get(position).getUrl();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                context.startActivity(i);

            }
        });

        // Create and return our custom Article Recycler View Item Holder object.

        return vh;
    }

    @Override
    public void onBindViewHolder( AricleViewHolder holder, int position) {
        if(articleItemList!=null) {
            // Get article item dto in list.
            Article item = articleItemList.get(position);

            if(item != null) {
                // Set article item title.
                holder.title.setText(item.getTitle());
                // Set article image resource id.
                holder.img.setImageResource(item.getImage());
            }
        }

    }

    @Override
    public int getItemCount() {
        return articleItemList.size();
    }

    public  class AricleViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
      final   public TextView title;
        public AricleViewHolder(@NonNull View itemView) {
            super(itemView);
            // Get  title text view object.
            title = itemView.findViewById(R.id.card_view_image_title);
            // Get  image view object.
            img =itemView.findViewById(R.id.card_view_image);


        }
    }
}
