package com.ekalips.navigatortest.stuff

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("android:onClick")
fun setOnClickRunnable(view: View, onClick: Runnable?) {
    onClick?.let { view.setOnClickListener { onClick.run() } }
            ?: view.setOnClickListener(null)
}