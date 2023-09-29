
public class Pupil {

void study() {
        System.out.println("Учень навчається");
        }

        void read() {
        System.out.println("Учень читає");
        }

        void write() {
        System.out.println("Учень пише");
        }

        void relax() {
            System.out.println("Учень відпочиває");

        }
}

class ExcellentPupil extends Pupil {

    void study() {
        System.out.println("Відмінник навчається дуже добре");
    }


    public void read() {
        System.out.println("Відмінник дуже багато читає");
    }


    public void write() {
        System.out.println("Відмінник дуже багато пише");
    }


    public void relax() {
        System.out.println("Відмінник рідко відпочиває");
    }
}

class GoodPupil extends Pupil {

    public void study() {
        System.out.println("Добрий учень навчається добре");
    }

    public void read() {
        System.out.println("Добрий учень читає нормально");
    }

    public void write() {
        System.out.println("Добрий учень пише нормально");
    }

    @Override
    public void relax() {
        System.out.println("Добрий учень відпочиває нормально");
    }
}

class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Слабкий учень навчається погано");
    }

    @Override
    public void read() {
        System.out.println("Слабкий учень мало читає");
    }

    @Override
    public void write() {
        System.out.println("Слабкий учень мало пише");
    }

    @Override
    public void relax() {
        System.out.println("Слабкий учень відпочиває багато");
    }
}

class ClassRoom {
    private final Pupil pupil1;
    private final Pupil pupil2;
    private final Pupil pupil3;
    private final Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public void showInfo4() {
        System.out.println("Інформація про учнів в класі:");
        System.out.println("Учень 1:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();
        System.out.println("Учень 2:");
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
        System.out.println("Учень 3:");
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();
        System.out.println("Учень 4:");
        pupil4.study();
        pupil4.read();
        pupil4.write();
        pupil4.relax();
    }
    public void showInfo3() {
        System.out.println("Інформація про учнів в класі:");
        System.out.println("Учень 1:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();
        System.out.println("Учень 2:");
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
        System.out.println("Учень 3:");
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();
    }
    public void showInfo2() {
        System.out.println("Інформація про учнів в класі:");
        System.out.println("Учень 1:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();
        System.out.println("Учень 2:");
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
    }
    public void showInfo1() {
        System.out.println("Інформація про учнів в класі:");
        System.out.println("Учень 1:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();

    }
}