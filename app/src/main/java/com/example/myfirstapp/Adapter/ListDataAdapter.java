package com.example.myfirstapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapp.Model.ListData;
import com.example.myfirstapp.R;

import java.util.List;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.ListDataViewHolder>{

    public static final  int TYPE_CATEGORY = 1;
    public static final  int TYPE_JOB_POST = 2;

    private List<ListData> mListDataList;
    private Context mContext;

    public void setData(Context context, List<ListData> listData){
        this.mContext = context;
        this.mListDataList = listData;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {


        return mListDataList.get(position).getType();
    }

    @NonNull
    @Override
    public ListDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(
                parent.getContext()).inflate(
                        R.layout.layout_list_data,
                parent,
                false);
        return new ListDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataViewHolder holder, int position) {
        // phaan biet Type
        ListData listData = mListDataList.get(position);
        if(listData == null){
            return;
        }
        if (holder.getItemViewType() == TYPE_CATEGORY){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                    mContext,
                    RecyclerView.HORIZONTAL,
                    false);
            holder.rcvItem.setLayoutManager(linearLayoutManager);
            holder.rcvItem.setFocusable(false);

            CategoryAdapter categoryAdapter = new CategoryAdapter();
            categoryAdapter.setData(listData.getCategoryList());

            holder.rcvItem.setAdapter(categoryAdapter);
        } else if (TYPE_JOB_POST == holder.getItemViewType()) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                    mContext,
                    RecyclerView.HORIZONTAL,
                    false);
            holder.rcvItem.setLayoutManager(linearLayoutManager);
            holder.rcvItem.setFocusable(false);

            JobPostAdapter jobPostAdapter = new JobPostAdapter();
            jobPostAdapter.setData(listData.getJobPostList());

            holder.rcvItem.setAdapter(jobPostAdapter);
        }
    }

    @Override
    public int getItemCount() {
        if(mListDataList!=null){
            return mListDataList.size();
        }
        return 0;
    }

    public class ListDataViewHolder extends RecyclerView.ViewHolder{

        private RecyclerView rcvItem;


        public ListDataViewHolder(@NonNull View itemView) {
            super(itemView);

            rcvItem = itemView.findViewById(R.id.rcv_item);

        }
    }
}
