package com.example.lisardo.tacoapplication

import android.text.format.DateUtils
import org.junit.Test
import java.util.Date
import org.junit.Assert.*

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
open class TacoUnitTest {

    @Test
    @Throws(Exception::class)
    fun today_isCorrect() {
        val date = Date()
        val today = DateUtils.isToday(date.time)
        assert(today)
    }
}/**/