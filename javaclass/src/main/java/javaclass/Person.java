package javaclass;

public class Person {
    
    private String firstName;
    private String lastName;
    private String documentNumber;
    private int birthYear;  

    public Person(String firstName, String lastName, String documentNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public int getBirthYear() {  
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setBirthYear(int birthYear) {  
        this.birthYear = birthYear;
    }

    public void displayInformation() {
        System.out.println("Nombre: " + firstName);
        System.out.println("Apellido: " + lastName);
        System.out.println("Número de Documento: " + documentNumber);
        System.out.println("Año de Nacimiento: " + birthYear);  
    }
}
