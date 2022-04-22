package pacuraru.fabian.lab5.ex2;

public class RotatedImage implements Image {

    private String fileName;

    public RotatedImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying rotated " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
