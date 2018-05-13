package com.mobile.android.scrollshottester;

import android.app.Application;

import com.mobile.android.scrollshot.ScrollShot;

public class ScrollShotTesterApplication extends Application {
  @Override
  public void onCreate() {
    super.onCreate();
    ScrollShot.start(this);
  }
}
