package cz.educanet.praha;

public class StringWithMostOccurrencesOfLetter {

    public static String findStringWithMostOccurrencesOfLetter(String[] strings, char letter) {
        int maxCount = 0;
        String maxString = null;
        for(int i = 0; i < strings.length;i++){
            String string = strings[i];
            int counter = 0;
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if(c == letter){
                    counter++;
                }
            }if(counter > maxCount ){
                maxCount = counter;
                maxString = string;
            }
         }
        return maxString;
    }
}

/*
bautobus
postupne projizdim  slovo a kdyz se pismeno = a prictu

mam promenou counter
zacnu projizdet slovo
    kdyz se pismeno rovna a prictu ke counteru


Vytvořím si proměnnou pro největší počet.
Vytvořím si proměnnou pro slovo s největším počtem.
Projedu slova
    spočítám počet a
    pokud je počet větší než největší počet,
        uložím si ho jako největší počet
        a uložím si to slovo jako slovo s nevětším počtem hledaných písmen



 */
