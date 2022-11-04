public class WhileLoopFun {

    public WhileLoopFun() {
    }

    public void printDigits(int number) {
        int num2 = number;
        if (number % 10 == number) {
            System.out.println(number);
        } else {
            while (number != 0) {
                num2 = number % 10;
                System.out.println(num2);
                number /= 10;
            }
        }
    }

    public int countLetter(String word, String letter) {
        int count = 0;
        while (word.indexOf(letter) != -1) {
            word = word.replaceFirst(letter, "");
            count++;
            if (word.length() == 0) {
                return count;
            }
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int count = 0;
        while (number * 2 <= threshold) {
                number = number * 2;
                count ++;
            }
        return count;
        }

    public boolean isPrime(int number) {
        if(number == 2){
            return true;
        }
        if(number == 1) {
            return false;
        }
        if(number % 2 != 0 && number % 3 !=0 && number % 5!= 0) {
            return true;
        } else {
            return false;
        }
    }
}


