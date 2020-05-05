package homework3;

public class Volunteer extends StaffMember {
    public Volunteer(int id, String name, String address) {
        super(id, name, address);
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
        return "id= " + getId() + "\nName= " + getName() + "\nAddress= "+ getAddress() ;
    }
}
