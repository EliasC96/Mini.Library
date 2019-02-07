
/**
 * @author Elias
 * @version 1.00
 * // This Mini Library allows to add, delete and edit books
 */

public class Books {

    /**
     * The Books class has 2 fields
     */
    private String Name ;
    private int Pages ;
    /**
     * The Books class has 2 methods
     */
    public String getName() { return Name; }

    public void setName(String name) { Name = name; }

    public int getPages() { return Pages; }

    public void setPages(int pages) { Pages = pages; }

    @Override
    public String toString() {
        return "Books{" +
                "Name='" + Name + '\'' +
                ", Pages=" + Pages +
                '}';
    }

    public Books () {Name = "da";}
    public static void main (String [] args){

        Books Book = new Book()
    }

}


