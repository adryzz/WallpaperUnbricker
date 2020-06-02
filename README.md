# WallpaperUnbricker
Unbricks the device when it is bricked by the RGB wallpaper bug
(Note: This only works when debug USB is enabled and the PC you are using is trusted by the device)

Note: this method only works on Android > 5.1
# How to unbrick your device
1. Install ADB on your PC. (There are tons of guides on how to do it on the internet)
2. Download the APK file from HERE
3. Install the apk using this command: `adb install <path-of-the-apk-file>` Note: <path-of-the-apk-file> needs to be replaced with the path of the apk file
4. Set the new wallpaper using this command: `adb shell am broadcast -a com.adryzz.wallpaperunbricker.SET_WALLPAPER -n com.adryzz.wallpaperunbricker/.SetWallpaperReceiver`
Now it should have unbricked the device!
