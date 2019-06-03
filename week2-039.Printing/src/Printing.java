public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int loop = 0;
        while (loop < amount) {
            System.out.print("*");
            loop++;
        }
        
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int loop = 0;
        while (loop < sideSize) {
            printStars(sideSize);
            loop++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int loop = 0;
        while (loop < height) {
            printStars(width);
            loop++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int loop = 0;
        
        while (loop < size) {
            printStars(loop + 1);
            loop++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
