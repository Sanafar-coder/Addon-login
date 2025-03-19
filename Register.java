package day3.com;
import java.util.Scanner;
import java.util.Date;

public class Register {
	public static void main (String arg[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Username : ");
		String username = in.nextLine();
		System.out.println("Enter your Password : ");
		String password = in.nextLine();
		System.out.println("Enter your Email : ");
		String email = in.nextLine();
		System.out.println("Enter your Address :");
		String address =in.next();
		System.out.println("Enter your Mobile Number : ");
		long phoneno = in.nextLong();
		in.nextLine();
		Date createdAt=new Date();
		Date updatedAt=new Date();
		boolean isActive = true;
		
		
 EncapsulationClass person1 = new  EncapsulationClass();
 
 person1.setUsername(username);
 person1.setPassword(password);
 person1.setEmail(email);
 person1.setPhoneno(phoneno);
 person1.setAddress(address);
 person1.setcreatedAt(createdAt);
 person1.setupdatedAt(updatedAt);
 person1.setisActive(isActive);
 
 System.out.println(person1.getUsername());
 System.out.println(person1.getPassword());
 System.out.println(person1.getEmail());
 System.out.println(person1.getPhoneno());
 System.out.println(person1.getAddress());
 System.out.println(person1.getcreatedAt());
 System.out.println(person1.getupdatedAt());
 System.out.println(person1.getisActive());
 
 
	in.close();
	
	}
}
