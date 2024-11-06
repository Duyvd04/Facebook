package vn.edu.usth.facebook.Picture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.facebook.R;

public class PictureAdapter extends RecyclerView.Adapter<PictureViewHolder>{

    Context context;
    List<PictureItem> items;

    public PictureAdapter(Context context, List<PictureItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PictureViewHolder(LayoutInflater.from(context).inflate(R.layout.picture_frame,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder holder, int position) {
        holder.image1.setImageResource(items.get(position).getImage_1());
        holder.image2.setImageResource(items.get(position).getImage_2());
        holder.image3.setImageResource(items.get(position).getImage_3());
        holder.image4.setImageResource(items.get(position).getImage_4());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
