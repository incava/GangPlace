package com.incava.gangplace.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.incava.gangplace.R
import com.incava.gangplace.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
        initNavigation()
    }
    private fun initNavigation() {
            // NavController 획득
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
            val navController = navHostFragment.findNavController()
            binding.bottomNav.setupWithNavController(navController)
        }
    private fun initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
    }

}