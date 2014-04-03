package com.sixteen11.ui;

import android.view.View;

public interface HolderArrayAdapterItem<T> {
    public T newViewHolder();
    public void initViewHolder(View view, Object holder);
    public void updateViewHolder(Object holder);
}
