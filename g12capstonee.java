import java.util.Scanner;
import java.util.ArrayList;

public class g12capstonee {

public static void signIn(ArrayList<String> bUser, ArrayList<String> bPass, Scanner in) {
        String signinUser; 
        String signinPass;

    System.out.printf("You Choose Sign In, Fil up the Following: ");

    System.out.print("\n\nEnter your New username: ");
    signinUser = in.next();
    System.out.print("Enter your New password: ");
    signinPass = in.next();

    bUser.add(signinUser);
    bPass.add(signinPass);

    System.out.printf("Congratulations! You are Successfully Sign In!");

}

public static boolean loginIN(ArrayList<String> bUser, ArrayList<String> bPass, Scanner in){
        String loginUser;  
        String loginPass;

        bUser.add("rey");
        bPass.add("teo");

        System.out.println("Welcome to Log In, Fill up the Following: ");
        System.out.print("\nUsername: ");
        loginUser = in.next();
        System.out.print("Password: ");
        loginPass = in.next();

        for (int i=0; i < bUser.size(); i++) {
        if (bUser.get(i).equals(loginUser) && bPass.get(i).equals(loginPass)) {
            System.out.println("\nCongratulations! You are Successfully Log In!");
            return true;
        }
    }
         System.out.println("\nInvalid Username or Password. Please Try again");
            return false;
}

        
        public static void main(String[] args) {
            System.err.println("\nWELCOME TO OUR STUDENT MANAGEMENT SYSTEM! PLEASE SIGN IN OR LOG IN TO CONTINUE");

            String firstname,lastname,section;
            int fsub =0, secsub =0, tsub =0, fosub =0, fifthsub =0;
            int grade,echoice,dchoices;
            int numberofchoice,updatechoice;

            ArrayList<String> new_bUser = new ArrayList<String>();
            ArrayList<String> new_bPass = new ArrayList<String>();

            ArrayList<String> new_firstname = new ArrayList<String>();
            ArrayList<String> new_lastname = new ArrayList<String>();
            ArrayList<Integer>new_grade = new ArrayList<Integer>();
            ArrayList<String> new_section = new ArrayList<String>();
            ArrayList<Integer>new_fsub = new ArrayList<Integer>();
            ArrayList<Integer>new_secsub = new ArrayList<Integer>();
            ArrayList<Integer>new_tsub = new ArrayList<Integer>();
            ArrayList<Integer>new_fosub = new ArrayList<Integer>();
            ArrayList<Integer>new_fifthsub = new ArrayList<Integer>();

            new_firstname.add("CzeanRey");
            new_lastname.add("Mateo");
            new_grade.add(12);
            new_section.add("Icon");
            new_fsub.add(89);
            new_secsub.add(90);
            new_tsub.add(94);
            new_fosub.add(95);
            new_fifthsub.add(89);

            new_firstname.add("Luis Enegue");
            new_lastname.add("Vidal");
            new_grade.add(12);
            new_section.add("Icon");
            new_fsub.add(89);
            new_secsub.add(90);
            new_tsub.add(94);
            new_fosub.add(95);
            new_fifthsub.add(89);

            Scanner in = new Scanner(System.in);
            boolean yourLoggedIn = false;

            while (true){
            System.out.println("\n[1] Sign in");
            System.out.println("[2] Log in");
            System.out.println("[3] Log Out");

            System.out.printf("\nEnter Choice: ");
            echoice = in.nextInt();
            
            switch (echoice){
            case 1: //for sign in
            signIn (new_bUser, new_bPass, in);
            break;
            case 2: //for log in
            yourLoggedIn =  loginIN (new_bUser,new_bPass, in);
            if (yourLoggedIn)
            
            do {

            System.out.println("\n[1] Add Student");
            System.out.println("[2] Display Student");
            System.out.println("[3] Update Student");
            System.out.println("[4] Delete Student");
            System.out.println("[5] Log Out\n");

            System.out.printf("Enter your Choice: ");
            dchoices = in.nextInt();
            in.nextLine(); 

            switch (dchoices) {
                case 1: // 
            System.out.println("You Choose Add Student, Fill up the Following:\n");

            System.out.print("Enter Student First Name: ");
            firstname = in.nextLine(); 

            System.out.print("Enter Student Last Name: ");
            lastname = in.nextLine();

            System.out.print("Enter Student Grade Level (11-12): ");
            grade = in.nextInt(); 

            System.out.print("Enter Student Section: ");
            in.nextLine(); 
            section = in.nextLine();

            System.out.print("Enter 1st Subject Grade: ");
            fsub = in.nextInt();

            System.out.print("Enter 2nd Subject Grade: ");
            secsub = in.nextInt();

            System.out.print("Enter 3rd Subject Grade: ");
            tsub = in.nextInt();

            System.out.print("Enter 4th Subject Grade: ");
            fosub = in.nextInt();

            System.out.print("Enter 5th Subject Grade: ");
            fifthsub = in.nextInt();

            new_firstname.add(firstname);
            new_lastname.add(lastname);
            new_grade.add(grade);
            new_section.add(section);
            new_fsub.add(fsub);
            new_secsub.add(secsub);
            new_tsub.add(tsub);
            new_fosub.add(fosub);
            new_fifthsub.add(fifthsub);

            System.out.printf("\nCongratulations! You are Successfully Add a Student!\n");
            System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n","NO", "FIRSTNAME", "LASTNAME", "GRADE", "SECTION", "FINAL AVERAGE");
            for (int i = 0; i < new_firstname.size(); i++) {
            double finalaverage = (new_fsub.get(i) +new_secsub.get(i) +new_tsub.get(i) +new_fosub.get(i) +new_fifthsub.get(i)) / 5.0;
            System.out.printf("%-5d %-15s %-15s %-10d %-15s %-15.2f\n",(i + 1), new_firstname.get(i),new_lastname.get(i),new_grade.get(i),new_section.get(i),finalaverage);
            }
            break;
                
            case 2://Display students
            System.out.println("Display Student! See the Student List Below\n");
            System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n","NO", "FIRSTNAME", "LASTNAME", "GRADE", "SECTION", "FINAL AVERAGE");
            for (int i = 0; i < new_firstname.size(); i++) {
            double finalaverage = (new_fsub.get(i) +new_secsub.get(i) +new_tsub.get(i) +new_fosub.get(i) +new_fifthsub.get(i)) / 5.0;
            System.out.printf("%-5d %-15s %-15s %-10d %-15s %-15.2f\n",(i + 1), new_firstname.get(i),new_lastname.get(i),new_grade.get(i),new_section.get(i),finalaverage);
            }
            break;
                
            case 3://Update students
            System.out.println("You Choose Update Student!\n");
            System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n","NO", "FIRSTNAME", "LASTNAME", "GRADE", "SECTION", "FINAL AVERAGE");
            for (int i = 0; i < new_firstname.size(); i++) {
            double finalaverage = (new_fsub.get(i) +new_secsub.get(i) +new_tsub.get(i) +new_fosub.get(i) +new_fifthsub.get(i)) / 5.0;
            System.out.printf("%-5d %-15s %-15s %-10d %-15s %-15.2f\n",(i + 1), new_firstname.get(i),new_lastname.get(i),new_grade.get(i),new_section.get(i),finalaverage);
            }
            System.out.printf("\nEnter a number of student you want to update: ");
            dchoices = in.nextInt();

            System.out.println("Here's a number of field ");
            System.out.printf("\n[1] First Name ");
            System.out.printf("\n[2] Last Name");
            System.out.printf("\n[3] Grade Level ");
            System.out.printf("\n[4] Section ");
            System.out.printf("\n[5] 1st Subject Grade ");
            System.out.printf("\n[6] 2nd Subject Grade ");
            System.out.printf("\n[7] 3rd Subject Grade ");
            System.out.printf("\n[8] 4th Subject Grade ");
            System.out.printf("\n[9] 5th Subject Grade ");

            System.out.print("\n\nEnter a number of field you want to update: ");
            updatechoice = in.nextInt();
            in.nextLine(); 

            if (updatechoice == 1) {
                System.out.print("Enter New First Name: ");
                firstname = in.nextLine();
                new_firstname.set(dchoices - 1, firstname);
            }
            else if(updatechoice == 2){
                System.out.print("Enter New Last Name: ");
                lastname = in.nextLine();
                new_lastname.set(dchoices - 1, lastname);
            }
            else if(updatechoice == 3){
                System.out.print("Enter New Grade Level: ");
                grade = in.nextInt();
                new_grade.set(dchoices - 1, grade);
            }
            else if(updatechoice == 4){
                in.nextLine(); 
                System.out.print("Enter New Section: ");
                section = in.nextLine();
                new_section.set(dchoices - 1, section);
            }
            else if(updatechoice == 5){
                System.out.print("Enter New 1st Subject Grade: ");
                fsub = in.nextInt();
                new_fsub.set(dchoices - 1, fsub);
            }
            else if(updatechoice == 6){
                System.out.print("Enter New 2nd Subject Grade: ");
                secsub = in.nextInt();
                new_secsub.set(dchoices - 1, secsub);
            }
            else if(updatechoice == 7){
                System.out.print("Enter New 3rd Subject Grade: ");
                tsub = in.nextInt();
                new_tsub.set(dchoices - 1, tsub);
            }
            else if(updatechoice == 8){
                System.out.print("Enter New 4th Subject Grade: ");
                fosub = in.nextInt();
                new_fosub.set(dchoices - 1, fosub);
            }
            else if(updatechoice == 9){
                System.out.print("Enter New 5th Subject Grade: ");
                fifthsub = in.nextInt();
                new_fifthsub.set(dchoices - 1, fifthsub);
            }
            System.out.println("\nYou Successfully Update a Student! Here's the Updated Student List\n");
            System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n","NO", "FIRSTNAME", "LASTNAME", "GRADE", "SECTION", "FINAL AVERAGE");
            for (int i = 0; i < new_firstname.size(); i++) {
            double finalaverage = (new_fsub.get(i) +new_secsub.get(i) +new_tsub.get(i) +new_fosub.get(i) +new_fifthsub.get(i)) / 5.0;
            System.out.printf("%-5d %-15s %-15s %-10d %-15s %-15.2f\n",(i + 1), new_firstname.get(i),new_lastname.get(i),new_grade.get(i),new_section.get(i),finalaverage);
            }
            break;
                    
            case 4://Delete Students
            System.out.println("You Choose Delete Student! See the student list below\n");
            System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n","NO", "FIRSTNAME", "LASTNAME", "GRADE", "SECTION", "FINAL AVERAGE");
            for (int i = 0; i < new_firstname.size(); i++) {
            double finalaverage = (new_fsub.get(i) +new_secsub.get(i) +new_tsub.get(i) +new_fosub.get(i) +new_fifthsub.get(i)) / 5.0;
            System.out.printf("%-5d %-15s %-15s %-10d %-15s %-15.2f\n",(i + 1), new_firstname.get(i),new_lastname.get(i),new_grade.get(i),new_section.get(i),finalaverage);
            }
                    
            System.out.printf("\nEnter a number of student you want to delete: ");
            numberofchoice = in.nextInt();

            new_firstname.remove(numberofchoice - 1);
            new_lastname.remove(numberofchoice - 1);
            new_grade.remove(numberofchoice - 1);
            new_section.remove(numberofchoice - 1);
            new_fsub.remove(numberofchoice - 1);
            new_secsub.remove(numberofchoice - 1);
            new_tsub.remove(numberofchoice - 1);
            new_fosub.remove(numberofchoice - 1);
            new_fifthsub.remove(numberofchoice - 1);

            System.out.println("\nYou Successfully Delete a Student! Here's the Updated Student List\n");
            System.out.printf("%-5s %-15s %-15s %-10s %-15s %-15s\n","NO", "FIRSTNAME", "LASTNAME", "GRADE", "SECTION", "FINAL AVERAGE");
            for (int i = 0; i < new_firstname.size(); i++) {
            double finalaverage = (new_fsub.get(i) +new_secsub.get(i) +new_tsub.get(i) +new_fosub.get(i) +new_fifthsub.get(i)) / 5.0;
            System.out.printf("%-5d %-15s %-15s %-10d %-15s %-15.2f\n",(i + 1), new_firstname.get(i),new_lastname.get(i),new_grade.get(i),new_section.get(i),finalaverage);
            }        
            break;

            //switch
            case 5:
            yourLoggedIn = false;
            System.out.println("You Successfully Log Out! See you again!");
            break;
             }

            }while (yourLoggedIn);
            break;
            case 3: //fpor exit
            System.exit(0);
                in.close();
                break;
        }// for switch dchoice

    }
}
}