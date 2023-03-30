
public class obj1 {
     public static void main(String a[]) {
        student s1= new student();
        s1.roll=3;
        s1.name="sanskar";
        s1.marks=89;


        student s2= new student();
        s2.roll=4;
        s2.name="kumar";
        s2.marks=8;


        student s3= new student();
        s3.roll=3;
        s3.name="sahu";
        s3.marks=9;


        student objectarray[]= new student[3];
        objectarray[0]=s1;
        objectarray[1]=s2;
        objectarray[2]=s3;

        for(int i=0;i<3;i++){
            System.out.println(objectarray[i].roll + " "+objectarray[i].name);
        }
        
    }
}
class student{
    int roll;
    String name;
    int marks;
}
