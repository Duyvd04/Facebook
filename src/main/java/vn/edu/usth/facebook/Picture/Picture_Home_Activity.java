package vn.edu.usth.facebook.Picture;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.facebook.R;

public class Picture_Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_picture_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerviewpicture);

        List<PictureItem> items = new ArrayList<PictureItem>();

        items.add(new PictureItem(R.drawable.reel_1, R.drawable.reel_20, R.drawable.reel_3, R.drawable.reel_4));
        items.add(new PictureItem(R.drawable.reel_50, R.drawable.reel_39, R.drawable.reel_7, R.drawable.reel_8));
        items.add(new PictureItem(R.drawable.reel_9, R.drawable.reel_22, R.drawable.reel_11, R.drawable.reel_12));
        items.add(new PictureItem(R.drawable.reel_49, R.drawable.reel_14, R.drawable.reel_25, R.drawable.reel_37));
        items.add(new PictureItem(R.drawable.reel_17, R.drawable.reel_18, R.drawable.reel_49, R.drawable.reel_20));
        items.add(new PictureItem(R.drawable.reel_21, R.drawable.reel_22, R.drawable.reel_33, R.drawable.reel_24));
        items.add(new PictureItem(R.drawable.reel_25, R.drawable.reel_26, R.drawable.reel_27, R.drawable.reel_28));
        items.add(new PictureItem(R.drawable.reel_29, R.drawable.reel_30, R.drawable.reel_31, R.drawable.reel_3));
        items.add(new PictureItem(R.drawable.reel_33, R.drawable.reel_34, R.drawable.reel_35, R.drawable.reel_45));
        items.add(new PictureItem(R.drawable.reel_37, R.drawable.reel_38, R.drawable.reel_39, R.drawable.reel_40));
        items.add(new PictureItem(R.drawable.reel_41, R.drawable.reel_42, R.drawable.reel_43, R.drawable.reel_44));
        items.add(new PictureItem(R.drawable.reel_45, R.drawable.reel_46, R.drawable.reel_47, R.drawable.reel_48));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PictureAdapter(this, items));
        

        ImageButton backButton = findViewById(R.id.close_button);
        backButton.setOnClickListener(view -> {
            onBackPressed();
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}