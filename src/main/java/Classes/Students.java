package Classes;

final class Students {

    private static Students INSTANCE = new Students();


    private Students() {
        Student shijin = new Student(11);
        Student diksha = new Student(12);
        Student shaily = new Student(13);
        Student angelina = new Student(14);
        Student lavanya = new Student(15);
        Student ethan = new Student(16);
        Student jorden = new Student(17);
        Student mariyana = new Student(18);
        Student nick = new Student(19);
        Student trey = new Student(20);
        Student chaz = new Student(21);
        Student ali = new Student(22);
        Student anthony = new Student(23);
        Student abukar = new Student(24);
        Student jorris = new Student(25);
        Student danny = new Student(26);
        Student andy = new Student(27);
        Student asan = new Student(28);
        Student jennifer = new Student(29);
        Student alice = new Student(30);
        Student michael = new Student(31);
        Student asia = new Student(32);
        Student dan = new Student(33);
        Student chris = new Student(34);
        Student lydia = new Student(35);
        Student deepa = new Student(36);
        Student matt = new Student(37);
        Student jake = new Student(38);
    }

    public Students getInstance(Students INSTANCE) {
        return INSTANCE;
    }
}
