
public class BasicTypeAndStringTransfer {
	public static void main(String args[]){
		/**
		 *���У���������ת��Ϊ�ַ��������ַ�����
		 *1. ʹ�ð�װ��� toString() ����
         *2. ʹ��String��� valueOf() ����
         *3. ��һ�����ַ������ϻ������ͣ��õ��ľ��ǻ����������ݶ�Ӧ���ַ���
		 */
		//����������ת��Ϊ�ַ���
		int c = 10;
		String str1 = Integer.toString(c);//����һ
		String str2 = String.valueOf(c);//������
		String str3 = c + "";//������
		System.out.println("str1: " + str1 + "\nstr2: " + str2 + "\nstr3: " + str3);
		
		/**
		 *�����������ַ���ת���ɻ������������ַ�����
         *1. ���ð�װ��� parseXxx ��̬����
         *2. ���ð�װ��� valueOf() ����ת��Ϊ�������͵İ�װ�࣬���Զ����� 
		 */
		//���ַ���תΪ��������
		String str = "8";
		int d = Integer.parseInt(str);//����һ
		int e = Integer.valueOf(str);//������
		System.out.println("d: " + d + "\ne: " + e);
	}
}
