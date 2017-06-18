package com.example.krupa.tour_guide_app.adapter;

/**
 * Created by krupa on 13/6/17.
 */



import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.krupa.tour_guide_app.R;
import com.example.krupa.tour_guide_app.Place;

import java.util.List;


public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.ViewHolder> {

    private List<Place> mPlaces;

    public PlacesAdapter(List<Place> places) {
        mPlaces = places;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Place place = mPlaces.get(position);
        holder.mPlaceNameTextView.setText(place.getName());
        holder.mPlaceDescriptionTextView.setText(place.getDescription());
        holder.mPlaceImageView.setImageResource(place.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return mPlaces.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mPlaceImageView;
        TextView mPlaceNameTextView;
        TextView mPlaceDescriptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mPlaceImageView = (ImageView) itemView.findViewById(R.id.place_image_view);
            mPlaceNameTextView = (TextView) itemView.findViewById(R.id.place_name_text_view);
            mPlaceDescriptionTextView = (TextView) itemView.findViewById(R.id.place_description_text_view);
        }

    }

}