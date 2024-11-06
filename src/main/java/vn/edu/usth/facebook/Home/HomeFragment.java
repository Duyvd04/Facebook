package vn.edu.usth.facebook.Home;

import android.content.Intent;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.facebook.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.recyclerviewhome);

        // Create list of items
        List<HomeItem> items = new ArrayList<HomeItem>();
        items.add(new HomeItem("Grace Morgan", "12h", "Lorem ipsum text praesent tincidunt ipsum lipsum.", R.drawable.girl, R.drawable.bridge));
        items.add(new HomeItem("Isabella Lewis", "16h", "Lorem ipsum text praesent tincidunt ipsum lipsum.", R.drawable.girl_mountain, R.drawable.woods));
        items.add(new HomeItem("Evelyn", "2d", "Lorem ipsum text praesent tincidunt ipsum lipsum.", R.drawable.closegirl, R.drawable.girl_hat));
        items.add(new HomeItem("Rag - Demi Store", "5h", "Lorem ipsum text praesent tincidunt ipsum lipsum.", R.drawable.jean_store, R.drawable.jeans));

        // Set up the RecyclerView with a layout manager and adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new HomeAdapter(requireContext(), items));


        ImageButton chatbutton = v.findViewById(R.id.chat_button);
        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.Messenger.Messenger_Activity.class );
                startActivity(i);
            }
        });

        ImageButton searchbutton = v.findViewById(R.id.home_search_button);
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.More.Search_Activity.class );
                startActivity(i);
            }
        });

        ImageButton image_homebutton = v.findViewById(R.id.image_home_button);
        image_homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.Picture.Picture_Home_Activity.class );
                startActivity(i);
            }
        });

        LinearLayout createpost = v.findViewById(R.id.createPost);
        createpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.More.Create_Post_Activity.class );
                startActivity(i);
            }
        });



        return v;
    }

    class FetchImage extends Thread{

        String URL;

        Bitmap bitmap;

        FetchImage(String URL){
            this.URL = URL;
        }

        @Override
        public void run() {

        }
    }
}