package task_02;

public class Employee {
     static int base_salary = 60000;

    void calculate_salary(){
        System.out.println(this.base_salary);;
    }

}

class Manager extends Employee{

    int bonus_salary ;

    Manager(int bonus_salary){
        this.bonus_salary=bonus_salary;
    }

    void calculate_salary(){
        System.out.println(super.base_salary+bonus_salary); ;

    }


}




class Worker extends Employee {

int deduction;

Worker(int deduction){
    this.deduction=deduction;
}

    void calculate_salary(){
        System.out.println(super.base_salary-deduction); ;

    }


}

 class Main{
     public static void main(String[] args) {
         Employee asim = new Employee();
         Worker Waqar = new Worker(3000);
         Manager hasan = new Manager(50000);

         asim.calculate_salary();
         Waqar.calculate_salary();
         hasan.calculate_salary();




     }
}



