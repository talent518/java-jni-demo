public abstract class Crypt {
	static {
		System.loadLibrary("crypt");
	}

	/**
	 * ����
	 * 
	 * @param str
	 *            Ҫ���ܵ�����
	 * @param key
	 *            ��Կ
	 * @param expires
	 *            ��������
	 * @return
	 */
	public native static String encode(String str, String key, int expires);

	/**
	 * @param enc
	 *            ��encode���ܵ�����
	 * @param key
	 *            ��Կ
	 * @param expires
	 *            ��������
	 * @return
	 */
	public native static String decode(String enc, String key, int expires);

	public static void main(String[] args) {
		String str = "�л����񹲺͹�-086-�Ϻ�";
		String key = "123";
		String enc = encode(str, key, 0);
		String dec = decode(enc, key, 0);

		System.out.println("str = " + str);
		System.out.println("key = " + key);
		System.out.println("enc = " + enc);
		System.out.println("dec = " + dec);
	}
}
