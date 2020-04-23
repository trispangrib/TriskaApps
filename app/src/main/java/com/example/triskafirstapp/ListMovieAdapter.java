package com.example.triskafirstapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ListViewHolder> {
    private ArrayList<Movie> listMovie;

    public ListMovieAdapter(ArrayList<Movie> list) {
        this.listMovie = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_movie, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Movie movie = listMovie.get(position);
        Glide.with(holder.itemView.getContext())
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(movie.getName());
        holder.tvDetail.setText(movie.getDetail());
    }

    @Override
    public int getItemCount() {

        return listMovie.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        private RelativeLayout itemList;
        private Context context;

        ListViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            itemList = itemView.findViewById(R.id.item_list);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            itemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()) {
                        case 0:
                            intent = new Intent(context, views.class);
                            break;

                        case 1:
                            intent = new Intent(context, views2.class);
                            break;

                        case 2:
                            intent = new Intent(context, views3.class);
                            break;

                        case 3:
                            intent = new Intent(context, views4.class);
                            break;

                        case 4:
                            intent = new Intent(context, views5.class);
                            break;

                        case 5:
                            intent = new Intent(context, views6.class);
                            break;

                        case 6:
                            intent = new Intent(context, views7.class);
                            break;

                        case 7:
                            intent = new Intent(context, views8.class);
                            break;

                        case 8:
                            intent = new Intent(context, views9.class);
                            break;

                        case 9:
                            intent = new Intent(context, views10.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });
        }}}

