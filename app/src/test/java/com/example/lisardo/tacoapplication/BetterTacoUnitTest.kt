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
import com.example.lisardo.tacoapplication.TacoActivity
import com.example.lisardo.tacoapplication.TacoText
import org.junit.Assert.*
import java.util.*

@RunWith(MockitoJUnitRunner::class)
class BetterTacoUnitTest {

    @Mock
    internal var mockContext: Context? = null

    @Mock
    internal var activity: TacoActivity? = null

    @Test
    fun readStringFromContext_LocalizedString() {
        `when`(mockContext!!.getString(R.string.taco)).thenReturn(FAKE_STRING)
        `when`(activity!!.baseContext).thenReturn(mockContext)
        val result = activity!!.baseContext.getString(R.string.taco)
        assertEquals(result, FAKE_STRING)
    }

    companion object {
        private val FAKE_STRING = "Taco"
    }
}