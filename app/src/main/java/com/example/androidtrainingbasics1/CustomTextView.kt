package com.example.androidtrainingbasics1

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.TextView

class CustomTextView(val mContext : Context): androidx.appcompat.widget.AppCompatTextView(mContext){
    init {
        accessibilityDelegate = object : View.AccessibilityDelegate() {
            override fun onInitializeAccessibilityNodeInfo(host: View?, info: AccessibilityNodeInfo?) {
                super.onInitializeAccessibilityNodeInfo(host, info)

                info?.addAction(AccessibilityNodeInfo.AccessibilityAction(R.id.myCustomAccessibilityEvent, "myCustomAction"));
            }
        }
    }

    override fun performAccessibilityAction(action: Int, arguments: Bundle?): Boolean {
        if (action == R.id.myCustomAccessibilityEvent)
            return true

        return false
    }

}