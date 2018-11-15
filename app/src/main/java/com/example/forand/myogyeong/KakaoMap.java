package com.example.forand.myogyeong;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;


import net.daum.android.map.MapViewEventListener;
import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapReverseGeoCoder;
import net.daum.mf.map.api.MapView;

import java.security.MessageDigest;

class KakaoMap extends AppCompatActivity implements MapView.CurrentLocationEventListener, MapView.OpenAPIKeyAuthenticationResultListener{

    private MapView mapView;
    private MapPOIItem poiItem;
    private MapReverseGeoCoder reverseGeoCoder = null;
    MapPoint mapPoint;

    private static final String LOG_TAG = "DaumMapLibrarySample";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakao_map);
        MapView.setMapTilePersistentCacheEnabled(true);

        mapView = new MapView(this);
        mapView.setCurrentLocationEventListener(this);
        mapView.setShowCurrentLocationMarker(true);
        mapView.setDaumMapApiKey("9a364676ed791a769bb00c9a40c1f9df");
        mapView.setOpenAPIKeyAuthenticationResultListener(this);
        //mapView.setMapViewEventListener((MapViewEventListener) this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);

        mapView.setMapType(MapView.MapType.Standard);

        LocationManager locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        //mapView.setMapCenterPoint(mapPoint, true);
        //true면 앱 실행 시 애니메이션 효과가 나오고 false면 애니메이션이 나오지않음.
        mapViewContainer.addView(mapView);

        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("내 위치");
        marker.setTag(0);
        //marker.setMapPoint(mapPoint);

        // 기본으로 제공하는 BluePin 마커 모양.
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin);

        // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양.
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);

        mapView.addPOIItem(marker);

    }

    @Override
    public void onCurrentLocationUpdate(MapView mapView, MapPoint mapPoint, float v) {
        MapPoint.GeoCoordinate mapPointGeo = mapPoint.getMapPointGeoCoord();
        Log.i(LOG_TAG, String.format("MapView onCurrentLocationUpdate (%f,%f) accuracy (%f)", mapPointGeo.latitude, mapPointGeo.longitude, v));
    }


    @Override
    public void onCurrentLocationDeviceHeadingUpdate(MapView mapView, float v) {
        Log.i(LOG_TAG, String.format("MapView onCurrentLocationDeviceHeadingUpdate: device heading = %f degrees", v));
    }

    @Override
    public void onCurrentLocationUpdateFailed(MapView mapView) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("DaumMapLibrarySample");
        alertDialog.setMessage("Current Location Update Failed!");
        alertDialog.setPositiveButton("OK", null);
        alertDialog.show();
    }

    @Override
    public void onCurrentLocationUpdateCancelled(MapView mapView) {

    }

    @Override
    public void onDaumMapOpenAPIKeyAuthenticationResult(MapView mapView, int i, String s) {
        Log.i(LOG_TAG,   String.format("Open API Key Authentication Result : code=%d, message=%s", i, s));
    }


}