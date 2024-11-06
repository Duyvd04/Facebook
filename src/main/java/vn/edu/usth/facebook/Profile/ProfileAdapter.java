package vn.edu.usth.facebook.Profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileViewHolder>{

    Context context;
    List<ProfileItem> items;

    public ProfileAdapter(Context context, List<ProfileItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProfileViewHolder(LayoutInflater.from(context).inflate(R.layout.post_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.timeView.setText(items.get(position).getTime());
        holder.contentView.setText(items.get(position).getContent());
        holder.avatarView.setImageResource(items.get(position).getAvatar());
        holder.postView.setImageResource(items.get(position).getPostimage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
