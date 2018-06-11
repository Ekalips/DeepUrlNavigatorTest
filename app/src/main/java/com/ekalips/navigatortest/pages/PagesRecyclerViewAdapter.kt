package com.ekalips.navigatortest.pages

import com.ekalips.navigatortest.R
import com.ekalips.navigatortest.databinding.RvItemPageBinding
import com.ekalips.navigatortest.stuff.BindingRecyclerViewAdapter
import com.ekalips.navigatortest.stuff.BindingViewHolder
import java.lang.ref.SoftReference

class PagesRecyclerViewAdapter(itemClickCallback: ((Pair<String, String>) -> Unit)? = null) : BindingRecyclerViewAdapter<RvItemPageBinding, Pair<String, String>>() {
    override val resId: Int = R.layout.rv_item_page

    private val callback = SoftReference(itemClickCallback)

    override fun onBindViewHolder(holder: BindingViewHolder<RvItemPageBinding>, position: Int) {
        with(getItem(holder.adapterPosition)) {
            holder.binding.title = first
            holder.binding.subtitle = second
            holder.binding.onClick = Runnable { callback.get()?.invoke(this) }
            holder.binding.executePendingBindings()
        }
    }
}