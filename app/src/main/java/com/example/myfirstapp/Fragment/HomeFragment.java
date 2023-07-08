package com.example.myfirstapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapp.API.ApiService;
import com.example.myfirstapp.Adapter.ListDataAdapter;
import com.example.myfirstapp.Model.Category.Category;
import com.example.myfirstapp.Model.Category.CategoryDto;
import com.example.myfirstapp.Model.JobPost.JobPost;
import com.example.myfirstapp.Model.JobPost.JobPostDto;
import com.example.myfirstapp.Model.ListData;

import com.example.myfirstapp.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    private RecyclerView rcvData;
    private ListDataAdapter listDataAdapter;
    private RecyclerView.LayoutManager layoutManagerHome;

    List<ListData> listData = new ArrayList<>();



    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.activity_home, container, false);

        rcvData = view.findViewById(R.id.rcv_data);
        listDataAdapter = new ListDataAdapter();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        rcvData.setLayoutManager(linearLayoutManager);


        List<Category> categoryList = new ArrayList<>();
        List<String> categoryNameList = new ArrayList<>();
        List<JobPost> jobPostList = new ArrayList<>();
        List<JobPostDto> jobPostDtoArrayList = new ArrayList<>();



        ApiService.apiService.getCategoryNameList().enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                categoryNameList.addAll(response.body());
                categoryList.add(new Category(categoryNameList.get(0), R.drawable.image_1));
                categoryList.add(new Category(categoryNameList.get(1), R.drawable.image_5));
                categoryList.add(new Category(categoryNameList.get(2), R.drawable.image_6));
                categoryList.add(new Category(categoryNameList.get(3), R.drawable.image_7));
                categoryList.add(new Category(categoryNameList.get(5), R.drawable.image_0));
                categoryList.add(new Category(categoryNameList.get(4), R.drawable.image_4));
                categoryList.add(new Category(categoryNameList.get(2), R.drawable.image_9));
                categoryList.add(new Category(categoryNameList.get(8), R.drawable.image_discovery));

                listData.add(new ListData(ListDataAdapter.TYPE_CATEGORY, categoryList, null));
                listData.add(new ListData(ListDataAdapter.TYPE_JOB_POST, null, jobPostList));
                listDataAdapter.setData(getContext(), listData);
                rcvData.setAdapter(listDataAdapter);
            }
            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                Toast.makeText(getContext(), "Call Api Error", Toast.LENGTH_SHORT).show();
            }
        });


        ApiService.apiService.getJobPostList().enqueue(new Callback<List<JobPostDto>>() {
            @Override
            public void onResponse(Call<List<JobPostDto>> call, Response<List<JobPostDto>> response) {
                jobPostDtoArrayList.addAll(response.body());
                jobPostList.add(new JobPost(
                        R.drawable.image_2,
                        jobPostDtoArrayList.get(0).getPost_name(),
                        jobPostDtoArrayList.get(0).getProfile_user(),
                        jobPostDtoArrayList.get(0).getDescription(),
                        "From $" + (jobPostDtoArrayList.get(0).getPrice())));

                jobPostList.add(new JobPost(
                        R.drawable.image_3,
                        jobPostDtoArrayList.get(1).getPost_name(),
                        jobPostDtoArrayList.get(1).getProfile_user(),
                        jobPostDtoArrayList.get(1).getDescription(),
                        "From $" + (jobPostDtoArrayList.get(1).getPrice())));

                jobPostList.add(new JobPost(
                        R.drawable.image_7,
                        jobPostDtoArrayList.get(2).getPost_name(),
                        jobPostDtoArrayList.get(2).getProfile_user(),
                        jobPostDtoArrayList.get(2).getDescription(),
                        "From $" + (jobPostDtoArrayList.get(2).getPrice())));

                jobPostList.add(new JobPost(
                        R.drawable.image_8,
                        jobPostDtoArrayList.get(3).getPost_name(),
                        jobPostDtoArrayList.get(3).getProfile_user(),
                        jobPostDtoArrayList.get(3).getDescription(),
                        "From $" + (jobPostDtoArrayList.get(3).getPrice())));
                listData.add(new ListData(ListDataAdapter.TYPE_CATEGORY, categoryList, null));
                listData.add(new ListData(ListDataAdapter.TYPE_JOB_POST, null, jobPostList));
                listDataAdapter.setData(getContext(), listData);
                rcvData.setAdapter(listDataAdapter);
            }
            @Override
            public void onFailure(Call<List<JobPostDto>> call, Throwable t) {
                Toast.makeText(getContext(), "Call Api Error", Toast.LENGTH_SHORT).show();
            }
        });

//        listDataAdapter.setData(getContext(), listData);
//        rcvData.setAdapter(listDataAdapter);

        return view;
    }

}




























//    public static Bitmap decodeSampledBitmapFromResource(String filePath, int reqWidth, int reqHeight) {
//        // Đọc thông tin về ảnh mà không tải toàn bộ ảnh vào bộ nhớ
//        final BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeFile(filePath, options);
//
//        // Tính toán inSampleSize để giảm độ phân giải của ảnh
//        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
//
//        // Giải nén ảnh với kích thước mới đã tính toán
//        options.inJustDecodeBounds = false;
//        return BitmapFactory.decodeFile(filePath, options);
//    }
//
//    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
//        // Chiều rộng và chiều cao thực tế của ảnh
//        final int width = options.outWidth;
//        final int height = options.outHeight;
//        int inSampleSize = 1;
//
//        // Nếu kích thước thực tế lớn hơn kích thước mong muốn
//        if (height > reqHeight || width > reqWidth) {
//            final int halfHeight = height / 2;
//            final int halfWidth = width / 2;
//
//            // Lặp lại cho đến khi kích thước mong muốn được đạt được
//            while ((halfHeight / inSampleSize) >= reqHeight && (halfWidth / inSampleSize) >= reqWidth) {
//                inSampleSize *= 2;
//            }
//        }
//        return inSampleSize;
//    }
