package com.ekalips.navigatortest.stuff

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

class BindingViewHolder<ViewBinding : ViewDataBinding>(val binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    constructor(@LayoutRes layoutRes: Int, parent: ViewGroup) : this(DataBindingUtil.inflate(LayoutInflater.from(parent.context), layoutRes, parent, false))

}