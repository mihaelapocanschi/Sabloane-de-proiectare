public class Image {
    public class Image implements Element {
        public class Image extends Element {
            private final String imageName;

            Image(String imageName) {
                this.imageName = imageName;
            }
            public void print() {
                System.out.println("Image with name: " + imageName);
            }
        }
}
