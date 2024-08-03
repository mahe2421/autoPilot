package com.automation.utils.listeners;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author Maheswara
 * @created on 28/06/21
 */
public class RetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        Class<? extends IRetryAnalyzer> retryAnalyzerClass = annotation.getRetryAnalyzerClass();

        if (retryAnalyzerClass == null) {
            annotation.setRetryAnalyzer(Retry.class);
        }
    }
}
