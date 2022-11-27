public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours,int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax()
    {
        if(salary > 1000)
        {
            //System.out.println("Vergi: "+(salary*0.03));
            return (salary*0.03);
        }
        else
        {
            //System.out.println("Vergi: 0");
            return 0;
        }
    }

    public double bonus()
    {
        double bonus;
        if(workHours > 40)
        {
            bonus = workHours - 40;
            //System.out.println("Bonus: "+(30*bonus));
            return (30*bonus);
        }
        else
        {
            //System.out.println("Bonus yok...");
            return 0;
        }
    }

    public double raiseSalary()
    {
        double prizeAmount = 0;
        int dateDifference = 2021-hireYear;

        if (dateDifference<10)
        {
            prizeAmount = salary*0.05;
        }
        else if (dateDifference>9 && dateDifference<20)
        {
            prizeAmount = salary*0.10;
        }
        else if (dateDifference>19)
        {
            prizeAmount = salary*0.15;
        }
        return prizeAmount;
    }

    public String toString()
    {

        return "Calisan Ad Soyad    = " + name +
                "\nSalary              = " + salary +
                "\nWork hours          = " + workHours +
                "\nHire year           = " + hireYear +
                "\nTax                 = " + tax() +
                "\nBonus               = " + bonus() +
                "\nRaise salary        = " + raiseSalary() +
                "\nTotal salary        = " + (salary - tax() + bonus() + raiseSalary());
    }
}
