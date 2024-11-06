package vn.edu.usth.facebook.Messenger;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Mess_Fragment_Changing extends FragmentStateAdapter{

    public Mess_Fragment_Changing(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Mess_Fragment();
            case 1:
                return new Stories_Fragment();
            default:
                return new Mess_Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

