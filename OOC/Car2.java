
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
	System.out.println("ナンバーは"+n+",ガスは"+g+"です。");
	}
	public void show(){
	System.out.println("車のナンバー："+num);
	System.out.println("ガソリン量："+gas);
	}
}

	
class Car2{
	public static void main(String[] args){
	Cars[] cars;
	cars=new Cars[3];
	for(int i=0;i<3;i++)
		cars[i]=new Cars();
	cars[0].setCar(10,20.0);
	cars[1].setCar(20,30.0);
	cars[2].setCar(40,10.0);
	for(int j=0;j<3;j++)
		cars[j].show();
	}
}
