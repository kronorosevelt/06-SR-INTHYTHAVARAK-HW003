package homework3;

public class HourlyEmployee extends StaffMember {
    private int hoursworked;
    private double rate;

    public HourlyEmployee(int id, String name, String address, int hoursworked, double rate) {
        super(id, name, address);
        this.hoursworked = hoursworked;
        this.rate = rate;
    }

    public int getHoursworked() {
        return hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
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
        return "id= " + getId() + "\nName= " + getName() + "\nAddress= "+ getAddress() + "\nHour= " + getHoursworked()+"\nrate= "+ getRate()+"\n";

    }
}

