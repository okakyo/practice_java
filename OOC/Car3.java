

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


class Racingcar extends Cars{
	private int course;
	public void  RacingCar(){
	course=0;
	System.out.println("���[�V���O�J�[���쐬���܂����B");
	
	}
	public void setCourse(int c){
		course=c;
		System.out.println("�R�[�X�ԍ���"+course+"�ɂ��܂����B");

	}
}


class Car3{
	public static void main(String[] args){
	Racingcar car=new Racingcar();
	car.setCourse(10);
	}
}
