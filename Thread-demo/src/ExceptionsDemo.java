

public class ExceptionsDemo {
    public static void main(String[] args) {
    	Book book = new Book();
    	try {
    	book.setPrice(-1000);
    	} catch(InvalidPriceException e) {
    		e.printStackTrace();
    		System.out.println(e.getMessage());
    	}
    }
}

//compile-time: checked
//runtime: unchecked