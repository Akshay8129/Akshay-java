import java.util.*;
class Person
{
String name;
String gender;
String address;
int age;
public Person(String n,String g,String a,int age)
{
this.name=n;
this.gender=g;
this.address=a;
this.age=age;
}
public void show(){
		System.out.println("name:" +name+ "address: " + address + "\ngender: " + gender + "\nage: " + age);
	}
}
class Employee extends Person
{
int empid;
String cmp_name;
String qualification;
int salary;
public Employee(String P_n,String P_g,String P_a,int P_age,int empid,String cmp_name,String q,int s)
{
super(P_n,P_g,P_a,P_age);
this.empid=empid;
this.cmp_name=cmp_name;
this.qualification=q;
this.salary=s;
}
public void show(){
                super.show();
		System.out.println("emp_id:" +empid+ "cmp_name: " + cmp_name + "\nqualification: " + qualification + "\nsalary: " + salary);
	}
}
class Teacher extends Employee
{
String subject;
String dept;
int teacher_id;
public Teacher(String P_n,String P_g,String P_a,int P_age,int E_empid,String E_cmp_name,String E_q,int E_s, int id,String s,String dept)
{
super(P_n,P_g,P_a,P_age,E_empid,E_cmp_name,E_q,E_s);
this.subject=s;
this.dept=dept;
this.teacher_id=id;
}
public void show(){
                super.show();
		System.out.println("subject:" +subject+ "dept: " + dept + "\nteacher_id: " + teacher_id);
	}
}
public class personprg
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);

System.out.println("Enter the number of Teachers\n");
int n=obj.nextInt();
Teacher array[]=new Teacher[n];
for(int i=0;i<n;i++)
{
System.out.println("enter the name of teacher\n");
String name=obj.next();
System.out.println("enter the gender of teacher\n");
String g=obj.next();
System.out.println("enter the address of teacher\n");
String addr=obj.next();
System.out.println("enter the age of teacher\n");
int age=obj.nextInt();

System.out.println("enter the emp_id of teacher\n");
int emp_id=obj.nextInt();
System.out.println("enter the company name of teacher\n");
String cmp_name=obj.next();
System.out.println("enter the qualification of teacher\n");
String q=obj.next();
System.out.println("enter the salary of teacher\n");
int s=obj.nextInt();


System.out.println("Enter the id\n");
int id=obj.nextInt();
System.out.println("Enter the subject\n");
String subject=obj.next();
System.out.println("Enter the department\n");
String dept=obj.next();
array[i] = new Teacher(name,g,addr,age,emp_id,cmp_name,q,s,id,subject,dept);
}
}
}