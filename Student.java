package test1;

public class Student {
	private String name;
	private double score;
	
	public void setName (String _name) 
	{
		if (_name.length() == 0){
			System.out.println("输入了空名字");
		}
		this.name = _name;
	}
	public void setScore (double _score)
	{
		if (_score < 0) {
			System.out.println("输入了不合法的分数");
		}
		this.score = _score;
	}
	
	
}
