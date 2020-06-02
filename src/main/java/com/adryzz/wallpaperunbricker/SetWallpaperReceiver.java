package com.adryzz.wallpaperunbricker;

import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.io.IOException;

public class SetWallpaperReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        try {
            WallpaperManager.getInstance(context).setResource(R.raw.wallpaper);
        }
        catch (IOException e) {
            //Do nothing
        }
    }
}
