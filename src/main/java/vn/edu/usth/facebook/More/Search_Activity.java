package vn.edu.usth.facebook.More;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;

import vn.edu.usth.facebook.R;

public class Search_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search);

        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            onBackPressed();
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}