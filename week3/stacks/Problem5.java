package week3.stacks;

public class Problem5 {
    public static int start(int[] petrol, int[] distance){
        int surplus = 0;
        int index = 0;
        int currentSurplus = 0;
        for(int i=0; i<petrol.length; i++){
            int gain = petrol[i] - distance[i];
            surplus += gain;
            currentSurplus += gain;

            if(surplus<0){
                index++;
                currentSurplus=0;
            }
        }
        return (surplus>=0)? index: -1;
    }

    public static void main(String[] args){
        int[] petrol = {4, 5, 2, 7};
        int[] distance = {1, 5, 7, 3};
        int start = start(petrol, distance);
        if(start != -1){
            System.out.println("starts at: "+start);
        }
        else{
            System.out.println("no solution");
        }
    }
}
