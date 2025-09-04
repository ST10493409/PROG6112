
package assignmentp2;


public class Book {
    private int id;
    private String title;
    private boolean isAvailable;

    public Book(int id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public String getType() {
        return "General";
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String toString() {
        return String.format("ID: %d | Title: %s | Available: %s | Type: %s", id, title, isAvailable, getType());
    }
}
    

