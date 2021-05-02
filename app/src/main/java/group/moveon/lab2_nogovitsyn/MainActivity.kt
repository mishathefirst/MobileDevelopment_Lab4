package group.moveon.lab2_nogovitsyn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import group.moveon.lab2_nogovitsyn.data.DataStorage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val android = DataStorage.getVersionsList()
        val adapter = AndroidAdapter(this, android)

        val list = findViewById<RecyclerView>(R.id.androidList)
        list.adapter = adapter

        val decoration = DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL)
        decoration.setDrawable(ContextCompat.getDrawable(this, R.color.grey)!!)
        list.addItemDecoration(decoration)
    }
}