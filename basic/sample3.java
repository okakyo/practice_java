import java.io.*;
class sample3{

	public static void main(String[] arg) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String req=  br.readLine();
		switch(req){
		case "1":{System.out.println(req+"は大吉です。");}
		case "2":{System.out.println(req+"は吉です。");}
		case "3":{System.out.println(req+"は小吉です。");}
		case "4":{System.out.println(req+"は大凶です。");}
		case "5":{System.out.println(req+"は凶です。");}
		default:System.out.println(req+"は大凶です。");
		}	
	}
}
