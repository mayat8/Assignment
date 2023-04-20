public class AssignedAsciiArt {
    public static final int FIGURE_SIZE = 7;

    public static void line(){
        System.out.print("|");
        for(int i = 1; i <= 6*FIGURE_SIZE; i++){
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void body(){
        for(int i = 1; i <= FIGURE_SIZE*FIGURE_SIZE; i++){
            // spaces
            for(int j = 1; j <= (2*FIGURE_SIZE+1); j++){
                System.out.print(" ");
            }
            System.out.print("|");
            for(int k = 1; k <= (FIGURE_SIZE-2); k++){
                System.out.print("%");
            }
            System.out.print("||");
            for(int l = 1; l <= (FIGURE_SIZE-2); l++){
                System.out.print("%");
            }
            System.out.println("|");
        }
    }

    public static void topHalf(){
        for(int line = 1; line <= FIGURE_SIZE; line++){
            for(int i = 1; i <= 3*(FIGURE_SIZE - line); i++){
                System.out.print(" ");
            }
            System.out.print("__/");
            for(int j = 1; j <= 3*line-3; j++){
                System.out.print(":");
            }
            System.out.print("||");
            for(int k = 1; k <= 3*line-3; k++){
                System.out.print(":");
            }
            System.out.println("\\__");
        }
    }

    public static void bottomHalf(){
        for(int line = 1; line <= FIGURE_SIZE; line++){
            for(int i = 1; i <= 2*line-2; i++){
                System.out.print(" ");
            }
            System.out.print("\\_");
            for(int j = 1; j <= (3*FIGURE_SIZE+1) - 2*line; j++){
                System.out.print("/\\");
            }
            System.out.println("_/");
        }
    }

    public static void column(){
        for(int i = 1; i <= FIGURE_SIZE; i++){
            for(int j = 0; j < 3*FIGURE_SIZE; j++){
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
    public static void main(String[] args){
        column();
        topHalf();
        line();
        bottomHalf();
        column();
        body();
        topHalf();
        line();
    }
}

