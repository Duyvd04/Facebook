package vn.edu.usth.facebook.Notification;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.facebook.R;

public class NotificationViewHolder extends RecyclerView.ViewHolder {

    ImageView avatarView;
    TextView nameView,timeView;

    public NotificationViewHolder(@NonNull View itemView) {
        super(itemView);
        avatarView = itemView.findViewById(R.id.noti_image);
        nameView = itemView.findViewById(R.id.noti_name);
        timeView = itemView.findViewById(R.id.noti_time);
    }


}
