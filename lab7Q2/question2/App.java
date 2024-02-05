public class App {
    public static void main(String[] args) {
        EmpComp ceo = new Employee("Settha", "CEO", 500000);

        EmpComp salesDepartment = new EmpGroup("Sales");
        EmpComp marketingDepartment = new EmpGroup("Marketing");

        EmpComp headSales = new Employee("Kamphaka", "Head Sales", 300000);
        EmpComp sales1 = new Employee("Wiroj", "Sales", 150000);
        EmpComp sales2 = new Employee("Weeranan", "Sales", 100000);

        EmpComp headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        EmpComp marketing1 = new Employee("Oak", "Marketing", 200000);
        EmpComp marketing2 = new Employee("Aem", "Marketing", 250000);

        salesDepartment.add(headSales);
        salesDepartment.add(sales1);
        salesDepartment.add(sales2);

        marketingDepartment.add(headMarketing);
        marketingDepartment.add(marketing1);
        marketingDepartment.add(marketing2);

        EmpComp company = new EmpGroup("Company");
        company.add(ceo);
        company.add(salesDepartment);
        company.add(marketingDepartment);

        company.print();
    }
}
