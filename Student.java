package test1;

public class Student {
	private String name;
	private double score;
	static double low;
	static double hight;
	static int count = 0;
	static Student[] stus = new Student[10];
	static {
		for (int i = 0; i < 10 ; ++ i)
		{
			stus[i] = new Student();
		}
	}
	
	public String  getNameByScore (double socre)
	{
		for 
	}
	static void printMost(Student[] stus, int count)
	{
		low = hight = stus[0].score;
		for (int i = 0; i < count; ++ i) {
			if (stus[i].getScore() > hight) {
				hight = stus[i].getScore();
			}
			
			if (stus[i].getScore() < low) {
				low = stus[i].getScore();
			}
		}
		System.out.println("最高分：");
		for (int i = 0; i < count ; ++ i)
		{
			
			if (stus[i].getScore() == hight)
			{
				System.out.println(stus[i].getScore() + " " + stus[i].getName());
			}
		}
		
		System.out.println("最低分：");
		for (int i = 0; i < count ; ++ i)
		{
			
			if (stus[i].getScore() == hight)
			{
				System.out.println(stus[i].getScore() + " " + stus[i].getName());
			}
		}
	}
	public void setName (String _name) 
	{
		if (_name.length() == 0){
			System.out.println("输入了空名字");
		}
		this.name = _name;
	}
	public double getScore()
	{
		return this.score;
	}
	public String getName ()
	{
		return this.name;
	}
	public void setScore (double _score)
	{
		if (_score < 0) {
			System.out.println("输入了不合法的分数");
		}
		this.score = _score;
	}
	
	
}
