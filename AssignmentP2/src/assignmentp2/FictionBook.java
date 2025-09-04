
package assignmentp2;

public class FictionBook extends Book {

    public FictionBook(int id, String title, boolean isAvailable) {
        super(id, title, isAvailable);
    }

    @Override
    public String getType() {
        return "Fiction";
    }
}
