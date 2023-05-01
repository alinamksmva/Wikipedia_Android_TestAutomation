package org.wikipedia.screens

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matcher
import org.wikipedia.R

class SettingsPage {
    private val exploreFeedMatcher = withText(R.string.preference_title_customize_explore_feed)
    private val aboutTheAppMatcher = withText(R.string.about_description)
    private val privacyPolicyMatcher = withText(R.string.privacy_policy_description)
    private val settingsScreenMatcher = withId(R.id.fragment_container)

    private fun clickOn(matcher : Matcher<View>)
    {
        onView(matcher)
                .perform(click())
    }

    fun clickExploreFeed()
    {
        clickOn(exploreFeedMatcher)
    }

    fun clickAboutTheApp()
    {
        clickOn(aboutTheAppMatcher)
    }

    fun clickPrivacyPolicy()
    {
        clickOn(privacyPolicyMatcher)
    }

    fun swipeUpScreen()
    {
        onView(settingsScreenMatcher)
                .perform(ViewActions.swipeUp())
    }
}