#ifndef _CRYPT_H
#define _CRYPT_H

#include "lib-md5.h"
#include <string.h>

unsigned int crypt_code(const char *str, unsigned int strlen, char **ret, const char *key, bool mode, unsigned int expiry);

__inline char *crypt_encode(const char *str, unsigned int strlen, const char *key, unsigned int expiry) {
	char *enc = 0;

	crypt_code(str, strlen, &enc, key, false, expiry);

	return enc;
}

__inline unsigned int crypt_decode(const char *dec, char **data, const char *key, unsigned int expiry) {
	return crypt_code(dec, strlen(dec), data, key, true, expiry);
}

#endif
