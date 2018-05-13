package com.mobile.android.scrollshottester;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void openConstraintLayout(View view) {
    Intent i = new Intent();
    i.setClass(getApplicationContext(), ConstraintLayoutActivity.class);
    startActivity(i);
  }

  public void openListView(View view) {
    Intent i = new Intent();
    i.setClass(getApplicationContext(), ListViewActivity.class);
    startActivity(i);
  }

  public void openRCView(View view) {
    Intent i = new Intent();
    i.setClass(getApplicationContext(), RCViewActivity.class);
    startActivity(i);
  }
}
