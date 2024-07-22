public class Company {
    private static String companyName;


    public Company() {
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Company.companyName = companyName;
    }

    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

    public static void changeCompanyName(String newName) {
        companyName = newName;
        System.out.println("Теперь компания называеться " + newName);
    }
}
