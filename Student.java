

public class Student{
    String name;
    String program;
    int semester;
    String course;
    public Student(String name,String program,int semester,String course){
        this.name=name;
        this.program=program;
        this.semester=semester;
        this.course=course;
    }
    public void dispaly_Details(){
        System.out.println("The Student name is "+name);
        System.out.println("The Program "+program);
        System.out.println("The Semester  "+semester);
        System.out.println("The Course Registered "+course);
    }

public static void main(String[] args)
{
  Student s1=new Student("vijay", "Computer Apllication", 4, "BCA");
  s1.dispaly_Details();
  Student_Course s2=new Student_Course(null, null, 0, null);
  s2.course();
}
  }
