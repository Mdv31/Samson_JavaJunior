package work2;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationInterceptor implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

        TestMethodInfo anot = testMethod.getAnnotation(TestMethodInfo.class);

        System.out.println(anot.priority() + " " + anot.author() + " " + anot.lastModified());
    }


}