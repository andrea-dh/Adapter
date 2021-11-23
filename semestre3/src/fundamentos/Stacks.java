package fundamentos;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        isPalindroma("Hannah");
    }
    public static boolean isPalindroma(String word){
        String letter;
        String invertida = "";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            letter = String.valueOf(word.charAt(i));
            stack.push(letter);
        }

        while(!stack.empty()){
            invertida += stack.pop();
        }
        if(invertida.equalsIgnoreCase(word)){
            System.out.println("Si son palindromas");
            return true;
        }
        else{
            System.out.println("No son palindromas");
            return false;
        }
    }
}

