
package assignmentp2;

/**
 *
 * @author lab_services_student
 */
public class nonFictionBook extends Book {

    public nonFictionBook(int id, String title, boolean isAvailable) {
        super(id, title, isAvailable);
    }

    @Override
    public String getType() {
        return "Non-Fiction";
    }
}
