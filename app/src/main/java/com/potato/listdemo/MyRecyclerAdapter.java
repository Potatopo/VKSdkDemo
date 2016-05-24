package com.potato.listdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.vk.sdk.api.model.VKList;

import java.util.List;

/**
 * Created by potato on 5/19/16.
 */
    public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    Context context;
    LayoutInflater inflater;
    List str;

    public MyRecyclerAdapter(Context context, List str) {
        this.context = context;
        this.str = str;
        inflater = LayoutInflater.from(context);
    }

        @Override
        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.list_item, parent, false);

            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerViewHolder holder, int position) {
            final User user = (User) str.get(position);
            holder.textView.setText(user.getName());
            //holder.textView2.setText(user.getCountry() + user.getCountry());

            //Glide.with(context).load(user.getPhoto()).into(holder.imageView);
        }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

            Toast.makeText(context, "This is position " + position, Toast.LENGTH_LONG).show();

        }
    };

        @Override
        public int getItemCount() {
            return str.size();
        }
    }
