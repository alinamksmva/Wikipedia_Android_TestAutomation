package org.wikipedia.test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity
import org.wikipedia.screens.CreateAnAccountPage
import org.wikipedia.screens.FirstOnboardPage
import org.wikipedia.screens.MainPage

@RunWith(AndroidJUnit4::class)
class HidingThePasswordWithAnEye {
    @Rule
    @JvmField
    var mActivityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun hidingThePasswordWithAnEyeTest() {

        val firstScreen = FirstOnboardPage()
        val mainScreen = MainPage()
        val createAccountScreen = CreateAnAccountPage()

        firstScreen.clickOnboardSkipButton()

        with(mainScreen)
        {
            clickNavigationMoreButton()
            clickLogin()
        }

        with(createAccountScreen)
        {
            clickLoginPassword()
            inputLoginPassword("alina_30")
            clickEye()
            checkPassword("alina_30")
            clickEye()
        }
    }
}