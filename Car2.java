abstract class Viecle {
	private int num;
	private double gas;

	public void set(int n, double gas){
	
	num=n;
	gas=gas;
	System.out.println("乗り物を設定しました。")
	}



}


class Cars{
	private int num;
	private double gas;

	public Cars(){    //インスタンス（初期化している。）
	num=0;
	gas=0.0;
	System.out.println("車を作成しました。");
	}
//以下は関数の列挙している。
	public void setCar(int n,double g){
	num=n;
	gas=g;
	System.out.println("車を作成しました。ナンバーは"+n+",ガスは"+g+"です。");
	}
	public void show(){
	System.out.println("車のナンバー："+num);
	System.out.println("ガソリン量："+gas);
	}
}

	
class Car2{
	public static void main(String[] args){
	Cars car=new Cars();
	car.setCar(10,20.0);
	car.show();
	}
}
