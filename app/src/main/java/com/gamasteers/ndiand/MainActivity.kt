package com.gamasteers.ndiand

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(12, 16, 23))
            setPadding(40, 30, 40, 30)
        }
        fun line(message: String, size: Float, color: Int) {
            root.addView(TextView(this).apply {
                text = message
                textSize = size
                setTextColor(color)
                gravity = Gravity.CENTER
                setPadding(0, 12, 0, 12)
            })
        }
        line("NDIand Monitor", 30f, Color.WHITE)
        line("Versão 0.1 • Base Android", 18f, Color.LTGRAY)
        line("Receptores NDI e OMT ainda não integrados.\nEste APK valida somente instalação e execução no aparelho.", 16f, Color.rgb(255, 190, 90))
        setContentView(root)
    }
}
