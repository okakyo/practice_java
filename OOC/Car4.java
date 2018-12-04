class Cars{
	private int num;
	private double gas;

	public Cars(){    //インスタンス（初期化している。）
	num=0;
	gas=0.0;
	System.out.println("車を作成しました。");}

	public Cars(int n, double g){    //インスタンス（初期化している。）
	num=n;
	gas=g;
	System.out.println("ナンバー"+num+"、ガス"+gas+"の車を作成しました。");}

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

	public Racingcar(){
	course=0;
	System.out.println("レーシングカーを作成しました。");	
	}

	public Racingcar(int n,double g,int c){
	super(n,g);
	course=c;
	System.out.println("コース番号"+course+"のレーシングカーを作成しました。");
	
	}
	public void setCourse(int c){
		course=c;
		System.out.println("コース番号を"+course+"にしました。");

	}
}


class Car4{
	public static void main(String[] args){
	Racingcar car=new Racingcar(100,20.5,5);
	}
}
