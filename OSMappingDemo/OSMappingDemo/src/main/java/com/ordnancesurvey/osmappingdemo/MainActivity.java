package com.ordnancesurvey.osmappingdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;


import uk.co.ordnancesurvey.android.maps.FailedToLoadException;
import uk.co.ordnancesurvey.android.maps.Geocoder;
import uk.co.ordnancesurvey.android.maps.GridPoint;
import uk.co.ordnancesurvey.android.maps.OSMap;
import uk.co.ordnancesurvey.android.maps.OSTileSource;
import uk.co.ordnancesurvey.android.maps.SupportMapFragment;
import android.os.Environment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import java.io.File;
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

        // Fall back to a web tile source.
        sources.add(mMap.webTileSource("DEMOAPI", "file:///", true, null));
        mMap.setTileSources(sources);
        mMap.setOnMapClickListener(this);
  //      mMap.setInfoWindowAdapter(this);
        mMap.setMyLocationEnabled(true);

   try {
            File db =  new File(Environment.getExternalStorageDirectory(), "gaz50k.ospoi");
            mGeocoder = new Geocoder(db, "DEMOAPI", "file:///", true);
        } catch (FailedToLoadException e) {
            Toast.makeText(this, "Could not find gaz50k.ospoi on sdcard", Toast.LENGTH_SHORT).show();
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
