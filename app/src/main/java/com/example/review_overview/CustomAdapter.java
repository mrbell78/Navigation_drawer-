package com.example.review_overview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Customclass> {
    private Context context;
    private int[]img;
    private String[]name;


    public CustomAdapter(Context context, int[] img, String[] name) {
        this.context = context;
        this.img = img;
        this.name = name;
    }

    @NonNull
    @Override
    public Customclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_review,parent,false);
        return new Customclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Customclass holder, int position) {
        holder.imageView.setImageResource(img[position]);
        holder.textView.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return img.length;
    }
    public class Customclass extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CheckBox checkBox;
        RatingBar ratingBar;
        View mview;
        public Customclass(@NonNull View itemView) {
            super(itemView);
            mview=itemView;
            imageView=mview.findViewById(R.id.image);
            textView=mview.findViewById(R.id.title);
            checkBox=mview.findViewById(R.id.checkbox);
            ratingBar=mview.findViewById(R.id.rating);
        }
    }
}
