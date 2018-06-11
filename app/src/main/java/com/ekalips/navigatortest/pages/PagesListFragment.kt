package com.ekalips.navigatortest.pages


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.ekalips.navigatortest.R
import com.ekalips.navigatortest.data.MockData
import kotlinx.android.synthetic.main.fragment_pages_list.view.*


class PagesListFragment : Fragment() {

    private lateinit var adapter: PagesRecyclerViewAdapter
    private lateinit var rootView: ViewGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = PagesRecyclerViewAdapter({
            findNavController(this).navigate(PagesListFragmentDirections.viewPage(it.first))
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_pages_list, container, false) as ViewGroup
        rootView.pagesRv.adapter = adapter
        fillData()
        return rootView
    }

    private fun fillData() {
        adapter.submitList(MockData.pages)
    }


}
