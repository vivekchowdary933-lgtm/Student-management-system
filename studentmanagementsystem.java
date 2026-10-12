package sampleproject;
import java.util.*;
class Student3{
	private int id;
	private String name;
	private int marks;
	private String course;
	Student3(int id,String name,int marks,String course){
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	void setid(int id) {
		this.id = id;
	}
	int getid() {
		return id;
	}
	void setname(String name) {
		this.name = name;
	}
	String getname() {
		return name;
	}
	void setmarks(int marks) {
		this.marks = marks;
	}
	int getmarks() {
		return marks;
	}
	void setcourse(String course) {
		this.course = course;
	}
	String getcourse() {
		return course;
	}
	void displaydetails() {
		System.out.println("Student id is : "+ id);
		System.out.println("Student name is : " + name);
		System.out.println("Student marks is : " + marks);
		System.out.println("Student course name is : " + course);

	}
}
public class studentmanagementsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer , Student3> students = new LinkedHashMap<>();
		HashSet<String> courses = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
		    System.out.println("========== STUDENT MANAGEMENT ==========");
		    System.out.println("1. Add Student");
		    System.out.println("2. Display All Students");
		    System.out.println("3. Search Student");
		    System.out.println("4. Update Student");
		    System.out.println("5. Remove Student");
		    System.out.println("6. Show Course List");
		    System.out.println("7. Exit");
		    System.out.println("=========================================");
		    System.out.println("Enter your choice");
		    int choice = sc.nextInt();
		    sc.nextLine();
		    switch(choice) {
		    case 1:
		    	System.out.println("Enter student id");
		    	int id = sc.nextInt();
		    	sc.nextLine();
		    	System.out.println("Enter student name");
				String name = sc.nextLine(); 
				System.out.println("Enter student marks");
				int marks = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student course");
				String course = sc.nextLine();
				if(students.containsKey(id)) {
					System.out.println("ID already exists");
				}else {
					students.put(id, new  Student3(id,name,marks,course));
					courses.add(course);
				}
		    	break;
		    case 2:
		    	for(Map.Entry<Integer , Student3> entry: students.entrySet())
		    		entry.getValue().displaydetails();
		    	break;
		    case 3:
		    	System.out.println("Search id is : ");
		    	int searchid = sc.nextInt();
		    	sc.nextLine();
		    	Student3 student = students.get(searchid);
		    	if(student != null) {
		    		student.displaydetails();
		    	}else {
		    		System.out.println("ID does not exist");
		    	}
		    	break;
		    case 4:
		    	System.out.println("Enter student id to update");
		    	int updatedid = sc.nextInt();
		    	sc.nextLine();
		    	
		    	Student3 s1 = students.get(updatedid);
		    	if(s1 != null) {
		    		System.out.println("Enter new name");
		    		String newname = sc.nextLine();
		    		s1.setname(newname);
		    		System.out.println("enter new marks");
		    		int newmarks = sc.nextInt();
		    		sc.nextLine();
		    		s1.setmarks(newmarks);
		    	}else {
		    		System.out.println("ID doesn't exist");
		    	}
		    	
		    	break;
		    case 5:
		    	System.out.println("Enter your id to remove");
		    	int removeid = sc.nextInt();
		    	sc.nextLine();
//		    	Student3 s2 = students.get(removeid);
		    	if(students.containsKey(removeid)) {
		    		students.remove(removeid);
		    	}else {
		    		System.out.println("ID Doest not exists");
		    	}
		    	break;
		    case 6:
		    	for(String entry : courses) {
		    		System.out.println(entry);
		    	}
		    	break;
		    case 7:
		    	System.out.println("Exiting....");
		    	return;
		    }
		    
		}

	}

}
