package com.jcedar.y34rbook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jcedar.y34rbook.R;
import com.jcedar.y34rbook.model.AllPeople;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oluwafemi.bamisaye on 4/15/2016.
 */
public class AllMemberAdapter extends BaseAdapter {

    private List<AllPeople> peopleList;
    private LayoutInflater inflater;
    private ArrayList<Integer> mPhoto = new ArrayList<Integer>();

    private Integer [] mPhotoPool = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e };
//    private String[] name =

    @Override
    public int getCount() {
        return peopleList.size();
    }

    @Override
    public Object getItem(int position) {
        return peopleList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout = convertView;
//        mPhoto.add(mPhotoPool);

        if (convertView==null){
            layout = inflater.inflate(R.layout.fragment_all_members,parent,false);

            ImageView img = (ImageView) layout.findViewById(R.id.photo);
            TextView name = (TextView) layout.findViewById(R.id.tvName);

            img.setImageResource(mPhoto.get(position));

        }


        return layout;
    }
}
