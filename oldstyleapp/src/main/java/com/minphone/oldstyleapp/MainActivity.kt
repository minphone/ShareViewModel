package com.minphone.oldstyleapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(
            R.id.container, OneFragment.getInstance(
                object : OneFragment.OnFragmentOneClickListener {
                    override fun onClick(msg: String) {
                        tvshareViewModel.text = msg
                    }

                })
        ).commit()

        ivLeft.setOnClickListener {
            changeFragment()
            if (count > 1) {
                count--
            }
        }

        ivRight.setOnClickListener {
            changeFragment()
            if (count < 3) {
                count++
            }
        }

        Toast.makeText(this, count.toString(), Toast.LENGTH_SHORT).show()
    }

    private fun changeFragment() {
        when (count) {
            1 -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container, OneFragment.getInstance(
                        object : OneFragment.OnFragmentOneClickListener {
                            override fun onClick(msg: String) {
                                tvshareViewModel.text = msg
                            }

                        })
                ).commit()
            }
            2 -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container, TwoFragment.getInstance(
                        object : TwoFragment.OnFragmentOneClickListener {
                            override fun onClick(msg: String) {
                                tvshareViewModel.text = msg
                            }

                        })
                ).commit()
            }
            3 -> {
                supportFragmentManager.beginTransaction().replace(
                    R.id.container, ThreeFragment.getInstance(
                        object : ThreeFragment.OnFragmentOneClickListener {
                            override fun onClick(msg: String) {
                                tvshareViewModel.text = msg
                            }

                        })
                ).commit()
            }
        }
    }
}
