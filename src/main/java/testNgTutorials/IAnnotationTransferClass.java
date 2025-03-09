package testNgTutorials;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class IAnnotationTransferClass implements IAnnotationTransformer {
    @Override
   public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(IRetryAnalyzerClass.class);
    }

}
