package com.example.mrgreat.gridviewapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mrgreat on 20/09/2015.
 */
public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private final String[] label;
    //private boolean check = false;

    public GridViewAdapter(Context context, String [] label){
        this.context = context;
        this.label = label;

    }



    @Override
    public int getCount() {
        return label.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        //final boolean check;

        if(convertView == null){
            gridView = new View(context);
            gridView = inflater.inflate(R.layout.item, null);

            TextView textView = (TextView)gridView.findViewById(R.id.tView);
            textView.setText(label[position]);

            // set image
            //ImageView imageView = (ImageView)gridView.findViewById(R.id.image1);
            //imageView.setImageResource(R.drawable);
            gridView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView imageViewCheck = (ImageView)v.findViewById(R.id.imageCheck);
                    int check = imageViewCheck.getVisibility();
                    if (check == View.INVISIBLE){
                        imageViewCheck.setVisibility(View.VISIBLE);


                    }else{
                        imageViewCheck.setVisibility(View.INVISIBLE);


                    }


                }
            });



        }else {
            gridView = (View) convertView;

        }



        return gridView;

    }


}
