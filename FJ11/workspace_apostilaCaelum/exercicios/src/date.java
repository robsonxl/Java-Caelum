import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class date {
	
	public static void main (String[] args){
		
		System.out.println(compararDatas("05/07/06","05/07/07").toString());
	}

	public static Long compararDatas(String data1,String data2){  
		
		SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");  
		 Date d1 = null;   
		 Date d2 = null;   
		 try {   
		        d1 = df.parse (data1);  
		        d2 = df.parse (data2);  
		  } catch (java.text.ParseException evt ) {}  
		  
		  long dt = (d2.getTime() - d1.getTime()) + 3600000;        
		  long dias = (dt / 86400000L) + 1;  
		  
		  return dias;  
	} 

	public static long comapare(Date data1, Date data2){
	
		 GregorianCalendar ini = new GregorianCalendar();   
		 GregorianCalendar fim = new GregorianCalendar();   
		 long dt1 = ini.getTimeInMillis();   
		 long dt2 = fim.getTimeInMillis();   
		 System.out.println((dt2-dt1)/86400000); 
		 return (dt2-dt1)/86400000;
		}
}
