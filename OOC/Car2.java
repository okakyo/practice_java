
class Cars{
	private int num;
	private double gas;

	public Cars(){    //�C���X�^���X�i���������Ă���B�j
	num=0;
	gas=0.0;
	System.out.println("�Ԃ��쐬���܂����B");
	}
//�ȉ��͊֐��̗񋓂��Ă���B
	public void setCar(int n,double g){
	num=n;
	gas=g;
	System.out.println("�i���o�[��"+n+",�K�X��"+g+"�ł��B");
	}
	public void show(){
	System.out.println("�Ԃ̃i���o�[�F"+num);
	System.out.println("�K�\�����ʁF"+gas);
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