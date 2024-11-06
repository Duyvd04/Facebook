package vn.edu.usth.facebook.Picture;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import vn.edu.usth.facebook.R;

public class PictureViewHolder extends RecyclerView.ViewHolder{

    ImageView image1, image2, image3, image4;

    public PictureViewHolder(@NonNull View itemView) {
        super(itemView);
        image1 = itemView.findViewById(R.id.picture_1);
        image2 = itemView.findViewById(R.id.picture_2);
        image3 = itemView.findViewById(R.id.picture_3);
        image4 = itemView.findViewById(R.id.picture_4);

    }
}
