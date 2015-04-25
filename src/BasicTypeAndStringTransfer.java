
public class BasicTypeAndStringTransfer {
	public static void main(String args[]){
		/**
		 *其中，基本类型转换为字符串有三种方法：
		 *1. 使用包装类的 toString() 方法
         *2. 使用String类的 valueOf() 方法
         *3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串
		 */
		//将基本类型转换为字符串
		int c = 10;
		String str1 = Integer.toString(c);//方法一
		String str2 = String.valueOf(c);//方法二
		String str3 = c + "";//方法三
		System.out.println("str1: " + str1 + "\nstr2: " + str2 + "\nstr3: " + str3);
		
		/**
		 *再来看，将字符串转换成基本类型有两种方法：
         *1. 调用包装类的 parseXxx 静态方法
         *2. 调用包装类的 valueOf() 方法转换为基本类型的包装类，会自动拆箱 
		 */
		//将字符串转为基本类型
		String str = "8";
		int d = Integer.parseInt(str);//方法一
		int e = Integer.valueOf(str);//方法二
		System.out.println("d: " + d + "\ne: " + e);
	}
}
