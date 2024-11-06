package vn.edu.usth.facebook.Messenger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class BoxChatAdapter  extends RecyclerView.Adapter<BoxChatViewHolder> {
    
    Context context;
    List<BoxChatItem> items;

    public BoxChatAdapter(Context context, List<BoxChatItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public BoxChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BoxChatViewHolder(LayoutInflater.from(context).inflate(R.layout.boxchat_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BoxChatViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.contentView.setText(items.get(position).getContent());
        holder.avatarView.setImageResource(items.get(position).getAvatar());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    
}
