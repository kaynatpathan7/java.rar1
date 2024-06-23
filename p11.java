import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Find an entry by ID");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter address:");
                    String address = scanner.nextLine();
                    System.out.println("Enter telephone number:");
                    String telephoneNumber = scanner.nextLine();
                    System.out.println("Enter mobile number:");
                    String mobileNumber = scanner.nextLine();
                    System.out.println("Enter head of family:");
                    String headOfFamily = scanner.nextLine();
                    System.out.println("Enter unique ID:");
                    String uniqueId = scanner.nextLine();
                    Person newPerson = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueId);
                    directory.addEntry(newPerson);
                    break;
                case 2:
                    System.out.println("Enter unique ID of the person to edit:");
                    String editUniqueId = scanner.nextLine();
                    Person person = directory.findPersonById(editUniqueId);
                    if (person != null) {
                        System.out.println("Enter new name:");
                        name = scanner.nextLine();
                        System.out.println("Enter new address:");
                        address = scanner.nextLine();
                        System.out.println("Enter new telephone number:");
                        telephoneNumber = scanner.nextLine();
                        System.out.println("Enter new mobile number:");
                        mobileNumber = scanner.nextLine();
                        System.out.println("Enter new head of family:");
                        headOfFamily = scanner.nextLine();
                        Person newDetails = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, editUniqueId);
                        directory.editEntry(editUniqueId, newDetails);
                    } else {
                        System.out.println("Person not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter unique ID of the person to find:");
                    String findUniqueId = scanner.nextLine();
                    person = directory.findPersonById(findUniqueId);
                    if (person != null) {
                        System.out.println(person);
                    } else {
                        System.out.println("Person not found!");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static class Person {
        private String name;
        private String address;
        private String telephoneNumber;
        private String mobileNumber;
        private String headOfFamily;
        private String uniqueId;

        public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueId) {
            this.name = name;
            this.address = address;
            this.telephoneNumber = telephoneNumber;
            this.mobileNumber = mobileNumber;
            this.headOfFamily = headOfFamily;
            this.uniqueId = uniqueId;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getTelephoneNumber() {
            return telephoneNumber;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public String getHeadOfFamily() {
            return headOfFamily;
        }

        public String getUniqueId() {
            return uniqueId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setTelephoneNumber(String telephoneNumber) {
            this.telephoneNumber = telephoneNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public void setHeadOfFamily(String headOfFamily) {
            this.headOfFamily = headOfFamily;
        }

        public void setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", telephoneNumber='" + telephoneNumber + '\'' +
                    ", mobileNumber='" + mobileNumber + '\'' +
                    ", headOfFamily='" + headOfFamily + '\'' +
                    ", uniqueId='" + uniqueId + '\'' +
                    '}';
        }
    }

    static class Directory {
        private List<Person> persons;

        public Directory() {
            persons = new ArrayList<>();
        }

        public void addEntry(Person person) {
            persons.add(person);
        }

        public void editEntry(String uniqueId, Person newDetails) {
            for (Person person : persons) {
                if (person.getUniqueId().equals(uniqueId)) {
                    person.setName(newDetails.getName());
                    person.setAddress(newDetails.getAddress());
                    person.setTelephoneNumber(newDetails.getTelephoneNumber());
                    person.setMobileNumber(newDetails.getMobileNumber());
                    person.setHeadOfFamily(newDetails.getHeadOfFamily());
                    person.setUniqueId(newDetails.getUniqueId());
                    break;
                }
            }
        }

        public Person findPersonById(String uniqueId) {
            for (Person person : persons) {
                if (person.getUniqueId().equals(uniqueId)) {
                    return person;
                }
            }
            return null;
        }
    }
}