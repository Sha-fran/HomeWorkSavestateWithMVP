package com.example.homeworksavestatewithmvp

import Presenter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), View {
    private lateinit var textView: TextView
    private val presenTer:Presenter = PresenterImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: FloatingActionButton = findViewById(R.id.fab)
        textView = findViewById(R.id.text_view)

        presenTer.setView(this)

        fab.setOnClickListener {
            presenTer.addNumberOfClicks()
        }
    }

    override fun updateNumberOfClicks(numberOfClicks: Int) {
        textView.text = numberOfClicks.toString()
    }
}
