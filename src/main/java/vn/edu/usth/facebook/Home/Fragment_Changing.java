package vn.edu.usth.facebook.Home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Fragment_Changing extends FragmentStateAdapter {

    public Fragment_Changing(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new vn.edu.usth.facebook.Video.VideoFragment();
            case 2:
                return new vn.edu.usth.facebook.Profile.ProfileFragment();
            case 3:
                return new vn.edu.usth.facebook.Notification.NotificationFragment();
            case 4:
                return new vn.edu.usth.facebook.Menu.MenuFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
