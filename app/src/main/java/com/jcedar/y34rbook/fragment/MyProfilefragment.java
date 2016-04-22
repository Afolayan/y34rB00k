package com.jcedar.y34rbook.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jcedar.y34rbook.R;

/**
 * Created by oluwafemi.bamisaye on 4/11/2016.
 */
public class MyProfilefragment extends Fragment {

    //required empty constructor
    public MyProfilefragment(){

    }

    public static MyProfilefragment newInstance() {
        MyProfilefragment fragment = new MyProfilefragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_profile, container,false);

        return view;
    }
}
