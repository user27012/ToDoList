import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AbstractHandler xmlHandler = new XMLHandler();
        AbstractHandler txtHandler = new TXTHandler();
        AbstractHandler docHandler = new DOCHandler();

        System.out.println("Добро пожаловать! О чем я мог бы вам рассказать? Нажмите 1 что бы просмотреть меню.");
        int change = scan.nextInt();
        if (change == 1){
            System.out.println("Что делает XMLHandler = 3 \nЧто делает TXTHandler = 2 \nЧто делает DOCHandler = 1");
            int then = scan.nextInt();
            switch (then){
                case 3:
                    xmlHandler.open();
                    xmlHandler.create();
                    xmlHandler.save();
                    xmlHandler.change();
                    break;
                case 2:
                    txtHandler.change();
                    txtHandler.save();
                    txtHandler.open();
                    txtHandler.create();
                    break;
                case 1:
                    docHandler.create();
                    docHandler.open();
                    docHandler.save();
                    docHandler.change();
                default:
                    System.out.println("Элемент не расспознан...");
                    break;
            }

        } else {
            System.out.println("К вводу доступны только 1 или ничего.");
        }
    }
}
