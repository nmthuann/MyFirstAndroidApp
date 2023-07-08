package com.example.myfirstapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myfirstapp.R;

import java.util.List;

public class CategorySearchAdapter extends ArrayAdapter<String> {
    private List<String> itemList;
    private Context context;

    public CategorySearchAdapter(Context context, List<String> itemList) {
        super(context, 0, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.activity_categories, parent, false);
        }

        String item = itemList.get(position);

        TextView textViewItem = itemView.findViewById(R.id.lvCategories);
        textViewItem.setText(item);

        return itemView;
    }
}
