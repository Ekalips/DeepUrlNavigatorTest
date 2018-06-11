package com.ekalips.navigatortest.stuff


import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BindingRecyclerViewAdapter<ViewBinding : ViewDataBinding, DataType> : ListAdapter<DataType, BindingViewHolder<ViewBinding>> {

    constructor() : super(DefaultDiffItemCallback<DataType>())
    constructor(comparator: DiffUtil.ItemCallback<DataType>) : super(comparator)
    constructor(asyncDifferConfig: AsyncDifferConfig<DataType>) : super(asyncDifferConfig)

    protected abstract val resId: Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder<ViewBinding> = BindingViewHolder(resId, parent)
}

class DefaultDiffItemCallback<DataType> : DiffUtil.ItemCallback<DataType>() {
    override fun areItemsTheSame(oldItem: DataType, newItem: DataType): Boolean = false
    override fun areContentsTheSame(oldItem: DataType, newItem: DataType): Boolean = false
}