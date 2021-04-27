package com.example.fourthtaskwithcat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyAdapter extends ArrayAdapter<String> {
    Context context;
    String rTitle[];
    String rDescribtion[];
    int rImg[];


    // Constructor
    MyAdapter(Context c, String title[], String describtion[], int img[]) {
        super(c, R.layout.row, R.id.text_view_1, title);
        //   super(c,R.layout.row,R.id.text_view_1,title);
        this.context = c;
        this.rTitle = title;
        this.rDescribtion = describtion;
        this.rImg = img;

    }// constractor


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.row, parent, false);
        ImageView images = row.findViewById(R.id.image);
        TextView mytitle = row.findViewById(R.id.text_view_1);
        TextView myDescribtion = row.findViewById(R.id.text_view_2);
        // now set our rescources in views
        images.setImageResource(rImg[position]);
        mytitle.setText(rTitle[position]);
        myDescribtion.setText(rDescribtion[position]);
        return row;

    }//getView()


}//end MyAdapter
