public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Ivanov Ivan Ivanovich1", 1, 75500f);
        empl[1] = new Employee("Ivanov Ivan Ivanovich2", 2, 83450f);
        empl[2] = new Employee("Ivanov Ivan Ivanovich3", 3, 71200f);
        empl[3] = new Employee("Ivanov Ivan Ivanovich4", 4, 90200f);
        empl[4] = new Employee("Ivanov Ivan Ivanovich5", 5, 99200f);
        empl[5] = new Employee("Ivanov Ivan Ivanovich5", 6, 99200f);
        empl[6] = new Employee("Ivanov Ivan Ivanovich5", 7, 99200f);
        empl[7] = new Employee("Ivanov Ivan Ivanovich5", 8, 99200f);
        empl[8] = new Employee("Ivanov Ivan Ivanovich5", 9, 99200f);
        empl[9] = new Employee("Ivanov Ivan Ivanovich10", 10, 99200f);

        for (Employee e: empl) {
            System.out.println(e);
        }
    }
}