package vn.edu.usth.facebook.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.facebook.R;

public class List_Friend_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list_friend);

        RecyclerView recyclerView = findViewById(R.id.recyclerviewlistfriend);

        List<FriendItem> items = new ArrayList<FriendItem>();

        items.add(new FriendItem("User",  R.drawable.user));
        items.add(new FriendItem("User",  R.drawable.user));
        items.add(new FriendItem("User",  R.drawable.user));
        items.add(new FriendItem("User",  R.drawable.user));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FriendAdapter(this, items));

        ImageButton backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(view -> {
            onBackPressed();
        });

        ImageButton addfriend = findViewById(R.id.add_friend);
        addfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(List_Friend_Activity.this, List_Add_Friend_Activity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}