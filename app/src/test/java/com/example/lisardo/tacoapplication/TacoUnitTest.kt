package com.example.lisardo.tacoapplication

import android.app.Activity
import android.text.TextUtils
import android.text.format.DateUtils
import org.junit.Test
import java.util.Date
import org.junit.Assert.*
import org.mockito.Mockito

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
open class TacoUnitTest {

    @Test
    fun readStringFromContext_LocalizedString() {
        val activity = TacoActivity()
        val text = activity.baseContext.getString(R.string.taco)
        assertEquals(text, FAKE_STRING)
    }

    @Test(expected = ArithmeticException::class)
    fun divideByZero_arithmeticException() {
        1/0
    }

    companion object {
        private val FAKE_STRING = "Taco"
    }

}/**/