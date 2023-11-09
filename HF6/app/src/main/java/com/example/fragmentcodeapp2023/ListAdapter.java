package com.example.fragmentcodeapp2023;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter {
    Context context;
    List<Item> list ;
    int  flagImages [];
    LayoutInflater inflater;

    public ListAdapter(@NonNull Context context, int[] flags, @NonNull List<Item> objects) {
        super(context, R.layout.item_view, objects);
        this.context=context;
        this.flagImages=flags;
        this.list=objects;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.item_view,null);
        TextView txtView=(TextView) convertView.findViewById(R.id.TextView);
        TextView teljes=(TextView) convertView.findViewById(R.id.teljes);
        TextView eladas=(TextView) convertView.findViewById(R.id.eladas);
        TextView vetel=(TextView) convertView.findViewById(R.id.vetel);
        TextView eladasiAr=(TextView) convertView.findViewById(R.id.eladasiAr);
        TextView veteliAr=(TextView) convertView.findViewById(R.id.veteliAr);
        ImageView flags=(ImageView) convertView.findViewById(R.id.image);
        Item item = list.get(position);
        txtView.setText(item.getRovidites());
        teljes.setText(item.getPenznem());
        eladas.setText(item.getElad());
        vetel.setText(item.getVasarol());
        eladasiAr.setText(item.getEladasAr());
        veteliAr.setText(item.getVetelAr());
        flags.setImageResource(flagImages[position]);
        return convertView;
    }
}
