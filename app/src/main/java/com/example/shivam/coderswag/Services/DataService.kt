package com.example.shivam.coderswag.Services

import com.example.shivam.coderswag.Model.Category
import com.example.shivam.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )

    val hats = listOf(
        Product("Shivslopes Graphic Beanie", "$18", "hat01"),
        Product("Shivslopes Hat Black", "$20", "hat02"),
        Product("Shivslopes Hat White", "$18", "hat03"),
        Product("Shivslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Shivslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Shivslopes Hoodie Red", "$32", "hoodie02"),
        Product("Shivslopes Gray Hoodie", "$28", "hoodie03"),
        Product("Shivslopes Black Hoodie", "$32", "hoodie04")

    )

    val shirt = listOf(
        Product("Shivslopes Shirt Black", "$18", "shirt01"),
        Product("Shivslopes Badge Light Gray", "$20", "shirt02"),
        Product("Shivslopes Logo Shirt Red", "$22", "shirt03"),
        Product("Shivslopes Hustle", "$18", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )



}