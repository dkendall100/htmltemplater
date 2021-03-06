package com.dustinkendall.templating

import android.os.SystemClock
import java.util.*
import kotlin.properties.Delegates

/**
 * Created by Dustin Kendall on 10/21/20.
 */

class Invoice(number: Int = 1234, date: Date = Date(System.currentTimeMillis())){
    var number : Int = number
    var date : Date = date

    init {
        this.number = number
        this.date = date
    }
}