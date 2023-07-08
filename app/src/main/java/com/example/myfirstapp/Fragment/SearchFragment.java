package com.example.myfirstapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myfirstapp.API.ApiService;
import com.example.myfirstapp.Model.Category.Category;
import com.example.myfirstapp.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class    SearchFragment extends Fragment  {

    private ListView listView;
    private ArrayAdapter<String> adapter;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_category_search, container, false);

        listView = view.findViewById(R.id.lv_category_search);

        // Tạo dữ liệu mẫu -> call API here
        List<String> data = new ArrayList<>();
        ApiService.apiService.getCategoryNameList().enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                data.addAll(response.body());
                adapter = new ArrayAdapter<>(
                        requireContext(),
                        android.R.layout.simple_expandable_list_item_1,
                        data
                );
                listView.setAdapter(adapter); // show -> .setAdapter
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                Toast.makeText(getContext(), "Call Api Error", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
