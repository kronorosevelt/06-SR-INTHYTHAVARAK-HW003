package homework3;
import java.util.Scanner;
import java.util.ArrayList;



public class homework3 {
    static int index = 1;
    static StaffMember arrStaff[];

    public static void main(String[]args){
        list();
        view();
    }
    public static void list() {
        ArrayList<StaffMember> staffMembers = new ArrayList<StaffMember>();
        StaffMember stf1 = new Volunteer(1, "rak", "PP");
        StaffMember stf2 = new SalariedEmployee(1, "dodo", "PP", 300, 100);
        StaffMember stf3 = new HourlyEmployee(1, "theara", "PP", 20, 20.3);

        staffMembers.add(stf1);
        staffMembers.add(stf2);
        staffMembers.add(stf3);
        for (StaffMember stf : staffMembers) {

            System.out.println(stf);
            System.out.println("-----------------------------------------------");
        }
    }

    public static void view() {
        System.out.println("1. Add employee   2.Edit   3.Remove   4.Exit");
        System.out.println("\n ------------------------------------");
        System.out.print("=> Choose option(1-4) :");
        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                edit();
                break;
            case 3:
                update();
                break;
            case 4:
                System.exit(0);
                break;
        }


    }

    private static void edit() {
    }

    private static void update() {
    }



    private static void add() {
        System.out.println("1.Volunteer   2.Salaried Emp   3.Hourly Emp   4.back");
        System.out.print("=> Choose option(1-4) :");
        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {
            case 1:
                volunteer();
                break;
            case 2:
                salary();
                break;
            case 3:
                hourly();
                break;
            case 4:
                list();
                view();
        }

    }

    private static void hourly() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Insert info--------");
        System.out.println("=> Enter Staff's Member ID:"+ index);
        System.out.println("=> Enter Staff's Member Name:");
        String name = scan.next();
        System.out.println("=> Enter Staff's Member Address:");
        String address = scan.next();
        System.out.println("=> Enter Hour:");
        Integer hour = scan.nextInt();
        System.out.println("=> Enter Rate:");
        Double rate = scan.nextDouble();
        System.out.println("===================================");
        for(int i=0;i<index;i++){
            NewMember objmem = new NewMember();
            objmem.setID(index);
            objmem.setName(name);
            objmem.setAdress(address);
            objmem.setHoursworked(hour);
            objmem.setRate(rate);
            System.out.println("ID:"+objmem.getId());
            System.out.println("Name:"+objmem.getName());
            System.out.println("Addres:"+objmem.getAddress());
            System.out.println("HourlyWord:"+objmem.getHoursworked());
            System.out.println("Rate:"+objmem.getRate());
            System.out.println("payment:"+objmem.getPayment());
            System.out.println("----------------------------------");
    }
        add();
    }

    private static void volunteer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Insert info--------");
        System.out.println("=> Enter Staff's Member ID:" + index);
        System.out.println("=> Enter Staff's Member Name:");
        String name = scan.next();
        System.out.println("=> Enter Staff's Member Address:");
        String address = scan.next();
        System.out.println("===================================");

        for(int i=0;i<index;i++){
            NewMember objVol = new NewMember();
            objVol.setID(index);
            objVol.setName(name);
            objVol.setAdress(address);
            System.out.println("ID:"+objVol.getId());
            System.out.println("Name:"+objVol.getName());
            System.out.println("Addres:"+objVol.getAddress());
            System.out.println("----------------------------------");

        }
        add();
    }
    private static void salary() {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Insert info--------");
        System.out.println("=> Enter Staff's Member ID:" + index);
        System.out.println("=> Enter Staff's Member Name:");
        String name = scan.next();
        System.out.println("=> Enter Staff's Member Address:");
        String address = scan.next();
        System.out.println("=> Enter Salary:");
        Double salary = scan.nextDouble();
        System.out.println("=> Enter Bonus:");
        Double bonus = scan.nextDouble();
        System.out.println("===================================");
        for (int i = 0; i < index; i++) {
            NewMember objmem = new NewMember();
            objmem.setID(index);
            objmem.setName(name);
            objmem.setAdress(address);
            objmem.setSalary(salary);
            objmem.setBonus(bonus);
            System.out.println("----------------------------------");
            System.out.println("ID:" + objmem.getId());
            System.out.println("Name:" + objmem.getName());
            System.out.println("Addres:" + objmem.getAddress());
            System.out.println("Salary:" + objmem.getSalary());
            System.out.println("Bonus:" + objmem.getBonus());
            System.out.println("payment:" + objmem.getPay());
            System.out.println("----------------------------------");
        }
        add();
    }


    }


