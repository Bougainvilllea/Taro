package com.example.taro

import com.google.gson.annotations.SerializedName

data class Taro(
    @SerializedName("card")
    val card: taroCard

)

data class taroCard(
    @SerializedName("name")
    val name: String,
    @SerializedName("meaning_up")
    val meaningUp: String,
    @SerializedName("desc")
    val desс: String

)
