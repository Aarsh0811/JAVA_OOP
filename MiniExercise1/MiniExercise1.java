//NAME: AARSH PARIMAL PATEL
//Mini Exercise-1
//Semester-2

import java.util.Scanner;
import java.lang.Math;
public class MiniExercise1 {
 
public static void main(String[] args) {
 
Task1();
 
Task2();
 
}
 
public static void Task1() {
 
Scanner scan = new Scanner(System.in);
 
System.out.print("How many elements would you like to create?");
 
int no = scan.nextInt();
 
Object arr[] = new Object[no];
 
for (int a = 0; a < no; a++) {
 
System.out.print("Enter the numeric value " + (a + 1) + " here:");
 
int x = scan.nextInt();
 
if (x == 0 |
| x == 1) {
 
//conversion to boolean
 
if (x == 0) {
 
boolean bool = false;
 
arr[a] = bool;
 
} else {
 
boolean bool = true;
 
arr[a] = bool;
 
}
 
}
 
//conversion to byte
 
else if (x >= -128 && x <= 127) {
 
byte b = (byte) x;
 
arr[a] = b;
 
//conversion to short
 
} else if (x >= -32768 && x <= 32767) {
 
short s = (short) x;
 
arr[a] = s;
 
//conversion to integer
 
} else if (x >= -2147483648 && x <= 2147483647) {
 
int i = (int) x;
 
arr[a] = i;
 
} else {
 
System.out.println("Error!
!
!");
 
}
 
}
 
for (Object numbers : arr) {
 
System.out.println(numbers);
 
}
}
 
public static void Task2() {
 
int[]
[] board = new int[10]
[10];
 
for (int r = 0; r < board.length; r++) {
 
for (int c = 0; c < board[r]
.length; c++) {
 
int new_r = r + 1;
 
int new_c = c + 1;
 
board[r]
[c] = new_r * new_c;
 
System.out.print(board[r]
[c] + "\t");
 
}
 
System.out.println();
 
}
 
Scanner scan = new Scanner(System.in);
 
System.out.print("How many questions would you like to answer?");
 
int no = scan.nextInt();
 
float ans_right = 0;
 
int ans_wrong = 0;
 
float ques = no;
 
for (int y = 0; y < no; y++) {
 
int no1 = (int) (Math.random() * 10+1);
 
int no2 = (int) (Math.random() * 10+1);
 
System.out.println("What is " + no1 + "*" + no2);
 
int multiply = scan.nextInt();
 
int ans = board[no1-1]
[no2-1];
 
if (multiply == ans) {
 
System.out.println("Bravo, your answer is correct!
!
!");
 
ans_right+=1;
 
} else {
 
System.out.println("Alas! Your answer is incorrect!
!
!" + "\n" + "The correct answer is " + ans);
 
}
 
}
 
System.out.println("End of the questionnaire");
 
float percent = (ans_right/ques)*100;
 
int rnd_percent = Math.round(percent);
 
System.out.println("You answered "+ans_right+" out of "+ ques);
 
System.out.println("That's the percentage of "+rnd_percent+"%");
 
}
}
