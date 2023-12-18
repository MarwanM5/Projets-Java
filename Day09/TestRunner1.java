import java.lang.reflect.Method;

public class TestRunner1 {
public static void runTests(Class<?> testClass) {
    try {
        Object testObject = testClass.newInstance();
        // Get the methods annotated with @BeforeClass and execute them
        Method[] beforeClassMethods = testClass.getMethods();
        for (Method method : beforeClassMethods) {
            if (method.isAnnotationPresent(BeforeClass.class)) {
                method.invoke(testObject);
            }
        }

        // Get the test methods and execute them
        Method[] testMethods = testClass.getMethods();
        for (Method method : testMethods) {
            if (method.isAnnotationPresent(Test.class)) {
                // Execute the method annotated with @Before (if it exists)
                Method beforeMethod = getBeforeMethod(testClass);
                if (beforeMethod != null) {
                    beforeMethod.invoke(testClass.newInstance());
                }

                // Execute the test method
                method.invoke(testClass.newInstance());

                // Execute the method annotated with @After (if it exists)
                Method afterMethod = getAfterMethod(testClass);
                if (afterMethod != null) {
                    afterMethod.invoke(testClass.newInstance());
                }
            }
        }

        // Get the methods annotated with @AfterClass and execute them
        Method[] afterClassMethods = testClass.getMethods();
        for (Method method : afterClassMethods) {
            if (method.isAnnotationPresent(AfterClass.class)) {
                method.invoke(null);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private static Method getBeforeMethod(Class<?> testClass) {
    Method[] methods = testClass.getMethods();
    for (Method method : methods) {
        if (method.isAnnotationPresent(Before.class)) {
            return method;
        }
    }
    return null;
}

private static Method getAfterMethod(Class<?> testClass) {
    Method[] methods = testClass.getMethods();
    for (Method method : methods) {
        if (method.isAnnotationPresent(After.class)) {
            return method;
        }
    }
    return null;
}
}
