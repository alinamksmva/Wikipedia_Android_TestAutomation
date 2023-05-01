package org.wikipedia.screens

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.wikipedia.R
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.hamcrest.Matcher

class AboutTheAppPage {

    private val authorsMatcher = withText(R.string.about_contributors_heading)
    private val translatorsMatcher = withText(R.string.about_translators_heading)
    private val licenseMatcher = withText(R.string.about_app_license_heading)

    private fun isDisplayedBlock(blockMatcher : Matcher<View>)
    {
        onView(blockMatcher)
                .check(matches(isDisplayed()))
    }

    fun checkAuthors()
    {
        isDisplayedBlock(authorsMatcher)
    }

    fun checkTranslators()
    {
        isDisplayedBlock(translatorsMatcher)
    }

    fun checkLicense()
    {
        isDisplayedBlock(licenseMatcher)
    }
}