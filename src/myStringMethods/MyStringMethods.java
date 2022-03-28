package myStringMethods;

public class MyStringMethods {
    private StringBuilder sb;

    public int findSymbolOccurance(String word, char letter) {
        int containsIndex = 0;
        char[] letterArray = word.toCharArray();
        for (int i = 0; i < letterArray.length; i++) {
            if (letterArray[i] == letter) {
                containsIndex++;
            }
        }
        return containsIndex;
    }

    public int findWordPosition(String source, String target) {
        if(source.contains(target)) {
            return source.indexOf(target);
        } else {
            return -1;
        }
    }

    public String stringReverse(String word) {
        sb = new StringBuilder();
        char[] letterArray = word.toCharArray();
        for (int i = letterArray.length - 1; i >= 0; i--) {
            sb.append(letterArray[i]);
        }
        return sb.toString();
    }

    public boolean isPalindrome(String word) {
        if (word.equals(stringReverse(word))) {
            return true;
        } else {
            return false;
        }
    }
}