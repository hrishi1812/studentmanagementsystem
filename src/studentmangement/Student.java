package studentmangement;

import java.util.Comparator;

public class Student {
    
    int id;
    String name;
    String branch;
    long phone;
    int yop;
    double per;
	public Student(int id,String name, String branch, long phone, int yop, double per) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.phone = phone;
		this.yop = yop;
		this.per = per;
	}
	
	public String toString() {
    return (this.id+" "+ this.name+" "+this.branch+" "+this.phone+" "+this.yop+" "+this.per);
}
}
class SortByYOP implements Comparator<Student>
{
	public int compare(Student s1,Student s2) {
		return s1.yop-s2.yop;
	}
}
class SortByper implements Comparator<Student>
{
	public int compare(Student s1,Student s2) {
		return (int)(s1.per-s2.per);
	}
}
