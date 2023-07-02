public class human {
    int age;
    String name;
    Boolean married;
    int salary;
    static long population;

    static void message(){
        System.out.println("hello you enquired");
    }

    public human(int age,String name,Boolean married,int salary){
        this.age=age;
        this.name=name;
        this.married=married;
        this.salary=salary;
        human.population+=1;
    }



}
