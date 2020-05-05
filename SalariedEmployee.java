package homework3;

public class SalariedEmployee extends StaffMember {
    private double salary;
    private double bounus;

    public SalariedEmployee(int id, String name, String address, double salary, double bounus) {
        super(id, name, address);
        this.salary = salary;
        this.bounus = bounus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBounus() {
        return bounus;
    }

    public void setBounus(double bounus) {
        this.bounus = bounus;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String toString() {
        return "id= " + getId() + "\nName= " + getName() + "\nAddress= "+ getAddress() + "/nSalary= " + getSalary()+"\nbonus= "+ getBounus()+"\n";
    }
}
