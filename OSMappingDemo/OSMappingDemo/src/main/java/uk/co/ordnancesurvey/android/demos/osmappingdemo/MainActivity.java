package uk.co.ordnancesurvey.android.demos.osmappingdemo;

import android.os.Bundle;


import uk.co.ordnancesurvey.android.maps.Geocoder;
import uk.co.ordnancesurvey.android.maps.GridPoint;
import uk.co.ordnancesurvey.android.maps.OSMap;
import uk.co.ordnancesurvey.android.maps.OSTileSource;
import uk.co.ordnancesurvey.android.maps.SupportMapFragment;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends FragmentActivity implements OSMap.OnMapClickListener{

    /**
     *  Define your OS Openspace API KEY details below
     *  @see http://www.ordnancesurvey.co.uk/oswebsite/web-services/os-openspace/index.html
     *
     */
    private final static String OS_API_KEY = "DEMOAPI";

    private final static boolean OS_IS_PRO = true;

    private final static String OS_API_URL = "file:///";


    private final static String TAG = "MainActivity";

    private OSMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        SupportMapFragment mf = (SupportMapFragment)fm.findFragmentById(R.id.map_fragment);

        mMap = mf.getMap();

        //create list of tileSources
        ArrayList<OSTileSource> sources = new ArrayList<OSTileSource>();

        //create web tile source with API details
        sources.add(mMap.webTileSource(OS_API_KEY, OS_API_URL, OS_IS_PRO, null));
        mMap.setTileSources(sources);

        // register as OnMapClickListener
        mMap.setOnMapClickListener(this);

      }


    @Override
    protected void onDestroy() {

        super.onDestroy();

    }

    @Override
    public boolean onMapClick(GridPoint gp)
    {

        final String locationMessage = String.format("Map tapped at OSGridPoint\n{%.0f, %.0f}", gp.x, gp.y);

        Toast.makeText(this, locationMessage, Toast.LENGTH_SHORT).show();
        return true;

    }



}
