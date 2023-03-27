package QA15;

import java.security.cert.X509Certificate;

public class main {
    public static void main(String[] arg) {
        String[] firstName = {"Amine", " Badr ", "Hassan", " Hamid", " Mohammed"};
        String element ="Mom";
        int[] numberOFPeople = {1,2,3,4,5,6};
        int[] numberOFCars= {8,9,15,25,40,42};
    //Qa1
        System.out.println( getLastIndex(firstName));
//Qa2
        System.out.println(getSecondToLastIndex(firstName));
    //QA3
        System.out.println(getFirstElement(firstName));
//QA4
        System.out.println(getLastElement(firstName));
    //QA5
        System.out.println(getSecondToLastElement(firstName));

        //QA6
        System.out.println(getSum(numberOFPeople));
//QA7
        System.out.println(getAverage(numberOFPeople));
//QA8
       System.out.println(extractAllOddNumbers(numberOFPeople));
 //QA9
     System.out.println(extractAllEvenNumbers(numberOFPeople));
//QA10
        System.out.println(contains(firstName,element));
//QA11
        System.out.println(getIndexByElement(firstName,element));
 //QA12
printOddNumbersInRange(0,9);

    //QA13
        System.out.println(printGivenStringTimesNumberGiven("Manuel",4));
//QA14
        System.out.println(repeatFirstThreeLetters("mouad",2));

        //QA15
        System.out.println(wordsInAStringCounter("my friend watch videos on his cellphone every single time I've been with him "));
    }


    //Qa1
    public static int getLastIndex(String[] names) {

        return names.length-1 ;
    }
    //QA2
    public static int getSecondToLastIndex(String[] names) {
        int lastIndex = names.length-1;
        int secondTOLastIndex = lastIndex-1;
            return secondTOLastIndex;
    }
    //QA3
    public static String getFirstElement(String[] names) {

        return names[0];
    }

    //QA4
    public static String getLastElement(String[] names) {
        return names[names.length-1];
    }

    //QA5
    public static String getSecondToLastElement(String[] names) {
        return names[getSecondToLastIndex(names)];

}


    //QA6
    public static int getSum(int[] ints) {
        int Sum =0;
        for (int i:ints)Sum+=i;
        return Sum;
    }

    //Qa7
    public static int getAverage(int[] ints) {
        int Sum=0;
        for (int i:ints)Sum+=i;
        return Sum/ ints.length;
    }

    //QA8
    public static int extractAllOddNumbers(int[] numbers) {
        for ( int i = 0;i <= numbers.length; i++){
            if (i% 2!=0) return i;
        }  return 0;
    }

    // QA9
    public static int extractAllEvenNumbers(int[] numbers) {
        for ( int i = 0;i <= numbers.length; i++){
            if (i% 2==0) return i;}
        return 0;
    }

    //QA10
    public static boolean contains(String[] names, String element) {
        for (int i = 0; i< names.length;i++ ){
            if (names[i].equals(element)){
                return true;
            }
        }

        return false;
    }

    //QA11
    public static int getIndexByElement(String[] names, String element) {
        for (int i=0;i< names.length;i++){
            if (names[i].equals(element)){return i;
        }
        } return 0;
}


    //QA12
    public static void printOddNumbersInRange(int start, int end){
for (int i= start; i<= end;i++){
    if (i %2 !=0){
        System.out.println(i);
    }
}
    }

    //QA13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String results = "";
        for (int i =0 ; i < n ; i++)
            results +=str;

            return results;}

    //QA14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThree = str.substring(0, 3);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += firstThree;
        }

        return result;
    }

    //QA15
    public static int wordsInAStringCounter(String str){
        String[ ]WordsInAstring =str.split("\\s+");
        return WordsInAstring.length;
    }
















}
