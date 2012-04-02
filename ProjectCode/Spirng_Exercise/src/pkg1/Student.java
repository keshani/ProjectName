
package pkg1;

public class Student {
       private String firstName;
	private String lastName;
	private long regNumber;
	private String address;

        

    public Student(String firstName, String lastName, long regNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
        this.address = address;
    }
       public long getRegNo(){
           return regNumber;
       }

       public String getFirstName(){
           return firstName;
       }

       public String getLastName(){
           return lastName;
       }

       public String getAddress(){
           return address;
       }

}
