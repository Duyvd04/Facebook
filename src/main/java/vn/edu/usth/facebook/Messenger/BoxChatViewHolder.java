package vn.edu.usth.facebook.Messenger;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.facebook.R;

public class BoxChatViewHolder extends RecyclerView.ViewHolder{

    ImageView avatarView;
    TextView nameView, contentView;

    public BoxChatViewHolder(@NonNull View itemView) {
        super(itemView);
        avatarView = itemView.findViewById(R.id.boxchat_avatar);
        nameView = itemView.findViewById(R.id.boxchat_name);
        contentView = itemView.findViewById(R.id.boxchat_content);
    }
}
