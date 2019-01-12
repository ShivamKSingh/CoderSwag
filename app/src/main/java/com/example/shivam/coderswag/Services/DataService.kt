package com.example.shivam.coderswag.Services

import com.example.shivam.coderswag.Model.Category
import com.example.shivam.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Shivslopes Graphic Beanie", "$18", "hat1"),
        Product("Shivslopes Hat Black", "$20", "hat2"),
        Product("Shivslopes Hat White", "$18", "hat3"),
        Product("Shivslopes Hat Snapback", "$22", "hat4"),
        Product("Shivslopes Graphic Beanie", "$18", "hat1"),
        Product("Shivslopes Hat Black", "$20", "hat2"),
        Product("Shivslopes Hat White", "$18", "hat3"),
        Product("Shivslopes Hat Snapback", "$22", "hat4"),
        Product("Shivslopes Graphic Beanie", "$18", "hat1"),
        Product("Shivslopes Hat Black", "$20", "hat2"),
        Product("Shivslopes Hat White", "$18", "hat3"),
        Product("Shivslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Shivslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Shivslopes Hoodie Red", "$32", "hoodie2"),
        Product("Shivslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Shivslopes Black Hoodie", "$32", "hoodie4"),
        Product("Shivslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Shivslopes Hoodie Red", "$32", "hoodie2"),
        Product("Shivslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Shivslopes Black Hoodie", "$32", "hoodie4"),
        Product("Shivslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Shivslopes Hoodie Red", "$32", "hoodie2"),
        Product("Shivslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Shivslopes Black Hoodie", "$32", "hoodie4")

    )

    val shirt = listOf(
        Product("Shivslopes Shirt Black", "$18", "shirt1"),
        Product("Shivslopes Badge Light Gray", "$20", "shirt2"),
        Product("Shivslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Shivslopes Hustle", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Shivslopes Shirt Black", "$18", "shirt1"),
        Product("Shivslopes Badge Light Gray", "$20", "shirt2"),
        Product("Shivslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Shivslopes Hustle", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Shivslopes Shirt Black", "$18", "shirt1"),
        Product("Shivslopes Badge Light Gray", "$20", "shirt2"),
        Product("Shivslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Shivslopes Hustle", "$18", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>
    {
       return when(category)
        {
            "SHIRTS" -> shirt
            "HATS"-> hats
            "HOODIES"-> hoodies
            else -> digitalGood
        }
    }



}