public class TestLoop{
    public static void main(String[] args) {
        Long creditCardInput = 4388576018402626L;
        Long creditCardInput2 = creditCardInput;
        Long creditCardInput3 = creditCardInput;
        int oddSum = 0;
        int evenSum = 0;

        while (creditCardInput > 0) {   //calculates the sum of every other digit from right to left ex. 1010101 = 4
            System.out.print(creditCardInput % 10 + ", ");
            oddSum += creditCardInput % 10; //returns the remainder when credit card number is divided by 10 (last digit)
            creditCardInput /= 100; //skips two digits from right to left
        }
        System.out.println(oddSum);

        while (creditCardInput2 > 0) {   //calculates the sum of every other second digit from right to left ex. 1010101 = 0
            double evenSingleDigit = (2 * Math.floor((creditCardInput2 % 100) / 10)); //divide by 10 then floor it
            System.out.print(evenSingleDigit + ", ");

            //if evenSingleDigit is two digits, add each digit together
            if (evenSingleDigit > 9) { 
                evenSingleDigit = (evenSingleDigit - 10) + 1;
            }
            evenSum += evenSingleDigit;
            creditCardInput2 /= 100;
        }
        System.out.println(evenSum);

        int totalSum = evenSum + oddSum;
        System.out.println(evenSum + " + " + oddSum + " = " + totalSum);
	
        //check that totalSum variable from Luhn check is divisible by 10 (valid); if not, credit card is invalid (4388576018402626 is invalid & 4388576018410707 is valid)
        if ((totalSum % 10) == 0) {
            System.out.print(creditCardInput3 + " is a valid" + " credit card.");
        }
        else {
            System.out.print(creditCardInput3 + " is an invalid" + " credit card.");
        }
    }    
}