import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateAndSimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();//使用默认的构造方法创建Date对象
		System.out.println(d);//输出Date对象
		
		//创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//调用format()函数，格式化时间，转换为指定的时间格式
		String today = sdf.format(d);
		//输出转换后的时间
		System.out.println(today);
		
		//使用parse()方法将文本转换为日期
		//创建日期格式的字符串
		String day = "2014年02月14日 10:30:25";
		//创建SimpleDateFormate对象，指定字符串的日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//调用parse()方法，将字符串转换为日期
		Date dates = df.parse(day);
		//输出转换后的时间
		System.out.println("转换后的时间：" + dates);
		
		
		
		
		
		//练习相关代码
		
		// 使用format()方法将日期转换为指定格式的文本
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
		// 创建Date对象，表示当前时间
        Date now = new Date();
        
        // 调用format()方法，将日期转换为字符串并输出
		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
		System.out.println(sdf3.format(now));

		// 使用parse()方法将文本转换为日期
		String d1 = "2014-6-1 21:05:36";
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
         // 调用parse()方法，将字符串转换为日期
		Date date = sdfTime.parse(d1);
        
		System.out.println(date);
	}

}
