/*
    Name : Kansagara Kush;
    ID : 21CE051
*/
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Lion extends Animal {

    void eat(){
        System.out.println("Lion is eating meat");
    }
}
public class Practical3_4{
    public static void main(String[] args) {
        Lion l1=new Lion();
        l1.eat();
    }

}
