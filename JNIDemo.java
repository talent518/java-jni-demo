public class JNIDemo {
	// ����һ�����ط���
	public native String sayHello();

	public static void main(String[] args) {
		// ���ö�̬���ӿ�
		System.loadLibrary("JNIDemo");
		
		JNIDemo jniDemo = new JNIDemo();
		
		System.out.println(jniDemo.sayHello());
	}
}