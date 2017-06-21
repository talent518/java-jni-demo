@echo off

cl /I "%JAVA_HOME%\include" /I "%JAVA_HOME%\include\win32" JNIDemo.cpp /LD

javac JNIDemo.java
java JNIDemo
