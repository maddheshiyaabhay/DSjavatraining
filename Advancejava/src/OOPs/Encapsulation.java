package OOPs;
//to print the student info
public class Encapsulation {
    public static void main(String[]args){
        //add the student info
        StudentProfile s = new StudentProfile();
        s.setName("Abhay");
        s.setEmail("abhay@gamail.com");
        s.setAdderess("Lucknow");
        s.setMobile(656556656);
        //get and the student info
        System.out.println(s.getName());
        System.out.println(s.getEmail());
        System.out.println(s.getAdderess());
        System.out.println(s.getMobile());


    }

}
class StudentProfile{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdderess() {
        return adderess;
    }

    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    String email;
    String adderess;
    long mobile;
}