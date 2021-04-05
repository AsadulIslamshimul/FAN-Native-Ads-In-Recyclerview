package com.kidsstores.fbnativeads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        int[] pImages = {R.drawable.popular_img1,R.drawable.popular_img2,R.drawable.popular_img3,R.drawable.popular_img4,
                R.drawable.popular_img5,R.drawable.popular_img6,R.drawable.popular_img7,R.drawable.popular_img8,
                R.drawable.popular_img9,R.drawable.popular_img10,R.drawable.popular_img11,R.drawable.popular_img12};

        String[] pTitle = getResources().getStringArray(R.array.Popular_title);
        String[] pTime = getResources().getStringArray(R.array.Popular_time);
        String[] pView = getResources().getStringArray(R.array.Popular_view);
        String[] pLink = getResources().getStringArray(R.array.Popular_links);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewID);

        List<Object> modelList = new ArrayList<>();

            modelList.add(new New_MainModel("Title","time","views","links",R.drawable.popular_img1));
            modelList.add(new New_MainModel("Title2","time","views","links",R.drawable.popular_img2));
            modelList.add(new New_MainModel("Title3","time","views","links",R.drawable.popular_img3));

            modelList.add(new New_MainModel("Title3","time","views","links",R.drawable.popular_img3));
            modelList.add(new New_MainModel("Title3","time","views","links",R.drawable.popular_img3));
            modelList.add(new New_MainModel("Title3","time","views","links",R.drawable.popular_img3));
            modelList.add(new New_MainModel("Title3","time","views","links",R.drawable.popular_img3));
            modelList.add(new New_MainModel("Title3","time","views","links",R.drawable.popular_img3));

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);

            AdaterWithGaerSeter adaterWithGaerSeter = new AdaterWithGaerSeter(this,modelList);
            recyclerView.setAdapter(adaterWithGaerSeter);
    }
}