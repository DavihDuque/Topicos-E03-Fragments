package com.example.fragments.Place;

import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.fragments.R;

public class PlaceFragment extends Fragment {

    ImageView placePhoto;
    TextView lblTitle, lblComment, lblDistance;
    RatingBar ratingBar;

    public PlaceFragment() {
        super(R.layout.fragment_place_details);
    }

    public void updatePlace(Place place) {
        placePhoto = this.getActivity().findViewById(R.id.imgPlacePic);
        lblTitle = this.getActivity().findViewById(R.id.lblTitle);
        lblComment = this.getActivity().findViewById(R.id.lblComment);
        ratingBar = this.getActivity().findViewById(R.id.ratingBar);
        lblDistance = this.getActivity().findViewById(R.id.lblDistance);

        Log.d("Photo ID", "photo id: " + place.getPhotoId());
        placePhoto.setImageResource(place.getPhotoId());
        lblTitle.setText(place.getName());
        lblComment.setText(place.getDescription());
        ratingBar.setRating(place.getRate());
        lblDistance.setText(String.format("%sKm", place.getDistance().toString()));

    }

}