package io.github.bbang208.cleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import io.github.bbang208.cleanarchitecture.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewBinding.lifecycleOwner = this

    }
}