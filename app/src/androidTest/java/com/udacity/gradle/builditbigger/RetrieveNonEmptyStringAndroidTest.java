 package com.udacity.gradle.builditbigger;

 import static android.support.test.espresso.Espresso.onView;
 import static android.support.test.espresso.action.ViewActions.click;
 import static android.support.test.espresso.assertion.ViewAssertions.matches;
 import static android.support.test.espresso.matcher.ViewMatchers.withId;
 import static android.support.test.espresso.matcher.ViewMatchers.withText;
 import static org.hamcrest.CoreMatchers.not;

 import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class RetrieveNonEmptyStringAndroidTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    private IdlingResource mIdlingResource;

    @Before
    public void registerIdlingResource() {
        mIdlingResource = mActivityRule.getActivity().getIdlingResource();
        // To prove that the test fails, omit this call:
        Espresso.registerIdlingResources(mIdlingResource);
    }

    @Test
    public void testVerifyNonEmptyStringFromEndpoint() {
        onView(withId(R.id.buttonJoke)).perform(click());
        onView(withId(R.id.textViewJoke)).check(matches(not(withText(""))));
    }

    @After
    public void unregisterIdlingResource() {
        if (mIdlingResource != null) {
            Espresso.unregisterIdlingResources(mIdlingResource);
        }
    }

}
