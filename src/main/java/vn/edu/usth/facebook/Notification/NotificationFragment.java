package vn.edu.usth.facebook.Notification;

import android.content.Intent;
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

public class NotificationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notification, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.recyclerviewnotice);

        List<NotificationItem> items = new ArrayList<NotificationItem>();

        items.add(new NotificationItem("VTV24 was live", "12h", R.drawable.vid_ava_6));
        items.add(new NotificationItem("Netflix posted a new video", "16h",  R.drawable.home_ava_6));
        items.add(new NotificationItem("Vu Duc Duy invite you to like him", "2d",  R.drawable.vdd_avatar));
        items.add(new NotificationItem("VALORANT was live", "3d", R.drawable.vid_ava_3));
        items.add(new NotificationItem("500Bros CS2 posted a new video", "3d", R.drawable.vid_ava_4));
        items.add(new NotificationItem("USTH's Capybara invited you to like USTH", "4d", R.drawable.capybara_usth));
        
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new NotificationAdapter(requireContext(), items));

        ImageButton searchbutton = v.findViewById(R.id.home_search_button);
        searchbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.More.Search_Activity.class );
                startActivity(i);
            }
        });

        return v;
    }
}