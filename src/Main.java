import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pupil excellentPupil = new ExcellentPupil();
        Pupil goodPupil = new GoodPupil();
        Pupil badPupil = new BadPupil();
        Pupil anotherExcellentPupil = new ExcellentPupil();

        ClassRoom classRoom = new ClassRoom(excellentPupil, goodPupil, badPupil, anotherExcellentPupil);
        System.out.print("Введите количество учинеков, которых вы бы хотели проверить (от 1 до 4): ");
        int who = scan.nextInt();
        switch (who) {
            case 1:
                classRoom.showInfo1();
                break;
            case 2:
                classRoom.showInfo2();
                break;
            case 3:
                classRoom.showInfo3();
                break;
            case 4:
                classRoom.showInfo4();
                break;
            default:
                System.out.println("Такого количества учеников нет или не найдено в базе...");
                break;
        }
    }
}





