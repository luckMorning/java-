package test1;

public class Student {
	private String name;
	private double score;
	
	public void setName (String _name) 
	{
		if (_name.length() == 0){
			System.out.println("�����˿�����");
		}
		this.name = _name;
	}
	public void setScore (double _score)
	{
		if (_score < 0) {
			System.out.println("�����˲��Ϸ��ķ���");
		}
		this.score = _score;
	}
	
	
}
