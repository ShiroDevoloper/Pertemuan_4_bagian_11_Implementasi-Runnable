package com.android.pertemuan_4_bagian_10_implementasirunnable

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startThread(view: View):Unit{
        val runnable = ExampleRunnable(10);
        Thread(runnable).start()
    }
}