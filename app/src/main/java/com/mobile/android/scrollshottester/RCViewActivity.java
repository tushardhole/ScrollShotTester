package com.mobile.android.scrollshottester;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RCViewActivity extends Activity {

  RecyclerView recyclerView;
  TextView textView;
  String[] listItem;
  private static RecyclerView.Adapter adapter;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_rc_view);

    recyclerView = (RecyclerView) findViewById(R.id.rcview);
    textView = (TextView) findViewById(R.id.textView);
    listItem = getResources().getStringArray(R.array.array_languages);

    adapter = new RecyclerView.Adapter() {
      @Override
      public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.my_list, parent, false);
        return new RecyclerView.ViewHolder(view) {
          @Override
          public String toString() {
            return super.toString();
          }
        };
      }

      @Override
      public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((TextView) holder.itemView.findViewById(R.id.textView)).setText(listItem[position]);
      }

      @Override
      public int getItemCount() {
        return listItem.length;
      }
    };

    LinearLayoutManager layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(adapter);
    adapter.notifyDataSetChanged();
  }
}
