package com.example.demo_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mViewModel: NameLViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProviders.of(this).get(NameLViewModel::class.java)

        val nameDataObserver = Observer<String> {

            name.text = it
        }


        mViewModel.currentName.observe(this, nameDataObserver)

        namechange.setOnClickListener {

            mViewModel.currentName.value = "Amrut"
        }
    }
}
