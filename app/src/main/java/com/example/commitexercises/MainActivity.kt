package com.example.commitexercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       btCircle.setOnClickListener {
           tvInputParam.text = "enter the radius of the circle"

           try {
               radiusSideLength.afterTextChanged {
               var res = radiusSideLength.getText().toString()
               var radius = res.toDouble()
               var result = radius * radius * 3.14
               finalResult.setText("required area of circle is: ${result.toString()}")
                   (it) }
           } catch (e: Exception) {
               Log.d("MyLog", "message: ${e.message}")
           }

       }


        btSquare.setOnClickListener{
            tvInputParam.text ="enter the side of the square"
            try {
                radiusSideLength.afterTextChanged {
                    var res = radiusSideLength.getText().toString()
                    var side = res.toDouble()
                    var result = side * side
                    finalResult.setText("required area of square is: ${result.toString()}")
                    (it) }
            } catch (e: Exception) {
                Log.d("MyLog", "message: ${e.message}")
            }
        }

      btRectangle.setOnClickListener{tvInputParam.text ="enter the length and width of the rectangle"
            try {
                radiusSideLength.afterTextChanged {
                    var res1 = radiusSideLength.getText().toString()
                    var lenght = res1.toDouble()
                    width.afterTextChanged {
                        var res2 = width.getText().toString()
                        var wIdth = res2.toDouble()

                        var result = lenght * wIdth
                        finalResult.setText("required area of rectangle is: ${result.toString()}")
                        (it)
                    }
                }
            }catch (e: Exception) {
                Log.d("MyLog", "message: ${e.message}")
            }



          }
      }




    fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
        this.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(editable: Editable?) {
                afterTextChanged.invoke(editable.toString())
            }
        })
    }

        }








