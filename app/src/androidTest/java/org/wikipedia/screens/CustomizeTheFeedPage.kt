package org.wikipedia.screens

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.withChild
import org.wikipedia.R
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matcher

class CustomizeTheFeedPage {
    private val featuredArticleCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
            hasSibling(withChild(withText(R.string.view_featured_article_card_title))))
    private val topReadCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.feed_item_type_trending))))
    private val pictureOfTheDayCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.feed_item_type_featured_image))))
    private val becauseYouReadCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.feed_item_type_because_you_read))))
    private val inTheNewsCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.view_card_news_title))))
    private val onThisDayCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.feed_item_type_on_this_day))))
    private val randomizerCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.view_random_card_title))))
    private val todayOnWikipediaCheckBoxMatcher = allOf(withId(R.id.feed_content_type_checkbox),
                hasSibling(withChild(withText(R.string.view_main_page_card_title))))

    private fun isCheckedCheckBox(checkBoxMatcher : Matcher<View>)
    {
        onView(checkBoxMatcher).check(matches(isChecked()))
    }

    fun checkFeaturedArticleCheckBox()
    {
        isCheckedCheckBox(featuredArticleCheckBoxMatcher)
    }

    fun checkTopReadCheckBox()
    {
        isCheckedCheckBox(topReadCheckBoxMatcher)
    }

    fun checkPictureOfTheDayCheckBox()
    {
        isCheckedCheckBox(pictureOfTheDayCheckBoxMatcher)
    }

    fun checkBecauseYouReadCheckBox()
    {
        isCheckedCheckBox(becauseYouReadCheckBoxMatcher)
    }

    fun checkInTheNewsCheckBox()
    {
        isCheckedCheckBox(inTheNewsCheckBoxMatcher)
    }

    fun checkOnThisDayCheckBox()
    {
        isCheckedCheckBox(onThisDayCheckBoxMatcher)
    }

    fun checkRandomizerCheckBox()
    {
        isCheckedCheckBox(randomizerCheckBoxMatcher)
    }

    fun checkTodayOnWikipediaCheckBox()
    {
        isCheckedCheckBox(todayOnWikipediaCheckBoxMatcher)
    }

    fun swipeUpScreen()
    {
        onView(withId(R.id.fragment_container)).perform(swipeUp())
    }
}