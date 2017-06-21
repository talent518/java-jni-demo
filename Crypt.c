#include <lib-crypt.h>
#include <malloc.h>
#include <string.h>
#include <jni.h>

/*
 * Class:     Crypt
 * Method:    encode
 * Signature: (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_Crypt_encode(JNIEnv *env, jclass thiz, jstring str, jstring key, jint expires) {
	char *enc = crypt_encode((*env)->GetStringUTFChars(env, str, JNI_FALSE), (*env)->GetStringUTFLength(env, str), (*env)->GetStringUTFChars(env, key, JNI_FALSE), expires);
	return (*env)->NewStringUTF(env, enc);
}

/*
 * Class:     Crypt
 * Method:    decode
 * Signature: (Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_Crypt_decode(JNIEnv *env, jclass thiz, jstring enc, jstring key, jint expires) {
	char *dec = NULL;
	int len = crypt_decode((*env)->GetStringUTFChars(env, enc, JNI_FALSE), &dec, (*env)->GetStringUTFChars(env, key, JNI_FALSE), expires);

	if (dec && len <= 0) {
		free(dec);
	}

	return (*env)->NewStringUTF(env, len > 0 ? dec : 0);
}
