import java.lang.reflect.Method;

public class TestRunner {

    public void runTests(Class<?> inclass) {
        Method[] methods = inclass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                try {
                    if (test.enabled()) {
                    System.out.println(test.name());
                    method.invoke(inclass.newInstance());
                    }
                } catch (Exception e) {
                    
                }
            }
        }
    }
    
}

