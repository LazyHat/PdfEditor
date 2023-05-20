package com.lazyhat.pdfeditor

import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.lazyhat.pdfeditor.ui.theme.PDFEditorTheme

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get: Rule
    val rule = createComposeRule()

    @Before
    fun setUp(){
        rule.setContent {
            PDFEditorTheme {
                PdfList()
            }
        }
    }

    @Test
    fun backgroundImageTest(){
        rule.onNodeWithTag("img").assertDoesNotExist()
    }

    @Test
    fun button_test(){
        rule.onNodeWithText("Выбрать файл").assertExists()
        rule.onNodeWithTag("button").assertHasClickAction()
    }

    @Test
    fun click_test(){
        rule.onNodeWithTag("button").performClick()
    }
}