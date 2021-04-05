package com.kidsstores.fbnativeads;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaterWithGaerSeter extends RecyclerView.Adapter<AdaterWithGaerSeter.ViewHolder> {

    private Context context;
    private List<Object> objectList;

    public AdaterWithGaerSeter(Context context, List<Object> objectList) {
        this.context = context;
        this.objectList = objectList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout,parent,false);
        context = parent.getContext();
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        New_MainModel mainModel = (New_MainModel) objectList.get(position);

        holder.imageView.setImageResource(mainModel.getImages());
        holder.titleText.setText(mainModel.getTitle());
        holder.timeText.setText(mainModel.getTime());
        holder.viewText.setText(mainModel.getViews());
        holder.linkText.setText(mainModel.getLinks());
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView titleText,timeText,viewText,linkText;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleText = itemView.findViewById(R.id.titletextId);
            timeText = itemView.findViewById(R.id.timetextId);
            viewText = itemView.findViewById(R.id.viewTextId);
            linkText = itemView.findViewById(R.id.link_TextId);
            imageView = itemView.findViewById(R.id.main_imgId);
        }
    }
}
