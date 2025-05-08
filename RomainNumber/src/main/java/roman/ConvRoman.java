package roman;

public class ConvRoman {
    public static int convertLettreToInt(String roman) {
        return switch (roman) {
            case "M" -> 1000;
            case "D" -> 500;
            case "C" -> 100;
            case "L" -> 50;
            case "X" -> 10;
            case "V" -> 5;
            case "I" -> 1;
            case "" -> 0;
            default -> throw new LettreNomRomaineException("Lettre non Romaine, grosse merde");
        };
    }

    public static int romanToInt(String roman) {
        //return convertLettreToInt(roman);
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            result += convertLettreToInt(roman.substring(i,i+1));
            if (i > 0){
                if(roman.charAt(i-1) == 'I' && convertLettreToInt(roman.substring(i,i+1)) > 1){
                    result -= 2;
                }
                if (roman.charAt(i-1)== 'X' && convertLettreToInt(roman.substring(i,i+1)) > 10){
                    result -= 20;
                }
                if (roman.charAt(i-1)=='C' && convertLettreToInt(roman.substring(i,i+1)) > 100){
                    result -= 200;
                }
            }
        }
        return result;
    }
}
