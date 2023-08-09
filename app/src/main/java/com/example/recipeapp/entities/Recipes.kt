package com.example.recipeapp.entities

import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Recipes")

data class Recipes(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name= "dishName")
    var dishName: String,

    @ColumnInfo(name= "imageRecipe")
    @DrawableRes val imageRecipe: Int,
) : Serializable
