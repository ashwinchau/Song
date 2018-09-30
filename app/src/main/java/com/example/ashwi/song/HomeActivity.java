package com.example.ashwi.song;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ashwi.song.Adapter.SongAdapter;
import com.example.ashwi.song.ModelFolder.SonglistModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    //A list to store all the song
    List<SonglistModel> songlist;


    //The Recyclerview

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView=findViewById(R.id.songRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        songlist=new ArrayList<>();

        songlist.add(
                new SonglistModel(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.mac));
        songlist.add(
                new SonglistModel(1,"Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)","14 inch, Gray, 1.659 kg",4.3,
                        60000,R.drawable.dell));

        songlist.add(
                new SonglistModel(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.surface));

        SongAdapter adapter=new SongAdapter(this,songlist);
        recyclerView.setAdapter(adapter);
    }
}
