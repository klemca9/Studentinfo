class Student_Course extends Student{
    String[] coursename={"devops","machine learning","software testing"};
    int[]  marks={25,50,35}; 
    int n=4;
    public Student_Course(String name, String program, int semester, String course) {
        super(name, program, semester, course);}
        public void course(){
        System.out.println("Courses less than 40 marks");
        for(int i=0;i <=n ;i++){
              if(marks[i]<40){
                System.out.println("Coursename:"+coursename[i]);
                System.out.println("Marks:"+marks[i]);
                
              }
    
            }
        }
    }
    
 

    
