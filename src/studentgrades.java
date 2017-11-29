public class studentgrades {
    public static void main(String[] args){
        final int num_students = 100;

        boolean[] failing = new boolean[num_students];
        boolean[] passing = new boolean[num_students];
        int[] score = new int[num_students];
        int[] freq = new int[num_students + 1];

        int counter = 0;

        while(counter < failing.length){
            failing[counter] = false;
            counter++;
        }

        counter = 0;

        while(counter < score.length){
            score[counter] = (int)(Math.random() * 101);
            System.out.println("Score " + (counter + 1) + ": " + score[counter]);
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

        while(counter < num_students) {
            holder = score[counter];
            largest = Math.max(holder, largest);
            counter++;
        }

        System.out.println();
        System.out.println("Largest Score: " + largest);
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

        System.out.println("Average of Scores: " + (sum/100));
    }
}
