package vn.edu.usth.facebook.User;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.facebook.R;

public class NotFriendViewHolder extends RecyclerView.ViewHolder{

    ImageView avatarView;
    TextView nameView;

    public NotFriendViewHolder(@NonNull View itemView) {
        super(itemView);
        avatarView = itemView.findViewById(R.id.user_image);
        nameView = itemView.findViewById(R.id.user_name);
    }

}
