
    public class Paragraph implements Element {
        public class Paragraph extends Element {
            private final String text;

            Paragraph(String imageName) {
                this.text = imageName;
            }
            public void print() {
                System.out.println("Paragraph: " + text);
            }
        }
}
