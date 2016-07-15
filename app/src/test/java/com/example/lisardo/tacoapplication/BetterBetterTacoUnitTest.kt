package com.example.lisardo.tacoapplication

import android.text.format.DateUtils
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.util.*

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class BetterBetterTacoUnitTest {

    @Test
    fun today_isCorrect() {
        val date = Date()
        val tacoDay = DateUtils.isToday(date.time)
        assert(tacoDay)
    }

}