package com.customlistviewdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String item[];
    int image[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] item, int[] image) {

        this.context=applicationContext;
        this.item=item;
        this.image=image;
        inflater=(LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.activity_list_view,null);

        TextView textView=view.findViewById(R.id.textView);
        ImageView imageView=view.findViewById(R.id.imageView);

        textView.setText(item[i]);
        imageView.setImageResource(image[i]);

        return view;
    }
}
