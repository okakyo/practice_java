abstract class Viecle {
	private int num;
	private double gas;

	public void set(int n, double gas){
	
	num=n;
	gas=gas;
	System.out.println("��蕨��ݒ肵�܂����B")
	}



}


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
	System.out.println("�Ԃ��쐬���܂����B�i���o�[��"+n+",�K�X��"+g+"�ł��B");
	}
	public void show(){
	System.out.println("�Ԃ̃i���o�[�F"+num);
	System.out.println("�K�\�����ʁF"+gas);
	}
}

	
class Car2{
	public static void main(String[] args){
	Cars car=new Cars();
	car.setCar(10,20.0);
	car.show();
	}
}
