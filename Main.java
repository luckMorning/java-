package test1;
import java.util.*;

public class Main {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Student[] stus = new Student[100];
		
		System.out.println ("����ѧ�����ݸ���:");
		int count = in.nextInt();
		for (int i =0; i < count; i++) {
			String name;
			double score = 0;
			stus[i] = new Student();
			System.out.println("����");
			name = in.next();
			stus[i].setName(name);
			System.out.println("����");
			score = in.nextDouble();
			stus[i].setScore(score);
		}
		in.close();
		
		Student.printMost(stus, count);
		Student.outNameByScore(stus,count,1);
	}
}
