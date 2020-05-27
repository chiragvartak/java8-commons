package com.chiragvartak.java8commons;

public class LombokUtils {

    public static String formatLombokToStringPrintedObject(String s) {
        int currentTabLength = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case ' ':
                    break;
                case '[':
                case '{':
                case '(':
                    currentTabLength += 4;
                    sb.append(ch).append("\n").append(tab(currentTabLength));
                    break;
                case ',':
                    sb.append(ch).append("\n").append(tab(currentTabLength));
                    break;
                case ']':
                case '}':
                case ')':
                    currentTabLength -= 4;
                    sb.append("\n").append(tab(currentTabLength)).append(ch);
                    break;
                default:
                    sb.append(ch);
            }
        }

        return sb.toString();
    }

    private static String tab(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

}