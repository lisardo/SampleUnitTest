package com.example.lisardo.tacoapplication

import android.app.Activity
import android.support.design.widget.FloatingActionButton
import android.text.format.DateUtils
import android.widget.TextView
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
    fun readStringFromContext_LocalizedString() {
        val activity = Robolectric.setupActivity(TacoActivity::class.java)
        val text = TacoText(activity.baseContext).getTacoText()
        assertEquals(text, FAKE_STRING)
    }

    @Test
    fun clickingButton_shouldChangeResultsViewText() {
        val activity = Robolectric.setupActivity(TacoActivity::class.java)

        val button = activity.findViewById(R.id.fab) as FloatingActionButton
        val textView = activity.findViewById(R.id.contentTextView) as TextView
        assertEquals(textView.getText().toString(), FAKE_STRING_BEFORE_CLICK)
        button.performClick()
        assertEquals(textView.getText().toString(), FAKE_STRING)
    }

    companion object {
        private val FAKE_STRING = "Taco"
        private val FAKE_STRING_BEFORE_CLICK = "Not taco"
    }

}