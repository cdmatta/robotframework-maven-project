package com.charandeepmatta.keywords;

import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SampleKeywords {
    @RobotKeyword
    public void printToErrorStream() {
        System.err.println("!!! Hello from keyword developed in java ...");
    }
}
