package com.example.krupa.tour_guide_app;

/**
 * Created by krupa on 13/6/17.
 */

import android.content.Context;

import java.util.ArrayList;
import java.util.List;


public class PlacesList {

    public static List<Place> getPlaces(Context context, String topic) {
        if (topic.equals(context.getString(R.string.topic_Attractions))) {
            return getSeeAndDoPlaces(context);
        } else if (topic.equals(context.getString(R.string.topic_dine))) {
            return getDinePlaces(context);
        } else if (topic.equals(context.getString(R.string.topic_shop))) {
            return getShopPlaces(context);
        } else if (topic.equals(context.getString(R.string.topic_stay))) {
            return getStayPlaces(context);
        }
        return new ArrayList<>();
    }

    public static List<Place> getSeeAndDoPlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.location_universal_studios), context.getString(R.string.location_universal_studios_desc), R.drawable.universal_studios));
        places.add(new Place(context.getString(R.string.location_sea_aquarium), context.getString(R.string.location_sea_aquarium_desc), R.drawable.sea_aquarium));
        places.add(new Place(context.getString(R.string.location_marina_skypark), context.getString(R.string.location_marina_skypark_desc), R.drawable.marina_bay_sands));
        places.add(new Place(context.getString(R.string.location_gardens_by_the_bay), context.getString(R.string.loc_gardens_by_the_bay_desc), R.drawable.supertrees_gardens_by_the_bay));
        places.add(new Place(context.getString(R.string.location_night_safari), context.getString(R.string.location_night_safari_desc), R.drawable.night_safari));
        places.add(new Place(context.getString(R.string.location_jurong_bird_park), context.getString(R.string.location_jurong_bird_park_desc), R.drawable.jurong_birdpark));
        return places;
    }

    public static List<Place> getDinePlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.location_summer_pavillion), context.getString(R.string.location_summer_pavillion_desc), R.drawable.summer_pavillion));
        places.add(new Place(context.getString(R.string.location_crystal_jade_golden_palace), context.getString(R.string.location_crystal_jade_golden_palace_desc), R.drawable.crysta_jade_golden_palace));
        places.add(new Place(context.getString(R.string.location_equinox), context.getString(R.string.location_equinox_desc), R.drawable.equinox));
        places.add(new Place(context.getString(R.string.location_song_of_india), context.getString(R.string.location_song_of_india_desc), R.drawable.song_of_india));
        places.add(new Place(context.getString(R.string.location_garibaldi), context.getString(R.string.location_garibaldi_desc), R.drawable.garibaldi));
        places.add(new Place(context.getString(R.string.location_cut_restaurant), context.getString(R.string.location_cut_desc), R.drawable.cut));
        return places;
    }

    public static List<Place> getShopPlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.location_suntec_city), context.getString(R.string.location_suntec_city_desc), R.drawable.sunteccity));
        places.add(new Place(context.getString(R.string.location_orchard_road), context.getString(R.string.location_orchard_road_desc), R.drawable.orchard));
        places.add(new Place(context.getString(R.string.location_shopees), context.getString(R.string.location_shopees_desc), R.drawable.marina_bay_sands_mall));
        places.add(new Place(context.getString(R.string.location_Vivocity), context.getString(R.string.location_vivocity_desc), R.drawable.vivocity_singapore));
        places.add(new Place(context.getString(R.string.location_takashimaya), context.getString(R.string.location_takashimaya_desc), R.drawable.takashimaya));
        places.add(new Place(context.getString(R.string.location_bugis), context.getString(R.string.location_bugis_desc), R.drawable.bugis_street));
        return places;
    }

    public static List<Place> getStayPlaces(Context context) {
        List<Place> places = new ArrayList<>();
        places.add(new Place(context.getString(R.string.location_raffles_hotel), context.getString(R.string.location_raffles_hotel_desc), R.drawable.raffles));
        places.add(new Place(context.getString(R.string.location_pan_pacific), context.getString(R.string.location_pan_pacific_desc), R.drawable.pan_pacific));
        places.add(new Place(context.getString(R.string.location_ritz_carlton), context.getString(R.string.location_ritz_carlton_desc), R.drawable.ritz_carlton));
        places.add(new Place(context.getString(R.string.location_sheraton_towers), context.getString(R.string.location_sheraton_towers_desc), R.drawable.sheraton_towers));
        places.add(new Place(context.getString(R.string.location_holiday_inn), context.getString(R.string.place_hilton_garden_inn_desc), R.drawable.holiday_inn));
        places.add(new Place(context.getString(R.string.location_holiday_inn_desc), context.getString(R.string.location_hilton_desc), R.drawable.hilton));
        return places;
    }

}

