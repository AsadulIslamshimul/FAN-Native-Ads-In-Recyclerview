package com.kidsstores.fbnativeads;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.kidsstores.fbnativeads.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        AudienceNetworkAds.initialize(this);

        List<Object> modelList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            modelList.add(new MainModel("DD4You.in", "Please Subscribe my Channel " + i));
        }
        MainAdapter adapter = new MainAdapter(this, modelList, modelList.size());
        binding.recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        adapter.initNativeAds();
    }
}