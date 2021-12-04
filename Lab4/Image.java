import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private final String imageName;
    protected final String imageName;

    Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Element get(int elementIndex) {
        return null;
    }
    public void add(Element element) {
    }
    public void remove(Element element) {
    }
    public void print() {
        System.out.println("Image with name: " + imageName);
    }
}