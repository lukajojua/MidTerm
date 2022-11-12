public class FamilyMember {
    private String name;
    private String lastName;
    private int age;
    private String status;

    public FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void getMoney(FamilyBudget familyBudget, double amount){
        double familyMemberBalance=0;
        if (amount>familyBudget.getMoney()){
            System.err.println("amount>balance ");
        }
        else {
            System.out.println(name+" "+"got"+" "+(familyMemberBalance+amount)+" "+"from family budget");

        }




    }
}
