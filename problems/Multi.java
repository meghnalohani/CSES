package problems;

public class Multi extends Thread{

    public void run(){
        //logic what the thread will do once its started 
        System.out.println("Thread is running");
    }

    public static void main(String[] args){
        Thread t1 = new Thread();
        t1.start(); //wait till this completes

    }
    
}
table A
empname empid 

table B
empid number 

select empname, empid from A inner join A
on B A.empid = B.empiId


SELECT *
FROM employees
JOIN departments ON employees.empid = departments.empid;
