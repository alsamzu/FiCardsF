package com.example.ficards;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private String[] titles = {"Chapter One",
            "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six",
            "Chapter Seven",
            "Chapter Eight"};

    private String[] details = {"Item one details",
            "Item two details", "Item three details",
            "Item four details", "Item five details",
            "Item six details", "Item seven details",
            "Item eight details"};
    private  String[] readme = {"Read More","Read More","Read More","Read More","Read More","Read More","Read More","Read More"};

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTitle;
        public TextView itemDetail;
        public  TextView itemMore;
        public MyViewHolder(View itemView) {
            super(itemView);
            itemTitle =
                    (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);
            itemMore = (TextView)itemView.findViewById(R.id.read_more);
        }

    }



    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.itemTitle.setText(titles[position]);
        holder.itemDetail.setText(details[position]);
        holder.itemMore.setText(readme[position]);
    }


    @Override
    public int getItemCount() {
        return titles.length;
    }


}
