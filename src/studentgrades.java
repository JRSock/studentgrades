import java.util.Scanner;

public class studentgrades {
    public static void main(String[] args){
        int num_students = 0;
        Scanner sc1 = new Scanner(System.in);

        System.out.print("How many scores would you like to calculate: ");
        num_students = sc1.nextInt();

        boolean[] failing = new boolean[num_students];
        boolean[] passing = new boolean[num_students];
        int[] score = new int[num_students];
        int[] freq = new int[num_students + 1];
        String[] names = new String[num_students];

        int counter = 0;
        Scanner sc2 = new Scanner("scores.dat");

        while(counter < score.length){
            score[counter] = sc2.nextInt();
            counter++;
        }

        counter = 0;
        Scanner sc3 = new Scanner("names.dat");

        while(counter < score.length){
            names[counter] = sc3.nextLine();
            System.out.println(names[counter] + " got a " + score[counter]);
            counter++;
        }

        counter = 0;

        while(counter < num_students){
            if(score[counter] < 60){
                failing[counter] = true;
            }
            else{
                passing[counter] = true;
            }
            counter++;
        }

        counter = 0;
        int holder = 0;

        while(counter < 50){
            holder = score[counter];
            score[counter] = score[99-counter];
            score[99-counter] = holder;
            counter++;
        }

        counter = 0;
        int largest = 0;
        int largestpos = 0;

        while(counter < num_students) {
            holder = score[counter];
            largest = Math.max(holder, largest);
            if(largest == holder){
                largestpos = counter;
            }
            counter++;
        }

        System.out.println();
        System.out.println(names[largestpos] + " had the highest score in the class with a " + score[largestpos]);
        int sum = 0;
        counter = 0;

        while(counter < num_students){
            sum = score[counter] + sum;
            counter++;
        }

        counter = 0;

        while(counter < 100){
            freq[score[counter]]++;
            counter++;
        }

        counter = 0;
        largest = 0;
        int freqpos = 0;

        while(counter < num_students){
            holder = freq[counter];
            largest = Math.max(holder, largest);
            if(largest == holder){
                freqpos = counter;
            }
            counter++;
        }
        System.out.println("Average of Scores: " + (sum/100));
        System.out.println("Most Frequent Score: " + score[freqpos]);
    }
}
