package com.malik.youtuberecyclervewdemo;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.malik.youtuberecyclervewdemo.adapter.YoutubeRecyclerAdapter;
import com.malik.youtuberecyclervewdemo.model.YoutubeVideo;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerViewFeed)
    RecyclerView recyclerViewFeed;
    YoutubeRecyclerAdapter mRecyclerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // prepare data for list
        List<YoutubeVideo> youtubeVideos = prepareList();
        mRecyclerAdapter = new YoutubeRecyclerAdapter(youtubeVideos);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewFeed.setLayoutManager(mLayoutManager);
        recyclerViewFeed.setItemAnimator(new DefaultItemAnimator());
        recyclerViewFeed.setAdapter(mRecyclerAdapter);

    }
    private List<YoutubeVideo> prepareList() {
        ArrayList<YoutubeVideo> videoArrayList=new ArrayList<>();




        // add first item
        YoutubeVideo video1 = new YoutubeVideo();
        video1.setId(1L);
        video1.setImageUrl("");
        video1.setTitle("Cena vs. Orton vs. Triple H vs. Big Show — Fatal 4-Way WWE Championship Match");
        video1.setVideoId("L2uneW6tcyI");
        // add second item
        YoutubeVideo video2 = new YoutubeVideo();
        video2.setId(2L);
        video2.setImageUrl("https://i.ytimg.com/vi/8ZK_S-46KwE/maxresdefault.jpg");
        video2.setTitle(
                "Colors for Children to Learning with Baby Fun Play with Color Balls Dolphin...");
        video2.setVideoId("8ZK_S-46KwE");
        // add third item
        YoutubeVideo video3 = new YoutubeVideo();
        video3.setId(3L);
        video3.setImageUrl("https://i.ytimg.com/vi/8czMWUH7vW4/hqdefault.jpg");
        video3.setTitle("Air Hostess Accepts Marriage Proposal Mid-Air, Airline Fires her.");
        video3.setVideoId("8czMWUH7vW4");
        // add four item
        YoutubeVideo video4 = new YoutubeVideo();
        video4.setId(4L);
        video4.setImageUrl("https://i.ytimg.com/vi/YrQVYEb6hcc/maxresdefault.jpg");
        video4.setTitle("EXPERIMENT Glowing 1000 degree METAL BALL vs Gunpowder (100 grams)");
        video4.setVideoId("YrQVYEb6hcc");
        // add four item
        YoutubeVideo video5 = new YoutubeVideo();
        video5.setId(5L);
        video5.setImageUrl("https://i.ytimg.com/vi/S84Fuo2rGoY/maxresdefault.jpg");
        video5.setTitle("What happened after Jauhar of Padmavati");
        video5.setVideoId("S84Fuo2rGoY");
        videoArrayList.add(video1);
        videoArrayList.add(video2);
        videoArrayList.add(video3);
        videoArrayList.add(video4);
        videoArrayList.add(video5);
        return videoArrayList;
    }

}
