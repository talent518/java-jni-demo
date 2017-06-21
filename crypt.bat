@echo off

cl /I . /I "%JAVA_HOME%\include" /I "%JAVA_HOME%\include\win32" Crypt.c lib-md5.c lib-base64.c lib-crypt.c /LD

javac Crypt.java
java Crypt