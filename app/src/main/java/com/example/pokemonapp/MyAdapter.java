package com.example.pokemonapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;


public class MyAdapter extends ArrayAdapter<Pokemon> {

    ArrayList<Pokemon> pokemons;



    public MyAdapter(@NonNull Context context, int textViewResourceId, @NonNull ArrayList<Pokemon> objects) {
        super(context, textViewResourceId, objects);
        pokemons = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }



    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.grid_view_list, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        Picasso.get().load("https://assets.pokemon.com/assets/cms2/img/pokedex/full/" + pokemons.get(position).getNum() + ".png").into(imageView);
        textView.setText(pokemons.get(position).getName());
        ArrayList<String> types = pokemons.get(position).getType();

        if(types.get(0).equals("Grass")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#97C188"));

        }else if(types.get(0).equals("Fire")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#D9B073"));

        }else if(types.get(0).equals("Water")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#5FBBD8"));

        }else if(types.get(0).equals("Bug")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#458E5A"));

        }else if(types.get(0).equals("Normal")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#373737"));

        }else if(types.get(0).equals("Poison")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#845875"));

        }else if(types.get(0).equals("Electric")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#FDFF8A"));

        }else if(types.get(0).equals("Ground")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#483313"));

        }else if(types.get(0).equals("Fighting")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#ACAAAA"));

        }else if(types.get(0).equals("Rock")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#959595"));

        }else if(types.get(0).equals("Ghost")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#292156"));

        }else if(types.get(0).equals("Ice")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#0094FF"));

        }else if(types.get(0).equals("Dragon")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#76D98C"));

        }else if(types.get(0).equals("Psychic")) {
            view.findViewById(R.id.ly).setBackgroundColor(Color.parseColor("#D974CF"));
        }

        return view;
    }
}
