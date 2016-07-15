package com.example.lisardo.tacoapplication

import android.content.Context

class TacoText(val context: Context) {

    fun getTacoText() = context.getString(R.string.taco)

}