package com.example.myfirstapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.myfirstapp.Fragment.AccountFragment;
import com.example.myfirstapp.Fragment.HomeFragment;
import com.example.myfirstapp.Fragment.MessageFragment;
import com.example.myfirstapp.Fragment.NotificationFragment;
import com.example.myfirstapp.Fragment.SearchFragment;
//import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager2Adapter extends FragmentStatePagerAdapter {

    public ViewPager2Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                return new MessageFragment();
            case 2:
                return new SearchFragment();
            case 3:
                return new NotificationFragment();
            case 4:
                return new AccountFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
