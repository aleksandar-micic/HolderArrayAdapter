package com.sixteen11.ui;

import android.view.View;

public abstract class HolderArrayAdapterItem<T> {
    abstract protected T newViewHolder();
    abstract protected void initViewHolder(View view, Object holder);
    abstract public void updateViewHolder(Object holder);
}
