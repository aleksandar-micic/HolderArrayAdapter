HolderArrayAdapter
==================

Android ArrayAdapter with ViewHolder pattern

Example
```Java
public class ListItem extends HolderArrayAdapterItem<ListItem.ViewHolder> {
    public class ViewHolder {
        public TextView exampleTextView;
    }

    private String mExampleText;

    public ListItem(String text) {
        mExampleText = text;
    }

    @Override
    public ViewHolder newViewHolder() {
        return new ViewHolder();
    }

    @Override
    public void initViewHolder(View view, Object holder) {
        ViewHolder h = (ViewHolder) holder;
        h.exampleTextView = (TextView) view.findViewById(R.id.example_text);
    }

    @Override
    public void updateViewHolder(Object holder) {
        ViewHolder h = (ViewHolder) holder;
        h.exampleTextView.setText(mExampleText);
    }
}
```
