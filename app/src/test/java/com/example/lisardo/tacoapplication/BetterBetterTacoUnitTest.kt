package com.example.lisardo.tacoapplication

import android.app.Activity
import android.text.format.DateUtils
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.util.*

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class BetterBetterTacoUnitTest {

    @Test
    fun today_isCorrect() {
        val activity = Robolectric.setupActivity(TacoActivity::class.java)
        val text = TacoText(activity.baseContext).getText()
        assertEquals(text, FAKE_STRING)
    }

    companion object {
        private val FAKE_STRING = "Hello World"
    }

}