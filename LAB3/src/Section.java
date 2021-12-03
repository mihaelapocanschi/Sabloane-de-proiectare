
    package PACKAGE_NAME;
    public class Section {
        public class Section extends Element {
            protected String title;

            Section(String title) {
                this.title = title;
            }

            public void print() {
                System.out.println("Capitolul " + title);
                elements.forEach(Element::print);
            }
        }
}
