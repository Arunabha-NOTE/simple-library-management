import java.util.*;

public class librarymain {
    public static void main(String[] args) {
        List<String> book = new ArrayList<>(); //creating a list of books
        book.add("Introduction to algorithms");
        book.add("Java the complete reference");
        book.add("Cracking the coding interview");
        book.add("Let us c");

        List<String> student = new ArrayList<>(); //creating a list of students
        student.add("Arunabha");
        student.add("Aryan");
        student.add("Anvit");

        List<String> librarian = new ArrayList<>(); //creating a list of librarians
        librarian.add("Pujan");
        librarian.add("Pranav");
        librarian.add("Jatan");

        System.out.println("Are you a student(1) or a librarian(2)"); //Asking user if its a student or librarian
        Scanner person = new Scanner(System.in); //scanner class used to take input
        int persontype = person.nextInt();
        person.nextLine();

        switch (persontype) {
            case 1:                   //switch statement for choices between student and librarian
                Scanner student1 = new Scanner(System.in);
                System.out.println("Enter student name");
                String Student1name = student1.nextLine();
                if (student.contains(Student1name)) {
                    System.out.println("What do you want to do: return a book(1) take a book(2) :");
                    Scanner studentchoice = new Scanner(System.in);
                    int choice1 = studentchoice.nextInt();
                    studentchoice.nextLine();
                    switch (choice1) {
                        case 1 :
                           System.out.println("Enter the number of books you want to return:");
                           Scanner noofbooks = new Scanner(System.in);
                           int noofbooks1 = noofbooks.nextInt();
                           noofbooks.nextLine();
                           int i1 = 1;
                           Scanner bookname = new Scanner(System.in);
                           while(i1 <= noofbooks1) {
                                System.out.println("Enter the name of the book:");
                                String bookname1 = bookname.nextLine();
                                book.add(bookname1);
                                i1 = i1 +1;
                           }
                           break;
                        case 2:
                           System.out.println("Which book do you want to take(1 at a time) :");
                           Scanner takebook = new Scanner(System.in);
                           String takebook1 = takebook.nextLine();
                            if (book.contains(takebook1)) {
                                book.remove(takebook1);
                            } else {
                                System.out.println("Book doesnt exist");
                                System.exit(1);
                            }
                           break;
                        default:
                            System.out.println("not a valid choice");
                            System.exit(1);
                    }
                } else {
                    System.out.println("not a valid user");
                    System.exit(1);
                }
                break;
            case 2:
                Scanner librarian1 = new Scanner(System.in);
                System.out.println("Enter librarian name");
                String librarian1name = librarian1.nextLine();
                if (librarian.contains(librarian1name)) {
                    System.out.println("What do you want to do : add new student(1) add books to inventory(2) remove book(3) :");
                    Scanner librarianchoice = new Scanner(System.in);
                    int librarianchoice1 = librarianchoice.nextInt();
                    switch (librarianchoice1) {
                        case 1:
                            System.out.println("How many students do you want to add");
                            Scanner studentadd = new Scanner(System.in);
                            int studentadd1 = studentadd.nextInt();
                            studentadd.nextLine();
                            int i3 = 1;
                            while (i3 <= studentadd1) {
                                System.out.println("Enter the name of student you want to add : ");
                                Scanner studentnameadd = new Scanner(System.in);
                                String studentnameadd1 = studentnameadd.nextLine();
                                student.add(studentnameadd1);
                                i3++;
                            }
                            break;
                        case 2:
                            System.out.println("How many books do you want to add : ");
                            Scanner bookadd = new Scanner(System.in) ;
                            int bookadd1 = bookadd.nextInt();
                            int i4 = 1;
                            while (i4 <= bookadd1) {
                                System.out.println("Enter the name of the book you want to add");
                                Scanner addbook = new Scanner(System.in);
                                String addbook1 = addbook.nextLine();
                                book.add(addbook1);
                                i4++;
                            }
                            break;
                        case 3:
                            System.out.println("how many books do you want to remove");
                            Scanner bookremove = new Scanner(System.in);
                            int bookremove1 = bookremove.nextInt();
                            bookremove.nextLine();
                            int i5 = 1;
                            while (i5 <= bookremove1) {
                                System.out.println("Enter the name of the book: ");
                                Scanner remove = new Scanner(System.in);
                                String remove1 = remove.nextLine();
                                if (book.contains(remove1)) {
                                    book.remove(remove1);
                                } else {
                                    System.out.println("Book doesnt exist");
                                    System.exit(1);
                                }
                                i5++;
                            }
                        default:
                            System.out.println("not a valid choice");
                            System.exit(1);
                    }
                } else {
                    System.out.println("Not a valid user");
                    System.exit(1);
                }
                break;
        }
        String[] array1 = student.toArray(new String[student.size()]);
        System.out.println("Current list of students: "+Arrays.toString(array1));
        String[] array2 = librarian.toArray(new String[librarian.size()]);
        String[] array = book.toArray(new String[book.size()]);
        System.out.println("Current librarian: "+Arrays.toString(array2));
        System.out.println("Current inventory: "+Arrays.toString(array));
        System.out.println("Thank you and have a great day.");
    }
}