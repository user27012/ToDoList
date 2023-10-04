public interface Playable {

    public void play();
    public void pause();
    public void stop();

    class Player implements Playable, Recordable {

        @Override
        public void play() {
            System.out.println("Проигывается...");
        }

        @Override
        public void pause() {
            System.out.println("Приостановленно...");
        }

        @Override
        public void record() {
            System.out.println("Записывается...");
        }

        @Override
        public void stop() {
            System.out.println("Остановленно...");
        }
    }

}
