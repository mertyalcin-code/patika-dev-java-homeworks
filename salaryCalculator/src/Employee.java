public class Employee {
    String name;
    double salary,workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if(this.salary<1000){
            return 0;
        }
        else {
            return this.salary*0.03;
        }
    }
    public double bonus(){
        if(this.workHours>40){
            return (workHours-40)*30;
        }
        else return 0;
    }
    public double raiseSalary(){
        if((2022-this.hireYear)<10){
           return this.salary*0.05;
        }
        else if((2022-this.hireYear)>=10 && (2022-this.hireYear)<20){
            return this.salary*0.10;
        }
        else{
            return this.salary*0.15;
        }
    }
    public void info(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Maaş Artışı: "+this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: "+(this.salary+this.bonus()-this.tax()));
        System.out.println("Toplam Maaş: "+(salary+raiseSalary()));
    }

}
