package com.jubee.study;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Hello from Yuliya!");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Good-bye from Yuliya!");
    }
}
