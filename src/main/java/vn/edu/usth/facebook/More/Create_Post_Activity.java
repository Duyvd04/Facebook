package vn.edu.usth.facebook.More;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.facebook.R;

public class Create_Post_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_post);

        ImageButton closeButton = findViewById(R.id.close_button);
        closeButton.setOnClickListener(view -> {
            onBackPressed();
        });

        Button postbutton = findViewById(R.id.post_button);
        postbutton.setOnClickListener(view -> {
            onBackPressed();
        });
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}