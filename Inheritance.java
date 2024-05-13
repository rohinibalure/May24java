/*class Teacher{  
 float salary=40000;  
}  
class Inheritance extends Teacher{  
 int bonus=10000;  
 public static void main(String args[]){  
   Inheritance p=new Inheritance();  
   System.out.println("Teacher salary is:"+p.salary);  
   System.out.println("Bonus of teacher is:"+p.bonus);  
}  
}  */



class Grandf{  
void act(){
    System.out.println("acting...");}  
}  
class Father extends Grandf{  
void speak(){System.out.println("speaking...");}  
}  
class Son extends Grandf{  
void play(){System.out.println("playing...");}  
}  
class Inheritance{  
public static void main(String args[]){  
Son s=new Son();  
s.act();  
s.play();  
 //s.speak();
}}  