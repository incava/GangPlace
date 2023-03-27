package com.incava.gangplace.view

import androidx.navigation.fragment.findNavController
import com.incava.gangplace.R
import com.incava.gangplace.base.BaseFragment
import com.incava.gangplace.databinding.FragmentGangChuBinding


class GangChuFragment : BaseFragment<FragmentGangChuBinding>(R.layout.fragment_gang_chu) {
    override fun init() {
        binding.toolbar.setOnMenuItemClickListener{item->
            when(item.itemId){
                R.id.search->
                    findNavController().navigate(R.id.action_gangChuFragment_to_searchFragment)
                else -> {
                    TODO("맵 fragment로 이동")
                }
            }
            //다 했다고 알림.
            true
        }
    }



}