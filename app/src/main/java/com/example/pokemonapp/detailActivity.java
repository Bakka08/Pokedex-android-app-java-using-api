package com.example.pokemonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;

public class detailActivity extends AppCompatActivity {
    private View _bg__android_large___2_ek2;
    private TextView hp;
    private View rectangle_24;
    private View rectangle_25;
    private TextView atk;
    private View rectangle_26;
    private View rectangle_27;
    private TextView def;
    private View rectangle_28;
    private View rectangle_29;
    private TextView spd;
    private View rectangle_30;
    private View rectangle_31;

    LinearLayout typeLayout;
    LinearLayout weaknessLayout;

    Intent intent;


    public TextView createTextView(int color) {
        TextView textView = new TextView(this);
        textView.setBackgroundResource(color == R.color.colorAccent ? R.drawable.rounded_corner : R.drawable.rounded_corner2);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setPadding(30, 20, 30, 20);
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setTextColor(getColor(color));
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(20);
        return textView;
    }



    public int generateRandomNumber1() {
            Random random = new Random();
            int randomNumber = random.nextInt(171) + 100; // generates a random number between 30-200 inclusive
            return randomNumber;}
    public int generateRandomNumber2() {
        Random random = new Random();
        int randomNumber = random.nextInt(171) + 50; // generates a random number between 30-200 inclusive
        return randomNumber;}
    public int generateRandomNumber3() {
        Random random = new Random();
        int randomNumber = random.nextInt(171) + 30; // generates a random number between 30-200 inclusive
        return randomNumber;}
    public int generateRandomNumber4() {
        Random random = new Random();
        int randomNumber = random.nextInt(171) + 70; // generates a random number between 30-200 inclusive
        return randomNumber;}

    public void addStats(){
        View view1 = findViewById(R.id.rectangle_25);
        View view2 = findViewById(R.id.rectangle_27);
        View view3 = findViewById(R.id.rectangle_29);
        View view4 = findViewById(R.id.rectangle_31);



        LinearLayout.LayoutParams params1 = (LinearLayout.LayoutParams) view1.getLayoutParams();
        params1.width = generateRandomNumber1();
        view1.setLayoutParams(params1);

        LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
        params2.width = generateRandomNumber2();
        view1.setLayoutParams(params2);

        LinearLayout.LayoutParams params3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
        params3.width = generateRandomNumber3();
        view1.setLayoutParams(params3);

        LinearLayout.LayoutParams params4 = (LinearLayout.LayoutParams) view4.getLayoutParams();
        params4.width = generateRandomNumber4();
        view1.setLayoutParams(params4);










    }
    public void addTypes() {
        ArrayList<String> types = intent.getStringArrayListExtra("types");
        typeLayout = findViewById(R.id.types);

        for (int i = 0; i < (types != null ? types.size() : 0); i++) {
            TextView textView = createTextView(R.color.colorAccent);
            try {
                textView.setText(types.get(i));


                if(types.get(i).equals("Grass")) {
                    findViewById(R.id.page).setBackgroundColor(Color.parseColor("#97C188"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#97C188"));
                }else if(types.get(i).equals("Fire")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#D9B073"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#D9B073"));
                }else if(types.get(i).equals("Water")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#5FBBD8"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#5FBBD8"));
                }else if(types.get(i).equals("Bug")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#458E5A"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#458E5A"));
                }else if(types.get(i).equals("Normal")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#373737"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#373737"));
                }else if(types.get(i).equals("Poison")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#845875"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#845875"));
                }else if(types.get(i).equals("Electric")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#FDFF8A"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#FDFF8A"));
                }else if(types.get(i).equals("Ground")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#483313"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#483313"));
                }else if(types.get(i).equals("Fighting")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#ACAAAA"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#ACAAAA"));
                }else if(types.get(i).equals("Rock")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#959595"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#959595"));
                }else if(types.get(i).equals("Ghost")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#292156"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#292156"));
                }else if(types.get(i).equals("Ice")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#0i94FF"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#0i94FF"));
                }else if(types.get(i).equals("Dragon")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#76D98C"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#76D98C"));
                }else if(types.get(i).equals("Psychic")) {
                     findViewById(R.id.page).setBackgroundColor(Color.parseColor("#D974CF"));
                    findViewById(R.id.toolbar).setBackgroundColor(Color.parseColor("#D974CF"));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.addView(textView);
            relativeLayout.setForegroundGravity(Gravity.CENTER);
            relativeLayout.setGravity(Gravity.CENTER);
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(0, ConstraintLayout.LayoutParams.WRAP_CONTENT, 1f));
            typeLayout.addView(relativeLayout);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.WHITE);
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);


        intent = getIntent();

        addTypes();




        String name = intent.getStringExtra("name");
        String image = intent.getStringExtra("image");
        String height = intent.getStringExtra("height");
        String weight = intent.getStringExtra("weight");


        ImageView gifImageView = findViewById(R.id.detailImage);
        Glide.with(this).asGif().load(image).into(gifImageView);


        TextView nameView = findViewById(R.id.name);
        nameView.setText(name);

        TextView heightView = findViewById(R.id.height);
        heightView.setText(String.format("Height\n%s", height));

        TextView weightView = findViewById(R.id.weight);
        weightView.setText(String.format("Weight\n%s", weight));
            addStats();
    }
}
