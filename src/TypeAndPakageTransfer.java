public class TypeAndPakageTransfer {
    public static void main(String[] args) {
        
        // ����double���ͱ���
		double a = 91.5;
        
         // �ֶ�װ��
		Double b = new Double(a);       
        
        // �Զ�װ��
		Double c = a;      

        System.out.println("װ���Ľ��Ϊ��" + b + "��" + c);
        
        // ����һ��Double��װ�����ֵΪ8
		Double d = new Double(87.0);
        
        // �ֶ�����
		double e = d.doubleValue() ;
        
        // �Զ�����
		double f = d;     
        
         System.out.println("�����Ľ��Ϊ��" + e + "��" + f);
	}
}
