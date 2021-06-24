import java.util.Stack;

public class Solutions implements Assignments{
    private static int count = 0;

    @Override
    public Boolean isPalindrome(String text) {
        for(int i = 0; i < (text.length() / 2); i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int minSplit(int amount) {
        int result = 0;
        result += (amount / 50);
        amount = amount % 50;
        result += (amount / 20);
        amount = amount % 20;
        result += (amount / 10);
        amount = amount % 10;
        result += (amount / 5);
        amount = amount % 5;
        result += amount;
        return result;
    }

    @Override
    public int notContains(int[] array) {
        int[] curArray;
        curArray = new int[10000];
        for (int j : array) {
            if (j > 0) {
                curArray[j] = 1;
            }
        }
        for(int i = 1; i < curArray.length; i++) {
            if(curArray[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Boolean isProperly(String sequence) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < sequence.length(); i++) {
            if(sequence.charAt(i) == ')') {
                if(!stk.empty()) {
                    stk.pop();
                } else {
                    return false;
                }
            }
            if(sequence.charAt(i) == '(') {
                stk.push('(');
            }
        }
        return stk.empty();
    }

    @Override
    public int countVariants(int stearsCount) {
        count = 0;
        int a = 1;
        int b = 2;
        findVariance(a, stearsCount);
        findVariance(b, stearsCount);
        return count;
    }

    @Override
    public Double exchangeRate(String from, String to) {
        return null;
    }

    static void findVariance(int num, int stearsCount) {
        if(num == stearsCount) {
            count++;
            return;
        }
        if(num > stearsCount) {
            return;
        }
        int a = num + 1;
        int b = num + 2;
        findVariance(a, stearsCount);
        findVariance(b, stearsCount);
    }
}
