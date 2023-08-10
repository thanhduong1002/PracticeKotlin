package com.example.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.adapter.MainCategoryAdapter
import com.example.recipeapp.adapter.SubCategoryAdapter
import com.example.recipeapp.entities.Recipes

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipes>()
    var arrSubCategory = ArrayList<Recipes>()

    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        arrMainCategory.add(Recipes(1, "Leo", R.drawable.real_madrid_2_3_barcelona_2017))
        arrMainCategory.add(Recipes(2, "Lionel", R.drawable.leo_messi))
        arrMainCategory.add(Recipes(3, "Lionel Adres", R.drawable.messi_ucl))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipes(1, "Leo Messi", R.drawable.messi))
        arrSubCategory.add(Recipes(2, "Lionel Messi", R.drawable.pin_on_barca))
        arrSubCategory.add(Recipes(3, "Lionel Adres Messi", R.drawable.wallpaper_lionel_messi))

        subCategoryAdapter.setData(arrSubCategory)

        val recyclerMain = findViewById<RecyclerView>(R.id.rv_main_category)
        recyclerMain.adapter = mainCategoryAdapter
        recyclerMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val recyclerSub = findViewById<RecyclerView>(R.id.rv_sub_category)
        recyclerSub.adapter = subCategoryAdapter
        recyclerSub.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


    }
}