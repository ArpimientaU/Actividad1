package com.example.actividad1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {

    private static final String TAG = "PersonListAdapter";
    private Context mContext;
    int mResourse;

    public PersonListAdapter(Context context, int resource, ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResourse = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Conseguir la informacion de personas
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        //Crear el objeto persona con la informacion
        Person person = new Person(name, birthday, sex);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResourse, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvBirthday = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvSex = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvBirthday.setText(birthday);
        tvSex.setText(sex);

        return convertView;
    }
}
