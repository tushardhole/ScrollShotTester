package com.mobile.android.scrollshottester;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ConstraintLayoutActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_constraint);
  }

  public void showDialog(View view) {
    new AlertDialog.Builder(this)
        .setTitle("This is dialog test")
        .setPositiveButton("Ok", null)
        .show();
  }
}
