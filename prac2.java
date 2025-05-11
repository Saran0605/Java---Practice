public class prac2 {
    public static void main(String[] args){
        A obj = new A("hello");
        

    }
    
}

class A{
    B obj2 ;
      A(String name){
        System.out.println("eat"+name);
        obj2 = new B();

    }

}


class B{
    B(){
        System.out.println("run");
    }
}