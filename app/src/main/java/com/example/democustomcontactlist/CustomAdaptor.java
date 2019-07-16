package com.example.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdaptor extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdaptor(Context context, int resource, ArrayList<AndroidVersion> objects) {
        super(context, resource, (List) objects);
        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView textViewName=rowView.findViewById(R.id.textViewName);
        TextView textViewCode=rowView.findViewById(R.id.textViewCountryCode);
        TextView textViewNumber=rowView.findViewById(R.id.textViewContactNum);
        ImageView ivGender=rowView.findViewById(R.id.tvGender);
        AndroidVersion currentVersion=versionList.get(position);
        textViewName.setText(currentVersion.getName());
        textViewCode.setText(currentVersion.getCc());
        textViewNumber.setText(currentVersion.getContact()+"");
        ivGender.setImageResource(R.drawable.female);
        return rowView;
    }
}
