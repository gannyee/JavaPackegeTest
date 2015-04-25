import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateAndSimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();//ʹ��Ĭ�ϵĹ��췽������Date����
		System.out.println(d);//���Date����
		
		//����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//����format()��������ʽ��ʱ�䣬ת��Ϊָ����ʱ���ʽ
		String today = sdf.format(d);
		//���ת�����ʱ��
		System.out.println(today);
		
		//ʹ��parse()�������ı�ת��Ϊ����
		//�������ڸ�ʽ���ַ���
		String day = "2014��02��14�� 10:30:25";
		//����SimpleDateFormate����ָ���ַ��������ڸ�ʽ
		SimpleDateFormat df = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		//����parse()���������ַ���ת��Ϊ����
		Date dates = df.parse(day);
		//���ת�����ʱ��
		System.out.println("ת�����ʱ�䣺" + dates);
		
		
		
		
		
		//��ϰ��ش���
		
		// ʹ��format()����������ת��Ϊָ����ʽ���ı�
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		// ����Date���󣬱�ʾ��ǰʱ��
        Date now = new Date();
        
        // ����format()������������ת��Ϊ�ַ��������
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));

		// ʹ��parse()�������ı�ת��Ϊ����
		String d1 = "2014-6-1 21:05:36";
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
         // ����parse()���������ַ���ת��Ϊ����
		Date date = sdfTime.parse(d1);
        
		System.out.println(date);
	}

}
