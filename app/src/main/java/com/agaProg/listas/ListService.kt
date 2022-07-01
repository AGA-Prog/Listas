package com.agaProg.listas

import android.content.Context
import android.util.Log
import java.io.File

class ListService(context: Context) {

    val context = context
    val filename = "lists.txt"
    val file = File(context.filesDir, filename)
    var list = mutableListOf<String>()

    //Obtener datos del fichero local lists.txt
    fun getListFromFile():MutableList<String> {
        if (!file.exists()) {
            file.createNewFile()
        }

        list = file.readLines() as MutableList<String>
        return list
    }

    fun addItemToList(item: String) {
        list.add(item)
        file. printWriter().use {
            out -> list.forEach {
                out.println(it)
            }
        }
    }
}