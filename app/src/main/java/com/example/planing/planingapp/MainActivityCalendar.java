package com.example.planing.planingapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivityCalendar extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;
    private CalendarFragment homeFragment;
    private DailyFragment dailyFragment;
    private SettingFragment settingFrament;
    private WheelFragment wheelFragment;
    private MonthlyFragment monthlyFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_wheel:
                    mTextMessage.setText(R.string.title_wheel);
                    return true;
                case R.id.navigation_daily:
                    mTextMessage.setText(R.string.title_daily);
                    return true;
                case R.id.navigation_calendar:
                    mTextMessage.setText(R.string.title_calendar);
                    return true;
                case R.id.navigation_monthly:
                    mTextMessage.setText(R.string.title_monthly);
                    return true;
                case R.id.navigation_setting:
                    mTextMessage.setText(R.string.title_setting);
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calendar);

        //mTextMessage = (TextView) findViewById(R.id.message);
       //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mMainFrame = ( FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.navigation);

        homeFragment = new CalendarFragment();
        settingFrament = new SettingFragment();
        wheelFragment = new WheelFragment();
        monthlyFragment = new MonthlyFragment();
        dailyFragment = new DailyFragment();


        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()) {

                case R.id.navigation_calendar:
                    mMainNav.setItemBackgroundResource(R.color.colorlighten);
                    setFragment(homeFragment);
                    return true;

                case R.id.navigation_daily:
                    mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                    setFragment(dailyFragment);
                    return true;

                case R.id.navigation_wheel:
                    mMainNav.setItemBackgroundResource(R.color.colorlighten);
                    setFragment(wheelFragment);
                    return true;

                case R.id.navigation_monthly:
                    mMainNav.setItemBackgroundResource(R.color.colorlighten);
                    setFragment(monthlyFragment);
                    return true;

                case R.id.navigation_setting:
                    mMainNav.setItemBackgroundResource(R.color.colorlighten);
                    setFragment(settingFrament);
                    return true;


                default:
                    return false;



            }

        }

    });

}

    private void setFragment(Fragment fragment)
        {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
        }
    }
