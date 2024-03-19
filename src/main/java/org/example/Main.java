package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // 1-> Palindrome sayıları bulma.
    public static boolean isPalindrome(int number) {
        boolean isNegative = number < 0;
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; // bir basamak sağa kay
        }
        if (isNegative && reversedNumber != originalNumber) {
            return false;
        }
        return originalNumber == reversedNumber;
    }

    // 2 -> Mükemmel Sayıları Bulma
    public static boolean isPerfectNumber(int sayi) {
        if(sayi < 0) {
            return  false;
        }
        int kalan = 0;
        for(int i = 1; i< sayi; i++) {
            if(sayi % i == 0) {
                kalan = kalan + i;
            } else if (kalan == sayi) {
                return true;
            }
        }
        return false;
    }

    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }

        String[] rakamKelimeleri = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String sayiKelimeleri = "";
        String sayiStr = String.valueOf(sayi);
        for (int i = 0; i < sayiStr.length(); i++) {
            int rakam = Character.getNumericValue(sayiStr.charAt(i));
            sayiKelimeleri += rakamKelimeleri[rakam] + " ";
        }

        return sayiKelimeleri.trim(); // Başındaki ve sonundaki boşlukları kaldır
    }

}
