package work1;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

import static org.testng.AssertJUnit.assertNotNull;

public class MethodInterception {

    @Test
    public void annotationValue() {
        MainPage mainPage = createPage(MainPage.class);
        assertNotNull(mainPage);
        AssertJUnit.assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        AssertJUnit.assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

    private MainPage createPage(Class clazz) {
        return (MainPage) Proxy.newProxyInstance(SomeInvocationHandler.class.getClassLoader(), new Class[] { clazz },
                new SomeInvocationHandler());
    }
}