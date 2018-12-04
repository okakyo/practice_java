

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


class Racingcar extends Cars{
	private int course;
	public void  RacingCar(){
	course=0;
	System.out.println("レーシングカーを作成しました。");
	
	}
	public void setCourse(int c){
		course=c;
		System.out.println("コース番号を"+course+"にしました。");

	}
}


class Car3{
	public static void main(String[] args){
	Racingcar car=new Racingcar();
	car.setCourse(10);
	}
}
