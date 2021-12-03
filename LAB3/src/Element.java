public class Element {
    public interface Element {
        public default void print() {}
import java.util.ArrayList;

        public abstract class Element {
            public ArrayList<Element> elements = new ArrayList<>();

            public Element get(int elementIndex) { return elements.get(elementIndex); }

            public void add(Element element) { elements.add(element); }

            public void remove(Element element) { elements.remove(element); }

            public void print() {
                elements.forEach(Element::print);
            }
        }
}
