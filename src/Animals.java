public enum Animals {
    MAVPA(3),
    VOVK(5);

    private final int age;
    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + " (вік: " + age + ")";
    }
}
