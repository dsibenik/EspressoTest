package com.dsibenik.espressotest;


import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

import com.dsibenik.espressotest.ActivityMain;
import com.dsibenik.espressotest.R;
import com.google.android.apps.common.testing.ui.espresso.ViewInteraction;
import com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions;

/**
* <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
*/
public class ApplicationTest extends android.test.ActivityInstrumentationTestCase2
{

    public ApplicationTest()
    {
        super(ActivityMain.class);
    }
    // The standard JUnit 3 setUp method run for for every test
    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        getActivity(); // prevent error "No activities found. Did you forget to launch the activity by calling getActivity()"
    }

    //It uses JUnit 3 so remember to prefix your test methods
    //with the word "test"
    public void testButton1Clicked_Always_Hide11HelloWorldText()
    {
        // Find
        ViewInteraction button1 = onView(withId(R.id.donotpress)); // Find the button
        ViewInteraction helloWorldText = onView(withText("You'veee pressed it!!")); // Find the text


        // Action
        button1.perform(click()); // Click the button
        try {
            Thread.sleep(300,300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        helloWorldText.check(ViewAssertions.matches((isDisplayed()))); // Hello world text is hidden

    }
    public void testButton1Clicked_Always_HideHelloWorldText2()
    {


        ViewInteraction button1 = onView(withId(R.id.donotpress)); // Find the button
        button1.perform(click()); // Click the button
        button1.perform(click()); // Click the button
        ViewInteraction helloWorldText = onView(withText("Hello world!")); // Find the text
        helloWorldText.check(ViewAssertions.matches((isDisplayed()))); // Hello world text is hidden
    }
}