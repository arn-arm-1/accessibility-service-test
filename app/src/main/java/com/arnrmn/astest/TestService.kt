package com.arnrmn.astest

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast

class TestService : AccessibilityService() {
    override fun onInterrupt() {
        //Do nothing
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        val source = event?.source?.className.toString()
        println(source)
        Toast.makeText(this, source, Toast.LENGTH_SHORT).show()
    }
}