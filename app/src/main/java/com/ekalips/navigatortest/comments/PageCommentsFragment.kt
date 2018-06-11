package com.ekalips.navigatortest.comments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ekalips.navigatortest.R
import com.ekalips.navigatortest.data.MockData
import kotlinx.android.synthetic.main.fragment_page_comments.view.*


class PageCommentsFragment : Fragment() {

    private lateinit var rootView: ViewGroup
    private var page: Pair<String, String>? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_page_comments, container, false) as ViewGroup
        initPageData(arguments ?: savedInstanceState)
        return rootView
    }

    private fun initPageData(bundle: Bundle?) {
        bundle?.let {
            page = MockData.pageWithTitle(PageCommentsFragmentArgs.fromBundle(it).title)
        }

        rootView.commentsTv.text = "Comments for ${page?.first}"
    }


}
