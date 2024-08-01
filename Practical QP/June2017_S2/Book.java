import java.util.Scanner;
class Book{
    Book(){
        System.out.println("Hey..What you want to Access");
        int n=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 for yes or 0 for No....");
        n = s.nextInt();
        while(n==5){
        System.out.println("Enter 1 for Book Info");
        System.out.println("Enter 2 for Book Price");
        System.out.println("Enter 3 for Book ISBN");
        n = s.nextInt();
            switch(n){
                case 1:
                    Display_Book_Info();
                    break;
                case 2:
                    Display_Book_Price();
                    break;
                case 3:
                    Display_ISBN();
                    break;
            }
        }
    }

    public void Display_Book_Info( ){
        System.out.println("Book Name : ");
        System.out.println("Book Writter : ");
        System.out.println("Book Category : ");
        System.out.println("Book Pages : ");
        System.out.println("Book Chapters : ");
    }

    public void Display_Book_Price( ){
        System.out.println("Book Price : ");
        System.out.println("Discount : ");
        System.out.println("Gst : ");
        System.out.println("Net Price : ");
    }

    public void Display_ISBN( ){
        System.out.println("ISBN : xxxx_xxxx_xx");
    }

    //Main Programme///////
    public static void main(String arg[]){
        Book b = new Book();
        b.Display_Book_Info();
        b.Display_Book_Price();
        b.Display_ISBN();
    }
}