package com.example.uts_210441100154_mohnauvalzabidi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: AdapterFootball
    lateinit var listData: ArrayList<DataFootball>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(DataFootball("Kevin De Bruyne", "180441100007", "31 Tahun", R.drawable.screenshot_1))
        listData.add(DataFootball("Sergio Kun Aguer", "160441100043", "34 tahun", R.drawable.screenshot_6))
        listData.add(DataFootball("Alvaro Negredo", "150441100044", "20 tahun", R.drawable.screenshot_2))
        listData.add(DataFootball("Lionel Messi", "150441100010", "34 tahun", R.drawable.screenshot_12))
        listData.add(DataFootball("Mario Gomez", "130441100010", "20 tahun", R.drawable.screenshot_7))
        listData.add(DataFootball("Erling Haaland", "210441100067", "22 tahun", R.drawable.screenshot_13))
        listData.add(DataFootball("Yaya Toure", "180441100043", "33 tahun", R.drawable.screenshot_8))
        listData.add(DataFootball("Ruben Diaz", "200441100014", "24 tahun", R.drawable.screenshot_9))
        listData.add(DataFootball("Cristiano Ronaldo", "140441100007", "20 tahun", R.drawable.screenshot_3))
        listData.add(DataFootball("Kai Havertz", "210441100019", "24 tahun", R.drawable.screenshot_11))
        listData.add(DataFootball("Neymar da Silva", "220441100118", "26 tahun", R.drawable.screenshot_10))
        listData.add(DataFootball("Zlatan Ibrahimovic", "140441100030", "26 tahun", R.drawable.screenshot_14))
        listData.add(DataFootball("Eden Hazard", "160441100120", "23 tahun", R.drawable.screenshot_15))
        listData.add(DataFootball("Sergio Ramos", "2040441100011", "27 tahun", R.drawable.screenshot_16))
        listData.add(DataFootball("Robert Lewandowski", "2040441100192", "24 tahun", R.drawable.screenshot_18))
        listData.add(DataFootball("Harry Kane", "2040441100023", "32 tahun", R.drawable.screenshot_17))
        listData.add(DataFootball("Marco Verratt", "2040441100181", "25 tahun", R.drawable.screenshot_19))
        listData.add(DataFootball("Paulo Dybala", "2040441100002", "31 tahun", R.drawable.screenshot_20))
        listData.add(DataFootball("Manuel Neuer", "2040441100013", "20 tahun", R.drawable.screenshot_21))
        listData.add(DataFootball("Virgil van Dijk", "2040441100801", "30 tahun", R.drawable.screenshot_22))
        listData.add(DataFootball("Kylian Mbappe", "2040441100801", "30 tahun", R.drawable.screenshot_23))
        listData.add(DataFootball("Joao Felix", "2040441100121", "19 tahun", R.drawable.screenshot_24))
        listData.add(DataFootball("Antoine Griezmann", "2040441100213", "33 tahun", R.drawable.screenshot_25))
        listData.add(DataFootball("philippe coutinho", "2040441100053", "24 tahun", R.drawable.screenshot_26))

        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = AdapterFootball(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = AdapterFootball(listData, this)
        recycle.adapter = recycleAdapter
    }
}