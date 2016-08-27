package com.example.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lorenz on 2016-08-27.
 */
public class PlanetAdapter extends ArrayAdapter<PlanetObject> {

    ArrayList<PlanetObject> planetList;
    Context c;

    public PlanetAdapter(Context context, ArrayList<PlanetObject> objects) {
        super(context,0, objects);
        planetList = objects;
        c = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.itemlist,null);

        PlanetObject planet = planetList.get(position);

        TextView tw = (TextView) convertView.findViewById(R.id.planetText);
        tw.setText(planet.getName());

        ImageView iw = (ImageView) convertView.findViewById(R.id.planetImage);

        iw.setImageResource(planet.getImage());


        return convertView;
    }
}
