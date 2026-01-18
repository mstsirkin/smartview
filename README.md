# Smart View Launcher

A minimal Android app that provides quick access to Samsung Smart View (screen mirroring).

## Features

- **Home screen shortcut** - One tap to open the Smart View device picker
- **Quick Settings tile** - Add to your notification panel for fast access

## Why?

Samsung removed the Smart View Quick Settings tile on some devices/regions, making it tedious to access through Settings. This app brings back quick access.

## Building

```bash
./gradlew assembleDebug
```

APK will be at `app/build/outputs/apk/debug/app-debug.apk`

## Installation

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

Or transfer the APK to your phone and install manually.

## Adding the Quick Settings Tile

1. Swipe down twice for Quick Settings
2. Tap the pencil/edit icon
3. Find "Smart View" in available tiles
4. Drag it to your active tiles

## Requirements

- Samsung phone with Smart View installed
- Android 7.0+ (API 24)

## License

MIT
