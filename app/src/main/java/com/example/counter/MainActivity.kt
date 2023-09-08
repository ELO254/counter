package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        count()


    }

    private fun count() {
        var increase : Button = findViewById(R.id.btnadd)
        var decrease : Button = findViewById(R.id.btnsub)
        var output : TextView = findViewById(R.id.tvcounter)

        var i = 0

        increase.setOnClickListener {
            var count = i++
            output.text = count.toString()
            if (i>=20){
                var builder = AlertDialog.Builder(this)
                builder.setTitle("Alert")
                builder.setMessage("you have reached the maximum value")
                builder.setIcon(R.drawable.baseline_warning_24)
                builder.setNegativeButton("close"){
                    dialog,which -> dialog.cancel()
                }
                var alert = builder.create()
                alert.show()
                i = 0
            }
        }
        decrease.setOnClickListener {
            var count = i --
            output.text = count.toString()
            if (i > -20){
                var builder = AlertDialog.Builder(this)
                builder.setTitle("Alert")
                builder.setMessage("choose a higher value")
                builder.setIcon(R.drawable.baseline_warning_24)
                builder.setNegativeButton("close"){
                        dialog,which -> dialog.cancel()
                }
                var alert = builder.create()
                alert.show()
                i = 0
            }

        }

    }
}