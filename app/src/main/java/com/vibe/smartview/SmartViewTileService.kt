package com.vibe.smartview

import android.content.ComponentName
import android.content.Intent
import android.service.quicksettings.TileService

class SmartViewTileService : TileService() {

    override fun onClick() {
        super.onClick()

        val intent = Intent()
        intent.component = ComponentName(
            "com.samsung.android.smartmirroring",
            "com.samsung.android.smartmirroring.CastingDialog"
        )
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        try {
            startActivityAndCollapse(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
