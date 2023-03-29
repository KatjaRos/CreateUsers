package com.example.createusers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    private ArrayList <UserInformation> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<UserInformation> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view,parent,false ));

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userName.setText(users.get(position).getFname()+" "+users.get(position).getLname());
        holder.emailOut.setText(users.get(position).getEmail());
        holder.programOut.setText(users.get(position).getProgram());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
