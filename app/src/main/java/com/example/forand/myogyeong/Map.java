package com.example.forand.myogyeong;

import android.Manifest;
import android.app.PendingIntent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowManager;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

public class Map extends AppCompatActivity {

    private LocationManager mLocationManager;
    private PendingIntent mLocationListener;

    Location location; // GPSInfo
    double lat = 37.578305;
    double lon = 126.977358;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 화면 가로 고정
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // 상태바 제거
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_map);

        int permissionCheck = ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION);
        int permissionCheck2 = ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION);

        if(permissionCheck !=PackageManager.PERMISSION_GRANTED &&permissionCheck2 != PackageManager.PERMISSION_GRANTED) {
            if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_COARSE_LOCATION) &&
                    ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},101);
                ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},101);
            }
        }

        try {
            mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 1, mLocationListener);
            if (mLocationManager != null){
                location=mLocationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                if (location != null){
                    // 위도 경도 저장
                    lat = location.getLatitude();
                    lon = location.getLongitude();
                } // GPSInfo
            }
            mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1, 100, mLocationListener);
        }catch(Exception e) {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_COARSE_LOCATION},101);
        }

        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("9a364676ed791a769bb00c9a40c1f9df");

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithoutHeading);

        MapPoint mapPoint = MapPoint.mapPointWithGeoCoord(lat, lon);
        mapView.setMapCenterPoint(mapPoint, true);
        // true면 앱 실행 시 애니메이션 효과가 나오고 false면 애니메이션이 나오지 않음
        mapViewContainer.addView(mapView);

        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("내 위치");
        marker.setTag(0);
        marker.setMapPoint(mapPoint);

        // 기본으로 제공하는 BluePin 마커 모양
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin);
        // 마커를 클릭했을때, 기본으로 제공하는 RedPin 마커 모양
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);

        mapView.addPOIItem(marker);
    }

}