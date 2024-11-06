package vn.edu.usth.facebook.Messenger;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.facebook.R;

public class Mess_Fragment extends Fragment {

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mess_, container, false);

        RecyclerView recyclerView = v.findViewById(R.id.recyclerviewboxchat);

        List<BoxChatItem> items = new ArrayList<BoxChatItem>();
        items.add(new BoxChatItem("Vu Duc Duy", "22BI13127",  R.drawable.vdd_avatar));
        items.add(new BoxChatItem("Nguyen Viet Anh", "22BI13032",  R.drawable.circle_avatar));
        items.add(new BoxChatItem("Nguyen At", "22BI13047",  R.drawable.at_avata));
        items.add(new BoxChatItem("Pham Hoang Anh", "22BI13034",  R.drawable.hhp_avatar));
        items.add(new BoxChatItem("Lam Chi Cuong", "22BI13068",  R.drawable.capybara_usth));

        // Set up the RecyclerView with a layout manager and adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new BoxChatAdapter(requireContext(), items));

        return v;
    }
}