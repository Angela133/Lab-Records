import java.util.Scanner;
 class person {
    String Name;
    String Gender;
    String Address;
    int Age;
    person(String name,String gender,String address, int age) {
        this.Name = name;
        this.Gender = gender;
        this.Address = address;
        this.Age = age;
    }
}
//another class ‘Employee’ that inherits the properties of class Person and also contains its own data members
// like Empid, Company_name, Qualification, Salary and its own constructor.
class Employee extends person
{
 int Empid;
 String Company_name;
 String Qualification;
 long Salary;
 
 Employee(String name,String gender,String address, int age,int empid, String company_name, String qualification,long salary)
 {
     super(name,gender,address,age);
     this.Empid= empid;
     this.Company_name=company_name;
     this.Qualification=qualification;
     this.Salary=salary;
 }
}

 public class Teacher2 extends Employee{
     String Subject;
     String Department;
     String Teacherid;
    Teacher2(String name,String gender,String address, int age,int empid, String company_name, String qualification,long salary, String subject, String department, String teacherid){
        super(name,gender,address,age,empid,company_name,qualification,salary);
        this.Subject=subject;
        this.Department=department;
        this.Teacherid=teacherid;
    } 

    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Gender: "+Gender);
        System.out.println("Address: "+Address);
        System.out.println("Age: "+Age);
        System.out.println("Employee id: "+Empid);
        System.out.println("College Name: "+Company_name);
        System.out.println("Qualification: "+Qualification);
        System.out.println("Salary: "+Salary);
        System.out.println("Subject: "+Subject);
        System.out.println("Department: "+Department);
        System.out.println("Teacher id: "+Teacherid);

     }
     public static void main(String[] args) {
     
    System.out.print("\n Name : Angela Mathew \n Reg.No : SJC22MCA-2005 \n Course Code : 22MCA132 \n Course Name : OOPS LAB \n Date : 5 June 2023 \n ");
         System.out.print("\n----------------------------------------------------\n");
        System.out.println("\nEnter the No. of Teacher's");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Teacher2 arr[]=new Teacher2[num];
        System.out.println("\n Enter the Teacher Details\n");
        int x = 0,j=0;
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<num;i++)
        {
            x = i +1;
            System.out.println("\n"+x+").");
            System.out.println("\n Name: ");
            String a =sc.next();
            System.out.println("\n Gender: ");
            String b =sc.next();
            System.out.println("\n Address: ");
            String c =sc.next();
            System.out.println("\n Age: ");
            int d =sc.nextInt();
            System.out.println("\n Employee id: ");
            int e =sc.nextInt();
            System.out.println("\n College name: ");
            String f =sc.next();
            System.out.println("\n Qualification: ");
            String g =sc.next();
            System.out.println("\n Salary: ");
            long h =sc.nextLong();
            System.out.println("\n Subject: ");
            String k =sc.next();
            System.out.println("\n Department: ");
            String l =sc.next();
            System.out.println("\n Teacher Id: ");
            String n =sc.next();
            arr[i]=new Teacher2(a,b,c,d,e,f,g,h,k,l,n);
        }
        sc.close();
        System.out.println("\n********Informations of all the Teacher's************");
        for(int i=0;i<num;i++){
            j=i+1;
            System.out.println("\n"+j+").");
            arr[i].display();
            
     }
     sc1.close();
     }
    
 }
