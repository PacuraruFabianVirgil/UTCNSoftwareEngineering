package pacuraru.fabian.lab5.ex2;

public class ProxyImage implements Image {

    private String selector;
    private String fileName;

    public ProxyImage(String fileName, String selector){
        this.fileName = fileName;
        this.selector = selector;
    }

    @Override
    public void display() {
        if (selector == "real"){
            RealImage realImage = new RealImage(fileName);
            realImage.display();
        }
        else if (selector == "rotated"){
            RotatedImage rotatedImage = new RotatedImage(fileName);
            rotatedImage.display();
        }
        else System.out.println("Invalid selector\n");
    }
}
