package Learnings;
public class Inheritance1 {
    public static void main(String[] args) {
            company_details ob = new company_details();   
            System.out.println(ob.name("Harsh"));
            System.out.println(ob.age(21));
            System.out.println(ob.gender("Male"));
            System.out.println(ob.jobid("A1998"));
            System.out.println(ob.salary("120398.57"));
            System.out.println(ob.doj("24/04/1998"));
            System.out.println(ob.cname("XYZ"));
            System.out.println(ob.registrationno("2029913414932"));
            System.out.println(ob.address("Banglore"));
    }
}

class job_details{
    String jobid( String jobid){
        String jid = jobid;
        return jid;
    }
    String salary(String salary){
        String sal = salary;
        return sal;
    }
    String doj( String doj){
        String dateofjoining = doj;
        return dateofjoining;
    }
}

class personal_details extends job_details{
    String name( String name){
        String nm = name;
        return nm;
    }
    int age(int age){
        int a = age;
        return a;
    }
    String gender( String gender){
        String gen = gender;
        return gen;
    }
}

class company_details extends personal_details{
    String cname(String cname){
        String cm = cname;
        return cm;
    }
    String registrationno(String regno){
        String rg = regno;
        return rg;
    }
    String address(String address){
        String ad = address;
        return ad;
    }
}

