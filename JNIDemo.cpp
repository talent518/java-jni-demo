#include "JNIDemo.h"
#include <iostream>

JNIEXPORT jstring JNICALL Java_JNIDemo_sayHello(JNIEnv *env, jobject thiz) {
	return env->NewStringUTF("Hello World");
}
