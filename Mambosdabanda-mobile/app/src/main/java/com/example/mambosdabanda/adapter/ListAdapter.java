package com.example.mambosdabanda.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mambosdabanda.R;
import com.example.mambosdabanda.model.Loja;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    Context context;
    private List<Loja> items;


    public ListAdapter(Context context, List<Loja> items)
    {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {

        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.loja_list_item, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.itemName);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.itemIcon);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        Loja item = items.get(position);
        viewHolder.txtName.setText(item.getNome());
        Glide.with(context).load(item.getImgUrl()).into(viewHolder.icon);

        return convertView;
    }

    private static class ViewHolder {

        TextView txtName;
        ImageView icon;

    }
}


