public class Teacher {
    private String Teachername;
    private int phonenumber;
    private Address address;

    public Teacher(String Teachername,int phonenumber,Address address){
        this.Teachername=Teachername;
        this.phonenumber=phonenumber;
        this.address=address;

    }

    public String getTeachername() {
        return Teachername;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public Address getAddress() {
        return address;
    }
}
