package com.incava.gangplace.view

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.widget.SearchView.OnQueryTextListener
import com.incava.gangplace.R
import com.incava.gangplace.base.BaseFragment
import com.incava.gangplace.databinding.FragmentSearchBinding


class SearchFragment : BaseFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    override fun init() {//todo
        binding.search.apply {
            requestFocus()
            val imm = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(this,0)
            setOnQueryTextListener(object : OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }
                override fun onQueryTextChange(newText: String?): Boolean {
                    return true
                }
            })
        }
    }
}