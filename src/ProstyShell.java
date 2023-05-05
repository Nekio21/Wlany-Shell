import java.util.Scanner;

public class ProstyShell {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        String text = scanner.next();
        text.trim();

        runCommend(text);
    }

    private static void runCommend(String command){
        if("exit".equals(command)){
            exit();
        }
    }


    private static void exit(){
        System.out.println("Zamykam system :)");
        System.exit(12);
    }
}