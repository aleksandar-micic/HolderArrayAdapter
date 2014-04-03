package com.sixteen11.ui;

import android.view.View;

public abstract class HolderArrayAdapterItem<T> {
    abstract public T newViewHolder();
    abstract public void initViewHolder(View view, Object holder);
    abstract public void updateViewHolder(Object holder);
}
