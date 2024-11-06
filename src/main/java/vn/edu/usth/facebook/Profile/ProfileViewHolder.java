package vn.edu.usth.facebook.Profile;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.facebook.R;

public class ProfileViewHolder extends RecyclerView.ViewHolder{

    ImageView avatarView, postView;
    TextView nameView,timeView, contentView;

    public ProfileViewHolder(@NonNull View itemView) {
        super(itemView);
        avatarView = itemView.findViewById(R.id.image_avatar);
        postView = itemView.findViewById(R.id.content_imageview);
        nameView = itemView.findViewById(R.id.user_name);
        timeView = itemView.findViewById(R.id.time);
        contentView = itemView.findViewById(R.id.post_content);
    }
}
