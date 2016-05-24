package com.potato.listdemo;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by potato on 5/19/16.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView textView, textView2;
    ImageView imageView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.textView);
        textView2 = (TextView) itemView.findViewById(R.id.textView2);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}