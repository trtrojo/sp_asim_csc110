import java.util.Scanner;
 
 /* BMICalc.java -- Calculates BMI of 10 different people.
  *
  *  Nightmare Moon <luna@canterlot.eq> (CHANGE THIS!!!!!)
  *
  * --- Cut/Paste from blackboard ---
  *  Create an array object of Person with size 10
  *  Insert all your 10 objects in the array
  *  Iterate over your array using a for loop. Use the height and weight of
  *   each person and calculate his/her BMI and store the value of BMI inside
  *   that person.
  *
  *  Inside the other loop check the BMI of each person and for those who are
  *   obese print a message "X is obese"
  *
  *  You may reuse your old code for BMI.
  *
  *  For thinkers: Check to see if you can use methods.
  *
  *  --- End. ---
  *
  */

public class BMICalc {

	public static void main(String[] args) {

		Scanner kInput = new Scanner(System.in);


		System.out.println("Assignment 4 - BMI Calculator for 10 people");

		Person[] subjects = new Person[10];

		//Creating the array getting input from the user.
		//
		//Array is called subjects[]
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the name of the person: ");
			String name = kInput.nextLine();

			System.out.print("Enter the height, in inches, of the person: ");
			double height = kInput.nextDouble();

			System.out.print("Enter the weight, in pounds, of the person: ");
			double weight = kInput.nextDouble();

			//This is needed because nextDouble next to a nextLine
			// does not work as expected.
			//
			//https://stackoverflow.com/q/27141183
			kInput.nextLine();

			//Create a new object from the questions above.
			subjects[i] = new Person(name, height, weight);

		}

		//Person asiam = new Person("Asia Simmons", 61.2, 170);
		//System.out.println(asiam.getBMI());


		for (int i = 0; i < 10; i++) {
			if (subjects[i].getBMI() < 30) { 
				System.out.println("Weight of " + subjects[i].getName() + " is normal");
			}
		}

		for (int i = 0; i < 10; i++) {
			if (subjects[i].getBMI() > 30.0) {
				System.out.println("Weight of " + subjects[i].getName() + " is obese");
			}
		}

		

	}

}

class Person {
	
	String name;
	double height;
	double weight;
	double bmi;
	
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = ((weight * 703) / (height * height));
	}

	public double getBMI() {
		return this.bmi;
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

}

