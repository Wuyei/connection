package test;

class Book {
    boolean checkedout = false;
    int i;
    Book(boolean checkOut,int i) {
        checkedout = checkOut;
        this.i = i;
    }

    void checkIn() {
        checkedout = false;
    }

    protected void finalize() throws Throwable {
        if (checkedout) {
            System.out.println("Error: checked out :"+i);
        }
        super.finalize();
    }
}

// Normally, you'll also do this:
// super.finalize(); // Call the base-class version
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true,1);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true,2);
        // 1 For¨¨e garbage collection & finalization:
        System.gc();
    }
}