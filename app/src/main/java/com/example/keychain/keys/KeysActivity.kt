package com.example.keychain.keys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.keychain.R

class KeysActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keys)

        val arrayAdapter: ArrayAdapter<*>
        val names = arrayOf(
            "dfgsdfaaew", "dfgsdfaaew", "dfgsdfaaew", "dfgsdfaaew",
            "dfgsdfaaew", "dfgsdfaaew","asdfsdf"
        )
        //
        var mListView = findViewById<ListView>(R.id.keysList)
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_expandable_list_item_1
            , names)
        mListView.adapter = arrayAdapter
    }
}