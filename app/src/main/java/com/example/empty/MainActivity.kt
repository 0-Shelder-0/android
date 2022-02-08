package com.example.empty

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        val student = Student("Vasya", 2)
        view.text = student.toString()
    }
}

data class Student(
    val name: String,
    val course: Int) {
    override fun toString(): String {
        return "Student(name='$name', course=$course)"
    }
}