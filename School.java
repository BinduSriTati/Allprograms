public class School {
    private String Schoolname;
    private int classrooms;
    private Address address;

    public String getSchoolname() {
        return Schoolname;
    }

    public int getClassrooms() {
        return classrooms;
    }

    public Address getAddress() {
        return address;
    }
    public School(String schoolname,int classrooms,Address address){
        this.Schoolname=schoolname;
        this.classrooms=classrooms;
        this.address=address;
    }
}
