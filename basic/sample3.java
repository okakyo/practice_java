import java.io.*;
class sample3{

	public static void main(String[] arg) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String req=  br.readLine();
		switch(req){
		case "1":{System.out.println(req+"�͑�g�ł��B");}
		case "2":{System.out.println(req+"�͋g�ł��B");}
		case "3":{System.out.println(req+"�͏��g�ł��B");}
		case "4":{System.out.println(req+"�͑勥�ł��B");}
		case "5":{System.out.println(req+"�͋��ł��B");}
		default:System.out.println(req+"�͑勥�ł��B");
		}	
	}
}