package com.agaProg.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.jocnunez.listas.R
import java.util.*

class ListActivity : AppCompatActivity() {
    var list: MutableList<String> = mutableListOf()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        Log.d("Debug","Open List Activity")

        val newItem = findViewById<Button>(R.id.newButton)
        newItem.setOnClickListener {
            addNewItem()
        }
    }
    private fun addNewItem {
        val randomText: String = Date().toString()
        list.add(randomText)

        val textView.text = TextView(this)
        textView.text = randomText

        val listLayout = findViewById<>()
    }
}