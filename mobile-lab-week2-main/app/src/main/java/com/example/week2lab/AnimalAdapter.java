package com.example.week2lab;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private List<Animal> animals;
    private LayoutInflater layoutInflater;


    public AnimalAdapter(Activity activity, List<Animal> animals) {
        this.animals = animals;
        layoutInflater = ((LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE));
    }


    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int position) {
        return animals.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView;
        rowView = layoutInflater.inflate(R.layout.listview_row, null);
        TextView textView = (TextView)rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.picture);
        Animal animal = animals.get(position);
        textView.setText(animal.getType());
        imageView.setImageResource(animal.getPictureId());
        return rowView;
    }
}
