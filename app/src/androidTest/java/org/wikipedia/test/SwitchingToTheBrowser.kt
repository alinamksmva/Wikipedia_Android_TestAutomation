package org.wikipedia.test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.wikipedia.main.MainActivity
import org.wikipedia.screens.FirstOnboardPage
import org.wikipedia.screens.MainPage
import org.wikipedia.screens.SettingsPage

@RunWith(AndroidJUnit4::class)
class SwitchingToTheBrowser {
    @Rule
    @JvmField
    var mActivityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun switchingToTheBrowserTest() {

        val firstScreen = FirstOnboardPage()
        val mainScreen = MainPage()
        val settingsScreen = SettingsPage()

        firstScreen.clickOnboardSkipButton()

        with(mainScreen)
        {
            clickNavigationMoreButton()
            clickSettings()
        }

        with(settingsScreen)
        {
            swipeUpScreen()
            clickPrivacyPolicy()
        }
    }

}