package com.mobile.android.scrollshottester;

import android.app.Application;

import com.mobile.android.scrollshot.init.ScrollShot;


public class ScrollShotTesterApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    ScrollShot.init(this);
  }
}
