package com.company;

public class Main {
    private static Main RandomString;

    // n uzunluğunda rastgele bir dize oluşturma işlevi
    static String getAlphaNumericString(int n)
    {

        // bu Dizeden rastgele bir Karakter seçti
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

                + "abcdefghijklmnopqrstuvxyz";

        // AlphaNumericString'in StringBuffer boyutunu oluşturun
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // arasında rastgele bir sayı üret
            // 0 - AlphaNumericString değişken uzunluğu
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // sb'nin sonuna tek tek Karakter ekle
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args){

        int n = 20;

        //Alfasayısal dizeyi alın ve görüntüleyin
        System.out.println(RandomString
                .getAlphaNumericString(n));
    }
}
