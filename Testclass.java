public class Testclass {
    public Address getaddress(Student s, School c, Teacher t) {

        Address add = new Address(25_12, "kphp", "hyd");
        Address add1=new Address(23,"madhapur","secunderabad");

        Address a1=new Address(15/23,"gandhi center","nandigama");
        Address a2=new Address(17/28,"pragathi nagar","vjd");

        Student stu = new Student("nani", 1, add1);
        School sc = new School("kakatiya", 5, add);
        Teacher tea = new Teacher("aruna", 1234567890, a2);

        if (s != null) {
            if (s.getRollno() == stu.getRollno()) {
                return stu.getAddress();

            } else {
                return null;
            }
        }
            if (c != null) {
                if (c.getClassrooms() == sc.getClassrooms()) {
                    return sc.getAddress();

                } else {
                    return null;
                }
            }
            if (t != null) {
                if (t.getTeachername() == tea.getTeachername()) {
                    return tea.getAddress();
                } else {
                    return null;
                }
            }
            return null;
        }


        public static void main (String[]args){
            Testclass test = new Testclass();
            Student s1 = new Student("nani", 1, null);
            School c1 = new School("kakatiya", 5, null);
            Teacher t1 = new Teacher("aruna", 1234567890, null);

            System.out.println(test.getaddress(null,null,t1));



        }
    }




