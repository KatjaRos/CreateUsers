package com.example.createusers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageview;
    TextView userName, emailOut, programOut;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        imageview = itemView.findViewById(R.id.imageView);
        userName = itemView.findViewById(R.id.user_name);
        emailOut = itemView.findViewById(R.id.emailOut);
        programOut = itemView.findViewById(R.id.programOut);


    }
}
