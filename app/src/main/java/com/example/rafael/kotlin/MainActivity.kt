package com.example.rafael.kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    var itn = Intent(this@MainActivity, SecondActivity::class.java)
    public override fun onCreate(b: Bundle?) {
        super.onCreate(b)
        setContentView(R.layout.activity_main)
        xbn.setOnClickListener {
            b?.putString("X2", xet.text.toString())
            itn.putExtra("X2", xet.text.toString())
            b?.putString("X", xet2.text.toString())
            itn.putExtra("X", xet2.text.toString())
            b?.putString("C", xet3.text.toString())
            itn.putExtra("C", xet3.text.toString())
            startActivity(itn)
        }
    }
}
