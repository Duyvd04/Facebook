package vn.edu.usth.facebook.Profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.facebook.More.Edit_Profile_Activity;
import vn.edu.usth.facebook.More.Search_Activity;
import vn.edu.usth.facebook.Picture.Picture_Home_Activity;
import vn.edu.usth.facebook.R;
import vn.edu.usth.facebook.User.Friend_Profile_Activity;
import vn.edu.usth.facebook.User.List_Add_Friend_Activity;
import vn.edu.usth.facebook.User.List_Friend_Activity;

public class ProfileFragment extends Fragment {

    private ImageView avatarImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        RecyclerView recyclerview = v.findViewById(R.id.recyclerviewprofile);
        avatarImageView = v.findViewById(R.id.cover_image);

        // Create list of items
        List<ProfileItem> items = new ArrayList<>();
        items.add(new ProfileItem("JustXoai updated his profile picture", "12h", "", R.drawable.avatar_profile, R.drawable.avatar_profile));
        items.add(new ProfileItem("JustXoai updated his cover picture", "16h", "", R.drawable.avatar_profile, R.drawable.background_profile));
        items.add(new ProfileItem("JustXoai", "2d", "1 chut dang yeu", R.drawable.avatar_profile, R.drawable.a1_1));
        items.add(new ProfileItem("JustXoai", "5h", "Not a bug", R.drawable.avatar_profile, R.drawable.meme));

        // Set up the RecyclerView with a layout manager and adapter
        recyclerview.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerview.setAdapter(new ProfileAdapter(requireContext(), items));

        // Button to go to Search Activity
        ImageButton searchButton = v.findViewById(R.id.home_search_button);
        searchButton.setOnClickListener(view -> {
            Intent i = new Intent(requireContext(), Search_Activity.class);
            startActivity(i);
        });

        // Fetch the profile image URL from SharedPreferences
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("ProfilePrefs", Context.MODE_PRIVATE);
        String imageUrl = sharedPreferences.getString("imageUrl", null);
        if (imageUrl != null) {
            new FetchImage(imageUrl).start();
        }

        // Navigate to Edit Profile Activity
        ImageButton editProfileButton = v.findViewById(R.id.edit_profile_button);
        editProfileButton.setOnClickListener(view -> {
            Intent i = new Intent(requireContext(), Edit_Profile_Activity.class);
            startActivity(i);
        });

        // Other navigation buttons for friends and posts
        LinearLayout findFriend = v.findViewById(R.id.find_friend);
        findFriend.setOnClickListener(view -> {
            Intent i = new Intent(requireContext(), List_Add_Friend_Activity.class);
            startActivity(i);
        });

        LinearLayout friends = v.findViewById(R.id.friends);
        friends.setOnClickListener(view -> {
            Intent i = new Intent(requireContext(), List_Friend_Activity.class);
            startActivity(i);
        });

        // Image profile button navigation
        ImageButton imageProfileButton = v.findViewById(R.id.image_profile_button);
        imageProfileButton.setOnClickListener(view -> {
            Intent i = new Intent(requireContext(), Picture_Home_Activity.class);
            startActivity(i);
        });

        // Navigating to friend profiles
        LinearLayout myFriend = v.findViewById(R.id.friend0);
        myFriend.setOnClickListener(view -> {
            Intent i = new Intent(requireContext(), Friend_Profile_Activity.class);
            startActivity(i);
        });

        return v;
    }

    // Class to fetch image from URL in a background thread
    class FetchImage extends Thread {
        private String url;
        private Bitmap bitmap;

        public FetchImage(String url) {
            this.url = url;
        }

        @Override
        public void run() {
            try {
                URL imageUrl = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) imageUrl.openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream inputStream = connection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Update the ImageView on the main thread
            getActivity().runOnUiThread(() -> {
                if (bitmap != null) {
                    avatarImageView.setImageBitmap(bitmap); // Update the profile image
                } else {
                    Toast.makeText(getActivity(), "Failed to load image", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
