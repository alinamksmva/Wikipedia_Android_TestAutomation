package org.wikipedia.screens

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Matcher
import org.wikipedia.R

class MainPage {
    private val navigationMoreButtonMatcher = withId(R.id.nav_more_container)
    private val settingsMatcher = withId(R.id.main_drawer_settings_container)
    private val loginMatcher = withId(R.id.main_drawer_login_button)

    private fun clickOn(matcher : Matcher<View>)
    {
        onView(matcher)
                .perform(click())
    }

    fun clickNavigationMoreButton()
    {
        clickOn(navigationMoreButtonMatcher)
    }

    fun clickSettings()
    {
        clickOn(settingsMatcher)
    }

    fun clickLogin()
    {
        clickOn(loginMatcher)
    }
}