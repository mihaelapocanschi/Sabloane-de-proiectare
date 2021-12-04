public class ImageProxy extends Picture {
    private final String imageName;
    private Image realImage;

    ImageProxy(String imageName) {
        this.imageName = imageName;
        this.realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(this.imageName);
        }
        return realImage;
    }

    public void print() {
        Image img = loadImage();
        System.out.println("Image with name: " + img.imageName);
    }
}