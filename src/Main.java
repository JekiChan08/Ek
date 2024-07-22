//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person(20, "Jeki");
        Employee employee = new Employee(18, "Max", "Стажер");
        Company company = new Company();
        Company.changeCompanyName("It корпарация");
        Company.printCompanyName();
        Company.changeCompanyName("Инжинерная компания");

    }
}