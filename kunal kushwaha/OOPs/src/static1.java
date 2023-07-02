public class static1 {
    public static void main(String[] args) {



        fun();
        static1 obj=new static1();
        obj.fun2();

    }

    public static void fun(){
        static1 obj=new static1();
        obj.greeting1();
    }
    public void fun2(){
        greeting1();
        greeting2();
    }

    public void greeting1(){
        System.out.println("hello1");
    }
    public void greeting2(){
        System.out.println("hello2");
    }


}
