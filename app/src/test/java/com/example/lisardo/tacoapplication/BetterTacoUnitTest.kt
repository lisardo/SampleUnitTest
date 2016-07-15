import android.app.Activity
import android.content.Context
import org.hamcrest.MatcherAssert.assertThat
/**/import org.hamcrest.CoreMatchers.*
import org.mockito.Mockito.*

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner

import android.content.SharedPreferences
import android.text.format.DateUtils
import com.example.lisardo.tacoapplication.R
import com.example.lisardo.tacoapplication.TacoText
import org.junit.Assert.*
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class BetterTacoUnitTest {

    @Mock
    internal var mockContext: Context? = null

    @Test
    fun readStringFromContext_LocalizedString() {
        `when`(mockContext!!.getString(R.string.hello_world)).thenReturn(FAKE_STRING)
        val myObjectUnderTest = TacoText(mockContext!!)
        val result = myObjectUnderTest.getText()
        assertEquals(result, FAKE_STRING)
//        assertThat(result, `is`(FAKE_STRING))
    }

    @Test
    @Throws(Exception::class)
    fun today_isCorrect() {
        val date = Date()
        val tacoDay = DateUtils.isToday(date.time)
        assertTrue(tacoDay)
    }

    companion object {
        private val FAKE_STRING = "HELLO WORLD"
    }
}