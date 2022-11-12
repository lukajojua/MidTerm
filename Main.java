public class Main {
    public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.setValue(-50,10);
        System.out.println(classA);
        System.out.println(classA.getLessThanIndex());
        System.out.println(classA.getMoreThanIndex());
        FamilyBudget familyBudget=new FamilyBudget(200);
        FamilyMember familyMember=new FamilyMember("Luka","Jojua",20,"Average");
        familyMember.getMoney(familyBudget,100);
    }



}
