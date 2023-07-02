import java.util.Arrays;

public class Lect1 {
    public static void main(String[] args) {

//        student harshit=new student();
//        harshit.roll=12;
//        harshit.name="Harshit";
//        harshit.marks=90f;

        student hars=new student(15,"Hars",78.45f);
        System.out.println(hars.marks);
        System.out.println(hars.name);
        System.out.println(hars.roll);

        student rahul=new student();
        System.out.println(rahul.name);

        student harshit=new student(hars);
        System.out.println(harshit.name);

        student harshit2;
        harshit2=hars;

        System.out.println(harshit);
        System.out.println(hars);
        System.out.println(harshit2);

        harshit2.change("new name");
        System.out.println(harshit2.name);
        System.out.println(hars.name);


    }

}

class student{
    int roll;
    String name;
    float marks;

    student(int roll,String name,float marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }

    student(){
        this(00,"random",100f);
    }

    student(student other){
        this.roll= other.roll;
        this.marks= other.marks;
        this.name= other.name;
    }

    void change(String name){
        this.name = name;
    }
}


