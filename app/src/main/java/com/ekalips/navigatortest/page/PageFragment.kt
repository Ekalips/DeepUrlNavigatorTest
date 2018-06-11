package com.ekalips.navigatortest.page


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.ekalips.navigatortest.R
import com.ekalips.navigatortest.data.MockData
import kotlinx.android.synthetic.main.fragment_page.view.*


class PageFragment : Fragment() {

    private lateinit var rootView: ViewGroup
    private var page: Pair<String, String>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_page, container, false) as ViewGroup
        initPageData(arguments ?: savedInstanceState)
        rootView.descTv.text = page?.second
        rootView.commentsBtn.setOnClickListener { findNavController(this).navigate(PageFragmentDirections.viewPageComments(page?.first)) }
        return rootView
    }

    private fun initPageData(args: Bundle?) {
        args?.let {
            page = MockData.pageWithTitle(PageFragmentArgs.fromBundle(args).title)
        }
    }
}
