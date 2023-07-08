package com.example.myfirstapp.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstapp.Model.JobPost.JobPost;
import com.example.myfirstapp.Model.Post.Post;
import com.example.myfirstapp.R;

import java.util.List;

public class JobPostAdapter extends RecyclerView.Adapter<JobPostAdapter.JobPostViewHolder>{

    private List<JobPost> jobPostList;

    // set data cho Adapter
    public void setData (List<JobPost> list){
        this.jobPostList = list;
        // ko đc thiếu cái hàm notify -> nó load data lên adapter
        notifyDataSetChanged(); // important!
    }



    @NonNull
    @Override
    public JobPostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_post_detail,
                parent,
                false
        );
        return new JobPostAdapter.JobPostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobPostViewHolder holder, int position) {
        JobPost jobPost = jobPostList.get(position);
        if(jobPost == null){
            return;
        }

        holder.img_JobPost.setImageResource(jobPost.getResourceId());
        holder.tv_titleJobPost.setText(jobPost.getJobPostTitle());
        holder.tv_authorJobPost.setText(jobPost.getAuthorJobPost());
        holder.tv_descriptionJobPost.setText(jobPost.getDescriptionJobPost());
        holder.tv_priceJobPost.setText(jobPost.getPriceJobPost());

    }

    @Override
    public int getItemCount() {


        if(jobPostList != null){
            return jobPostList.size();
        }
        return 0;
    }

    public class JobPostViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_titleJobPost;
        private TextView tv_authorJobPost;
        private TextView tv_descriptionJobPost;
        private TextView tv_priceJobPost;

        private ImageView img_JobPost;

        public JobPostViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_titleJobPost = itemView.findViewById(R.id.tv_titleJobPost);
            tv_authorJobPost = itemView.findViewById(R.id.tv_authorJobPost);
            tv_descriptionJobPost = itemView.findViewById(R.id.tv_descriptionJobPost);
            tv_priceJobPost = itemView.findViewById(R.id.tv_priceJobPost);

            img_JobPost = itemView.findViewById(R.id.img_jobPost);
        }
    }
}
