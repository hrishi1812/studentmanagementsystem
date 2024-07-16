package studentmangement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
	static int id=1;
	static List<Student> list=new ArrayList<Student>();
    public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome");
		outerloop:
		for(;;) {
			System.out.println("1.Add Student");
			System.out.println("2.Show Student List");
			System.out.println("3.Remove Student");
			System.out.println("4.Exit");
			System.out.print("Enter the option :");
			int option=scanner.nextInt();
			switch(option) {
			case 1:{
				System.out.print("Name :");
				String name=scanner.next();
				System.out.print("Branch :");
				String branch=scanner.next();
				System.out.print("Phone :");
				long phone=scanner.nextLong();
				System.out.print("perencetage :");
				double per=scanner.nextDouble();
				System.out.print("YOP :");
				int yop=scanner.nextInt();
				Student student=new Student(id,name, branch, phone, yop, per);
				list.add(student);
				id++;
				break;
			}
			case 2:{
				System.out.println("Student List");
				for(Student student:list) {
					System.out.println(student);
				}
				System.out.println();
				System.out.println("1.Sort by yop");
				System.out.println("2.Sort by per");
				System.out.println("3.exit");
				System.out.print("Enter the option : ");
				int option1=scanner.nextInt();
				switch(option1) {
				case 1:{
					list.sort(new SortByYOP());
					for(Student student:list) {
						System.out.println(student);
					}
					break;
				}
				case 2:{
					list.sort(new SortByper());
					for(Student student:list) {
						System.out.println(student);
					}
					break;
					
				}
				case 3:{
					continue outerloop;
				}
				default :{
					System.out.println("Wrong Option");
				}
				}
				break;
			}
			case 3:{
				Iterator<Student> iterator=list.iterator();
				System.out.println("Enter the Id of Student which you want to remove");
				int id=scanner.nextInt();
				while (iterator.hasNext()) {
					Student student = (Student) iterator.next();
					if(student.id==id) {
						iterator.remove();
					}else {
						System.out.println("Enter id is Incoorrect`");
					}
					
				}
				break;
			}
			case 4:{
				System.exit(0);
			}
			default:{
				System.out.println("Wrong Option");
			}
			}
		}
	}
}
