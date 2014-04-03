package com.sixteen11.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;

import java.util.List;


public class HolderArrayAdapter<T extends HolderArrayAdapterItem> extends ArrayAdapter<T> implements Filterable {
    protected int mResource;

    public HolderArrayAdapter(Context context, int resource) {
        super(context, resource);

        mResource = resource;
    }

    public HolderArrayAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);

        mResource = resource;
    }

    public HolderArrayAdapter(Context context, int resource, T[] objects) {
        super(context,resource, objects);

        mResource = resource;
    }

    public HolderArrayAdapter(Context context, int resource, int textViewResourceId, T[] objects) {
        super(context, resource, textViewResourceId, objects);

        mResource = resource;
    }

    public HolderArrayAdapter(Context context, int resource, List<T> objects) {
        super(context, resource, objects);

        mResource = resource;
    }

    public HolderArrayAdapter(Context context, int resource, int textViewResourceId, List<T> objects) {
        super(context, resource, textViewResourceId, objects);

        mResource = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        T holderItem = getItem(position);

        Object viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(mResource, null);
            
            viewHolder = holderItem.newViewHolder();
            holderItem.initViewHolder(convertView, viewHolder);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = convertView.getTag();
        }
        
        holderItem.updateViewHolder(viewHolder);

        return convertView;
    }
}
