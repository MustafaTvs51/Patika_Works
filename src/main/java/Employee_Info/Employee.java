package Employee_Info;

public class Employee {

    private String employeeName;
    private String employeeSurname;

    public class  ContactInfo {

        private String EmployeePhoneNumber;
        private String EmployeeEmail;

        public ContactInfo(String employeePhoneNumber, String employeeEmail) {
            this.EmployeeEmail = employeeEmail;
            this.EmployeePhoneNumber = employeePhoneNumber;

        }
            public void displayContactInfo () {
                System.out.println("Contact Infos:");
                System.out.println("Phone : " + EmployeePhoneNumber);
                System.out.println("E-mail: " + EmployeeEmail);
            }
        }

    public Employee(String employeeName, String employeeSurname) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
    }

    public void showEmployeeDetails(String employeePhoneNumber, String employeeEmail) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Surname: " + employeeSurname);

        System.out.println("------------------");


        // İç sınıfı kullanarak iletişim bilgilerini göster
        ContactInfo contactInfo = new ContactInfo(employeePhoneNumber, employeeEmail);
        contactInfo.displayContactInfo();
    }


    public static void main(String[] args) {
        Employee emp = new Employee("Ayşe", "Yılmaz");
        emp.showEmployeeDetails("0555 123 4567", "ayse.yilmaz@firma.com");
    }
}