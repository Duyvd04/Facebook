package vn.edu.usth.facebook.User;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class FriendAdapter extends RecyclerView.Adapter<FriendViewHolder>{

    Context context;
    List<FriendItem> items;

    public FriendAdapter(Context context, List<FriendItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public FriendViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FriendViewHolder(LayoutInflater.from(context).inflate(R.layout.friend_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FriendViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.avatarView.setImageResource(items.get(position).getAvatar());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
