package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
//    private RecyclerView rcvCategory;
//    private CategoryAdapter categoryAdapter;

//    private CategoryDetailAdapter categoryDetailAdapter;
//    DrawerLayout drawerLayout;
//    ActionBarDrawerToggle actionBarDrawerToggle ;
//    NavigationView navigationView;
//    ViewFlipper viewFlipper;

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i(TAG, "onStart: ");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i(TAG, "onStop: ");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i(TAG, "onDestroy: ");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i(TAG, "onPause: ");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i(TAG, "onResume: ");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.i(TAG, "onRestart: ");
//    }

    @SuppressLint("MissingInflatedId") // anotation bỏ qua cảnh báo thiếu id cho 1 view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * bottomNavigationView
         * 5 chức năng
         * Home - Message - Search - Noti - Account
         */

        bottomNavigationView = findViewById(R.id.bottom_nav);
        viewPager = findViewById(R.id.view_pager);
        setUpViewPager();

        // navigation bar
        bottomNavigationView.setOnNavigationItemSelectedListener(
                (item) -> {
                    switch (item.getItemId()){
                        case R.id.navigation_home:
                            Toast.makeText(MainActivity.this,
                                    "Home", Toast.LENGTH_SHORT).show();
                            viewPager.setCurrentItem(0);
                            break;
                        case R.id.navigation_message:
                            Toast.makeText(MainActivity.this,
                                    "Message", Toast.LENGTH_SHORT).show();
                            viewPager.setCurrentItem(1);
                            break;
                        case R.id.navigation_search:
                            Toast.makeText(MainActivity.this,
                                    "Search", Toast.LENGTH_SHORT).show();
                            viewPager.setCurrentItem(2);
                            break;
                        case R.id.navigation_notifications:
                            Toast.makeText(MainActivity.this,
                                    "Notifications", Toast.LENGTH_SHORT).show();
                            viewPager.setCurrentItem(3);
                            break;
                        case R.id.navigation_account:
                            Toast.makeText(MainActivity.this,
                                    "Account", Toast.LENGTH_SHORT).show();
                            viewPager.setCurrentItem(4);
                            break;
                    }
                    return true;
                });
        Log.i(TAG, "onCreate: ");
    }

    private void setUpViewPager() {
        ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(
                getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPager2Adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(
                    int position,
                    float positionOffset,
                    int positionOffsetPixels)
            {}
            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bottomNavigationView
                                .getMenu()
                                .findItem(R.id.navigation_home)
                                .setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView
                                .getMenu()
                                .findItem(R.id.navigation_message)
                                .setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView
                                .getMenu()
                                .findItem(R.id.navigation_search)
                                .setChecked(true);
                        break;
                    case 3:
                        bottomNavigationView
                                .getMenu()
                                .findItem(R.id.navigation_notifications)
                                .setChecked(true);
                        break;
                    case 4:
                        bottomNavigationView
                                .getMenu()
                                .findItem(R.id.navigation_account)
                                .setChecked(true);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

    }
}





//rcvCategory = findViewById(R.id.rcv_category);
//        categoryAdapter = new CategoryAdapter(this);
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
//        this,
//        RecyclerView.VERTICAL,
//        false
//        );
//        rcvCategory.setLayoutManager(linearLayoutManager);
//
//        categoryAdapter.setData(getCategoryList());
//        rcvCategory.setAdapter(categoryAdapter);














//    private List<Category> getCategoryList(){
//        List<Category> list = new ArrayList<>();
//
//        List<Post> postList = new ArrayList<>();
//        postList.add(new Post(R.drawable.image_1, "Job Post 1"));
//        postList.add(new Post(R.drawable.image_2, "Job Post 2"));
//        postList.add(new Post(R.drawable.image_3, "Job Post 3"));
//        postList.add(new Post(R.drawable.image_4, "Job Post 4"));
//        postList.add(new Post(R.drawable.image_5, "Job Post 5"));
//        postList.add(new Post(R.drawable.image_6, "Job Post 6"));
//        postList.add(new Post(R.drawable.image_7, "Job Post 7"));
//        postList.add(new Post(R.drawable.image_8, "Job Post 8"));
//        postList.add(new Post(R.drawable.image_9, "Job Post 9"));
//
//
//        list.add(new Category("Category 1", postList));
//        list.add(new Category("Category 2", postList));
//        return list;
//    }



//
//    private List<String> getCategories() {
//        //  khai báo mảng cái category name
//        List<String> list = new ArrayList<>();
//        for(int i = 0 ; i <=20; i++){
//            list.add("Category name " + i);
//        }
//        return list;
//    }






//                            recyclerView = findViewById(R.id.rcv_category);
//                            categoryAdapter = new CategoryAdapter();
//                            LinearLayoutManager linearLayoutManager =
//                                    new LinearLayoutManager(this);
//                            recyclerView.setLayoutManager(linearLayoutManager);
//                            categoryAdapter.setCategories(getCategories());
//                            recyclerView.setAdapter(categoryAdapter);
//                            recyclerView.addOnScrollListener(
//                                    new RecyclerView.OnScrollListener() {
//                                @Override
//                                public void onScrolled(
//                                        @NonNull RecyclerView recyclerView, int dx, int dy)
//                                {
//                                    super.onScrolled(recyclerView, dx, dy);
//                                    //if (dx>0)
//                                }
//                            });
