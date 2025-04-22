package Employee_Calculator;

public class EmployeeCalculator {
    private   static String name;
    private double salary;
    private int weeklyWorkHours;
    private int hireYear;

    public EmployeeCalculator(String name, double salary, int weeklyWorkHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.weeklyWorkHours = weeklyWorkHours;
        this.hireYear= hireYear;
    }

    public double tax(){

        if (salary < 1000){
            return 0;
        }else {
            return salary * 0.03;
        }
    }

    public double bonus(){
        if (weeklyWorkHours > 40){
            int extraHours = weeklyWorkHours - 40;
            return  extraHours * 30;

        }
        return 0;
    }

    public double raiseSalary(){

        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10){
            return salary * 0.05;
        } else if (yearsWorked > 9 && yearsWorked < 20) {
            return salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }

    public String toString(){
        return "Çalışanın Adı,Soyadı : " + name +
                "\n Maaşı : " + salary +
                "\n Çalışma Saati : " + weeklyWorkHours +
                "\n Başlangıç Yılı : " + hireYear +
                "\n Vergi : " + tax() +
                "\n Bonus : " + bonus() +
                "\n Maaş artışı : " + raiseSalary() +
                "\n Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax() + bonus()) +
                "\n Toplam Maaşı : " + (salary + bonus() - tax() + raiseSalary());

    }

    public static void main(String[] args) {
        EmployeeCalculator employee = new EmployeeCalculator("Mustafa Tavusbay",2000,45,1985);
        System.out.println(employee.toString());
    }

}