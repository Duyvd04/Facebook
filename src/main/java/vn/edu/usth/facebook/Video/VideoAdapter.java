package vn.edu.usth.facebook.Video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class VideoAdapter extends RecyclerView.Adapter<VideoViewHolder> {

    Context context;
    List<VideoItem> items;

    public VideoAdapter(Context context, List<VideoItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VideoViewHolder(LayoutInflater.from(context).inflate(R.layout.video_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        VideoItem link = items.get(position);

        holder.nameView.setText(items.get(position).getName());

        holder.timeView.setText(items.get(position).getTime());

        holder.contentView.setText(items.get(position).getContent());

        holder.avatarView.setImageResource(items.get(position).getAvatar());

        holder.bind(link);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
