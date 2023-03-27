package com.incava.gangplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
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