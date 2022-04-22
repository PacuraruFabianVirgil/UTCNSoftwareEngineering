package pacuraru.fabian.lab5.ex2;

public class Test {
    public static void main(String[] args){
        ProxyImage img1 = new ProxyImage("picture1", "rotated");
        ProxyImage img2 = new ProxyImage("picture2", "real");
        ProxyImage img3 = new ProxyImage("picture3", "nothing");
        img1.display();
        img2.display();
        img3.display();
    }
}
