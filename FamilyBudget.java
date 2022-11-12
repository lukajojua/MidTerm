import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {
    private double money;


    public FamilyBudget(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
        WriteInFile();
    }

    public String  getStatus(){
        String status="";
        if (money>4000){
            status="Rich";
        }
        if (10000>money&money<=4000){
            status="Average";
        }
        else status="Poor";
        return status;
    }

    public void WriteInFile(){
        File file=new File("budget.txt");
        try (FileWriter fileWriter=new FileWriter(file)){
            fileWriter.write(getStatus());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
//დაწერეთ მეთოდი, რომელიც დაადგენს FamilyBudget მდგომარეობას money თვისების
//მიხედვით. (თუ money მეტია 40000-ზე მდიდარი, თუ მოთავსებულია 10000-დან 40
//000-მდე საშუალო, წინააღმდეგ შემთხვევაში ღარიბი).
