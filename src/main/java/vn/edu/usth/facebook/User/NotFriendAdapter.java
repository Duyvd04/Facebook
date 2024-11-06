package vn.edu.usth.facebook.User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class NotFriendAdapter extends RecyclerView.Adapter<NotFriendViewHolder>{

    Context context;
    List<NotFriendItem> items;

    public NotFriendAdapter(Context context, List<NotFriendItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public NotFriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NotFriendViewHolder(LayoutInflater.from(context).inflate(R.layout.not_friend_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NotFriendViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.avatarView.setImageResource(items.get(position).getAvatar());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
