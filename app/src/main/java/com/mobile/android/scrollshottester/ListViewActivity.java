package com.mobile.android.scrollshottester;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends Activity {

  ListView listView;
  TextView textView;
  String[] listItem;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_view);

    listView = (ListView) findViewById(R.id.listView);
    textView = (TextView) findViewById(R.id.textView);
    listItem = getResources().getStringArray(R.array.array_languages);
    final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
        android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
    listView.setAdapter(adapter);
  }
}
