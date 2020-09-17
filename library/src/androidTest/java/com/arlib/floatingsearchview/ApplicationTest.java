package com.arlib.floatingsearchview;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
    @Test
    public void useAppContext() {
        Context c = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Assert.assertEquals(c.getPackageName(), "com.arlib.floatingsearchview");
    }
}
