public class PlusOne {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    return digits;
                }
            }

            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

        public static void main(String[] args) {
            PlusOne solution = new PlusOne();

            // Test case 1: Normal case
            int[] digits1 = {1,2,3};
            int[] result1 = solution.plusOne(digits1);
            System.out.print("Result 1: ");
            for (int digit : result1) {
                System.out.print(digit);
            }
            System.out.println();

            // Test case 2: Case with carry over
            int[] digits2 = {4,3,2,1};
            int[] result2 = solution.plusOne(digits2);
            System.out.print("Result 2: ");
            for (int digit : result2) {
                System.out.print(digit);
            }
            System.out.println();

            // Test case 3: Case with all nines
            int[] digits3 = {9};
            int[] result3 = solution.plusOne(digits3);
            System.out.print("Result 3: ");
            for (int digit : result3) {
                System.out.print(digit);
            }
            System.out.println();
        }
}
