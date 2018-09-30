package com.example.ashwi.song.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ashwi.song.HomeActivity;
import com.example.ashwi.song.ModelFolder.SonglistModel;
import com.example.ashwi.song.R;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongListViewHolder> {



    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<SonglistModel> songList;

    public SongAdapter(Context homeActivity, List<SonglistModel> songlist) {
        this.mCtx=homeActivity;
        this.songList=songlist;
    }

    @NonNull
    @Override
    public SongListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.songlistview,null);
        return new SongListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongListViewHolder songListViewHolder, int i) {

        SonglistModel song=songList.get(i);
        songListViewHolder.textViewTitle.setText(song.getTitle());
        songListViewHolder.textViewShortDesc.setText(song.getShortdesc());
        songListViewHolder.textViewPrice.setText(String.valueOf(song.getPrice()));
        songListViewHolder.textViewRating.setText(String.valueOf(song.getRating()));

        songListViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(song.getImage()));

    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    class SongListViewHolder  extends RecyclerView.ViewHolder{
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;
        public SongListViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);

            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
