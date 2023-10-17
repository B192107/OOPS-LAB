class person{
    String name;
    String address;
    person(String name,String address){
        this.name=name;
        this.address=address;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    String tostring(){
        return name+'('+address+')';
    }
}

class student extends person{
    int numCourses;
    String[] courses;
    int[] grades;
    final int MAX_COURSES=30;
    student(String name,String address){
        super(name,address);
        numCourses=0;
        courses=new String[MAX_COURSES];
        grades=new int[MAX_COURSES];
    }
    void addCourseGrade(String course,int grade){
        courses[numCourses]=course;
        grades[numCourses]=grade;
        ++numCourses;
    }
    void printGrades(){
        for(int i=0;i<numCourses;i++){
            System.out.println(courses[i]+"="+grades[i]);
        }
    }
    double getAverageGrade(){
        int sum=0;
        for(int i=0;i<numCourses;i++){
            sum+=grades[i];
        }
        return (double)sum/numCourses;
    }
    String tostring(){
        return name+"("+address+")";
    }
}

class teacher extends person{
    int numCourses;
    String[] courses;
    final int MAX_COURSES=5;
    teacher(String name,String address){
        super(name,address);
        numCourses=0;
        courses=new String[MAX_COURSES];
    }
    String tostring(){
        return name+"("+address+")";
    }
    boolean addCourse(String course){
        for(int i=0;i<numCourses;i++){
            if(courses[i].equals(course)){
                return false;
            }
        }
        courses[numCourses]=course;
        numCourses++;
         return true;
    }
    boolean removeCourse(String course){
        int c=numCourses;
        for(int i=0;i<numCourses;i++){
            if(courses[i].equals(course)){
                c=i;
                break;
            }
        }
         if(c==numCourses){
            return false;
        }
        else{
            for(int i=c;i<numCourses-1;i++){
                courses[i]=courses[i+1];
            }
             numCourses--;
             return true;
        }
    }
}

public class lab4_2 {
    public static void main(String[] args) {
       person p=new person("venkatesh","India");
       System.out.println( p.getName());
       System.out.println( p.getAddress());
       System.out.println( p.tostring());

        student s=new student("abhi","USA");
        s.addCourseGrade("Maths",75);
        s.addCourseGrade("Physics",87);
        s.addCourseGrade("Chemistry",90);
        s.printGrades();
        System.out.println("avg="+s.getAverageGrade());
        System.out.println(s.tostring());

        teacher t=new teacher("Rakesh","Uk");
        System.out.println(t.tostring());
        String[] courses={"Maths","Physics","Maths"};
        for(String course:courses){
            if(t.addCourse(course)){
                System.out.println(course+" added");
            }
            else{
                System.out.println(course +" cannot be added");
            }
        }
        for(String course:courses){
            if(t.removeCourse(course)){
                System.out.println(course+" removed");
            }
            else{
                System.out.println(course +" not found");
            }
        }

    }
}
