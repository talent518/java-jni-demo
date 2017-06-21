public class JNIDemo {
	// 定义一个本地方法
	public native String sayHello();

	public static void main(String[] args) {
		// 调用动态链接库
		System.loadLibrary("JNIDemo");
		
		JNIDemo jniDemo = new JNIDemo();
		
		System.out.println(jniDemo.sayHello());
	}
}