package vn.edu.usth.facebook.Menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import vn.edu.usth.facebook.FaceBookActivity;
import vn.edu.usth.facebook.R;

public class MenuFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        ImageButton searchbutton = v.findViewById(R.id.home_search_button);
        searchbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.More.Search_Activity.class );
                startActivity(i);
            }
        });

        LinearLayout logout_button = v.findViewById(R.id.logout_button);
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment loginFragment = new vn.edu.usth.facebook.Login.LoginFragment();
                FragmentTransaction fragmentTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(android.R.id.content, loginFragment);
                fragmentTransaction.commit();

            }
        });

        LinearLayout to_video_page = v.findViewById(R.id.menu_to_video_page);
        to_video_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getActivity() instanceof FaceBookActivity){
                    ((FaceBookActivity) getActivity()).to_video_page();
                }
            }
        });

        LinearLayout to_list_add_friend = v.findViewById(R.id.menu_to_friend_page);
        to_list_add_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(requireContext(), vn.edu.usth.facebook.User.List_Add_Friend_Activity.class );
                startActivity(i);
            }
        });

        return v;
    }
}