package vn.edu.usth.facebook.Video;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.facebook.R;

public class VideoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_video, container, false);

        RecyclerView recyclerview1 = v.findViewById(R.id.recyclerviewvideo1);

        List<VideoItem> item1s = new ArrayList<VideoItem>();
        item1s.add(new VideoItem("Review Phim", "7h", "Review phim hot nhất 2019: Nghề siêu khó", R.drawable.vid_ava_1,"https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/video.php?v=1531448284152067"));
        item1s.add(new VideoItem("Review Netflix", "8h","Bộ phim gây chấn động 2018: Ảo ảnh", R.drawable.vid_ava_2, "https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/video.php?v=1531448284152067"));

        recyclerview1.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerview1.setAdapter(new VideoAdapter(requireContext(), item1s));



        RecyclerView recyclerview2 = v.findViewById(R.id.recyclerviewvideo2);

        List<VideoItem> item2s = new ArrayList<VideoItem>();
        item2s.add(new VideoItem("Javalorant", "15h", "Valorant hightlight #6", R.drawable.vid_ava_3, "https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/video.php?v=1531448284152067"));
        item2s.add(new VideoItem("CSSGO", "19h", "Quan Trọng Là Tốc Độ Nhưng Là CS2", R.drawable.vid_ava_4, "https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/video.php?v=1531448284152067"));

        recyclerview2.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerview2.setAdapter(new VideoAdapter(requireContext(), item2s));




        RecyclerView recyclerview3 = v.findViewById(R.id.recyclerviewvideo3);

        List<VideoItem> item3s = new ArrayList<VideoItem>();
        item3s.add(new VideoItem("500Bros CS2", "1h", "",R.drawable.vid_ava_4, "https://www.facebook.com/plugins/video.php?href=https://www.facebook.com/video.php?v=1531448284152067"));

        recyclerview3.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerview3.setAdapter(new VideoAdapter(requireContext(), item3s));


        ImageButton searchbutton = v.findViewById(R.id.search_video_button);
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.More.Video_Search_Activity.class );
                startActivity(i);
            }
        });

        ImageButton savebutton = v.findViewById(R.id.save_video_button);
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.More.Video_Save_Activity.class );
                startActivity(i);
            }
        });

        return v;
    }
}