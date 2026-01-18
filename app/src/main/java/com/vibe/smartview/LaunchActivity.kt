package com.vibe.smartview

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle

class LaunchActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        launchSmartView()
        finish()
    }

    private fun launchSmartView() {
        try {
            val intent = Intent()
            intent.component = ComponentName(
                "com.samsung.android.smartmirroring",
                "com.samsung.android.smartmirroring.CastingDialog"
            )
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
