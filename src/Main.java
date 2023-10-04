public class Main {
    public static void main(String[] args) {
        Playable.Player playing = new Playable.Player();

        // Відтворення
        System.out.println("Проигрывание:");
        playing.play();
        playing.pause();
        playing.stop();

        // Запис
        System.out.println("\nЗапись:");
        playing.record();
        playing.pause();
        playing.stop();
    }
}