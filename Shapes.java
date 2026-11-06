public class Shapes {
    public static void main(String[] args) {
       Turtle Elias = new Turtle();
       
       
        // Task 1: Draw a regular shape
        for(int i = 1; i <= 5; i++){
           Elias.forward(22);
           Elias.left(72);
           }
           Elias.up();
           Elias.left(180);
           Elias.forward(128);
           Elias.down();
       
        


        // Task 2: Draw a regular shape many times
        for(int i = 1; i <= 10; i++){
           for(int m = 1; m <= 5; m++){
           Elias.forward(22);
           Elias.left(72);
           }
           Elias.up();
           Elias.right(9);
           Elias.forward(50);
           Elias.down();
           }


        // Task 3: How many times does Turtle turn!
        Elias.up();
        Elias.right(90);
        Elias.forward(135);
        Elias.down();
        int sum = 0;
        for(int i = 1; i <= 10; i++){
           for(int m = 1; m <= 5; m++){
           Elias.forward(22);
           Elias.left(72);
           sum++;
           }
           Elias.up();
           Elias.right(9);
           Elias.forward(50);
           Elias.down();
           sum++;
           
           }
           System.out.println("Elias has turned " + sum + " times");

        
        


        // Extension 1:


        // Extension 2:

    }
}
