/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.epam.apiproject;

import com.epam.coreproject.CoreUtils;

public class App {

    public static void main(String[] args) {
        System.out.println(CoreUtils.isAllPositive(args));
        System.out.println(CoreUtils.checkAllPositive(args));
    }
}