package com.ordnancesurvey.osmappingdemo;

import android.os.Bundle;


import uk.co.ordnancesurvey.android.maps.Geocoder;
import uk.co.ordnancesurvey.android.maps.GridPoint;
import uk.co.ordnancesurvey.android.maps.OSMap;
import uk.co.ordnancesurvey.android.maps.OSTileSource;
import uk.co.ordnancesurvey.android.maps.SupportMapFragment;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends FragmentActivity implements  OSMap.OnMapClickListener{
    private final static String TAG = "MainActivity";

    private Geocoder mGeocoder;
    private OSMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        SupportMapFragment mf = (SupportMapFragment)fm.findFragmentById(R.id.map_fragment);
        mMap = mf.getMap();

        ArrayList<OSTileSource> sources = new ArrayList<OSTileSource>();

        // Web tile source.
        sources.add(mMap.webTileSource("DEMOAPI", "file:///", true, null));
        mMap.setTileSources(sources);
        mMap.setOnMapClickListener(this);
        mMap.setMyLocationEnabled(true);

   try {
            mGeocoder = new Geocoder(null, "DEMOAPI", "file:///", true);
        }catch (Exception e) {
                 e.printStackTrace();
        }

      }


    @Override
    protected void onDestroy() {
        mGeocoder.close();
        mGeocoder = null;
        super.onDestroy();
    }

    @Override
    public boolean onMapClick(GridPoint gp)
    {
        Toast.makeText(this, "Tapped on map at " + gp.x + ", " + gp.y, Toast.LENGTH_SHORT).show();
        return true;
    }



}
