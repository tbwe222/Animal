public class Dog extends Animal {

    public Dog(){
        super();
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return "A Dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }

    public String hufff() {
        return "hufff...";
    }
}
