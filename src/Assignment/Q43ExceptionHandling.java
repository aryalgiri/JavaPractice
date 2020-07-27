package Assignment;

public class Q43ExceptionHandling {
    public static void main(String[] args) {
        int numScore=2;
        int[] score=new int[numScore];
        score[0]=80;
        score[1]=60;
        try{
            score[numScore]=90;
        } catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("!!!!!!!");
            System.out.println("Array is out of bounds for new insertion");
            System.out.println("--------------------------------");
        }
        double avgScore= (double)(score[0]+score[1])/numScore;
        System.out.println("The average score is: "+ avgScore);
        try{
            avgScore=(double)(score[0]+score[1])/0.0;
        }catch(ArithmeticException ae){
            System.out.println("!!!!!!!!");
            System.out.println("Indefinite result: Denominator can not be zero");
            System.out.println("==================================");
        }
    }

}
