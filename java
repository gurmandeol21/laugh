import java.util.Scanner;
 public class Main {
 static Scanner input = new Scanner (System.in);
 public static void main(String[] args) {
 intro();
 int numcorrect = 0;
 int answer;
 System.out.println("Welcome to envoirnmental travia");
 System.out.println("What should you do when you want to throw your device away");
 System.out.println("1 throw it in the garbage");
 System.out.println("2 recyle it");
 System.out.println("3 do nothing");
 answer = input.nextInt();
 if(answer == 2)
 {
 System.out.println("correct");
 numcorrect += 1;
 }
 else
 System.out.println("Wrong correct answer was 2");
 System.out.println("Why is it unsafe to throw electronics in the garbage");
 System.out.println("1 because chemicals will get released that will harm the air and soil");
 System.out.println("2 Its not bad there will be no diffrence");
 System.out.println("3 Why do I care");
 answer = input.nextInt();
 if(answer == 1)
 {
 System.out.println("correct");
 numcorrect += 1;
 }
 else
 System.out.println("Wrong correct answer was 1");
 System.out.println("Are all computers and electroninc devices bad for the envoirnment");
 System.out.println("1 Yes");
 System.out.println("2 kinda");
 System.out.println("3 no because some devices help the envoirnment like the envirbot which helps with ocean pollution by cleaning the ocean from any metal plastic because it detects contamination and finds the source by swimming");
 answer = input.nextInt();
 if(answer == 3)
 {
 System.out.println("correct");
 numcorrect += 1;
 }
 else
 System.out.println("Wrong correct answer was 3");
 int totalQuestions = 3;
 double score = (100*numcorrect)/ totalQuestions;
 System.out.println(" You scored " +score+ "%" );
 }
 public static void intro(){
 System.out.println("Welcome to the facts about the envoirnment");
 String Fact;
 String answer;
 boolean yn;
 System.out.println("Enter a fact about the envoirnment");
 Fact = input.nextLine();
 System.out.println("You entered " +Fact);
 System.out.println("Did you know there are aproximatly 50 miilon tons of waste every year Did you know this fact or not enter yes or no");
 String [] classList = new String [8];
    System.out.println("please visit these links for more info");
 classList[1] = "https://www.ewaste1.com/what-is-e-waste/";
 System.out.println(classList[1]);
 classList[2] = "https://www.toronto.ca/services-payments/recycling-organics-garbage/electronic-waste/";
System.out.println(classList[2]);
classList[3] = "https://earth911.com/eco-tech/e-waste-why-you-should-recycle-electronics/";
System.out.println(classList[3]);
System.out.println("yes/no");
while (true) {
 answer = input.nextLine().trim().toLowerCase();
 if (answer.equals("yes")) {
   System.out.println("Congrats you know this fact");
   yn = true;
   break;
 } else if (answer.equals("no")) {
   System.out.println("Sorry you didnt know this fact at least you know now");
   yn = false;
   break;
 } else {
    System.out.println("Please enter Yes or NO");
//My program represents environmental caring
 }
}
}
 }
