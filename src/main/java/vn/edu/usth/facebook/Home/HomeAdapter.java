package vn.edu.usth.facebook.Home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {

    Context context;
    List<HomeItem> items;

    public HomeAdapter(Context context, List<HomeItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHolder(LayoutInflater.from(context).inflate(R.layout.post_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
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