package com.demo.Maven;

/**
 * Hello world!
 */
public class App {
	
	public void fraction(Fraction f1, Fraction f2) {
	    Fraction result = f1.add(f2);
	    System.out.println("Result: " + result);
	}

	
	
	public static void main(String[] args) throws InsufficientFundsException {
		System.out.println("Hello World!");
//		Employee e = new Employee();
//		e.setEmp_ID(10);
//		e.setEmpName("washh");
//		e.setDesg("IT");
//		e.setMob("214335");
//
//		System.out.println(e);
//
//	SavingsAccount sa = new SavingsAccount("Alice", 1234567890L, "HDFC Bank", "HDFC0001234", 5000, 5);
//        sa.deposit(2000);
//        sa.addInterest();
//        sa.withdraw(3000);
//
//        System.out.println();
//
        CurrentAccount ca = new CurrentAccount("Bob", 9876543210L, "ICICI Bank", "ICIC0005678", 10000, 5000);
        ca.withdraw(12000); 
        ca.withdraw(200000);
        System.out.println(ca.getBalance());
//        
//        
//        
//		Fraction f1 = new Fraction(1, 2);  
//        Fraction f2 = new Fraction(1, 3);  
//
//        Fraction result = f1.add(f2);
//        System.out.println("Sum = " + result); 
    }
        
        
        
        
        

}
