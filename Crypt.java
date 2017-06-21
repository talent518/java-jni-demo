public abstract class Crypt {
	static {
		System.loadLibrary("crypt");
	}

	/**
	 * 加密
	 * 
	 * @param str
	 *            要加密的明文
	 * @param key
	 *            密钥
	 * @param expires
	 *            过期秒数
	 * @return
	 */
	public native static String encode(String str, String key, int expires);

	/**
	 * @param enc
	 *            由encode加密的密文
	 * @param key
	 *            密钥
	 * @param expires
	 *            过期秒数
	 * @return
	 */
	public native static String decode(String enc, String key, int expires);

	public static void main(String[] args) {
		String str = "中华人民共和国-086-上海";
		String key = "123";
		String enc = encode(str, key, 0);
		String dec = decode(enc, key, 0);

		System.out.println("str = " + str);
		System.out.println("key = " + key);
		System.out.println("enc = " + enc);
		System.out.println("dec = " + dec);
	}
}
