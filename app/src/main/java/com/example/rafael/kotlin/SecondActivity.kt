package com.example.rafael.kotlin

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : Activity() {
    var r1:Double? = null
    var r2:Double? = null
    public override fun onCreate(b: Bundle?) {
        //var b: Bundle? = b
        super.onCreate(b)
        setContentView(R.layout.activity_second)
        //b = intent.extras
        if (b == null) {
            return
        }
        var aux: String? = b.getString("X2")
        val a: Double = java.lang.Double.valueOf(aux)
        aux = b.getString("X")
        val b2: Double = java.lang.Double.valueOf(aux)
        aux = b.getString("C")
        val c: Double = java.lang.Double.valueOf(aux)
        var im: Double = b2 * b2 - 4.0 * a * c
        if (im >= 0) {
            r1 = (-1 * b2 + Math.sqrt(im)) / (2 * a)
            r2 = (-1 * b2 - Math.sqrt(im)) / (2 * a)
            xet1.append("Las raíces de (" + b.getString("X2") + ")X^2+(" + b.getString("X") + ")X+(" + b.getString("C") + ") son:\nr1 = " + r1 + "\nr2 = " + r2)
        } else {
            im = Math.abs(im)
            im = Math.sqrt(im) / (2 * a)
            r1 = -1 * b2 / (2 * a)
            r2 = -1 * b2 / (2 * a)
            xet1.append("Las raíces de (" + b.getString("X2") + ")X^2+(" + b.getString("X") + ")X+(" + b.getString("C") + ") son:\nr1 = " + r1 + "+" + im + "i\nr2 = " + r2 + "-" + im + "i")
        }
    }
}
