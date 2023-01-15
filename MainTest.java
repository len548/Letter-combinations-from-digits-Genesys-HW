import java.util.ArrayList;
import java.util.Arrays;

// import org.junit.Test;
import static org.junit.Assert.assertEquals;
import main.Main;

import org.junit.*;

public class MainTest {
    private ArrayList<String> expected = new ArrayList<>();

    // tests to check if regular inputs work
    @Test
    public void zeroDigitTest(){
        assertEquals("regular digits should work", Main.allLetterCombinations(""), expected);
    }

    @Test
    public void oneDigitTest(){
        replaceArray(expected, new String[]{"a", "b", "c"});
        assertEquals("1 digit should work", Main.allLetterCombinations("2"), expected);
        replaceArray(expected, new String[]{"d", "e", "f"});
        assertEquals("1 digit should work", Main.allLetterCombinations("3"), expected);
        replaceArray(expected, new String[]{"g", "h", "i"});
        assertEquals("1 digit should work", Main.allLetterCombinations("4"), expected);
        replaceArray(expected, new String[]{"j", "k", "l"});
        assertEquals("1 digit should work", Main.allLetterCombinations("5"), expected);
        replaceArray(expected, new String[]{"m", "n", "o"});
        assertEquals("1 digit should work", Main.allLetterCombinations("6"), expected);
        replaceArray(expected, new String[]{"p", "q", "r", "s"});
        assertEquals("1 digit should work", Main.allLetterCombinations("7"), expected);
        replaceArray(expected, new String[]{"t", "u", "v"});
        assertEquals("1 digit should work", Main.allLetterCombinations("8"), expected);
        replaceArray(expected, new String[]{"w", "x", "y", "z"});
        assertEquals("1 digit should work", Main.allLetterCombinations("9"), expected);
        
    }

    @Test
    public void twoDigitTest(){
        replaceArray(expected, new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});
        assertEquals("2 digit should work", Main.allLetterCombinations("23"), expected);
        replaceArray(expected, new String[]{"aw","ax","ay","az","bw","bx","by","bz","cw","cx","cy","cz"});
        assertEquals("2 digit should work", Main.allLetterCombinations("29"), expected);
        replaceArray(expected, new String[]{"gg","gh","gi", "hg", "hh", "hi", "ig", "ih", "ii"});
        assertEquals("2 digit should work", Main.allLetterCombinations("44"), expected);
        
    }

    @Test
    public void threeDigitTest(){
        replaceArray(expected, new String[]{"adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"});
        assertEquals("3 digit should work", Main.allLetterCombinations("234"), expected);
        replaceArray(expected, new String[]{"tjw", "tjx", "tjy", "tjz", "tkw", "tkx", "tky", "tkz", "tlw", "tlx", "tly", "tlz", "ujw", "ujx", "ujy", "ujz", "ukw", "ukx", "uky", "ukz", "ulw", "ulx", "uly", "ulz", "vjw", "vjx", "vjy", "vjz", "vkw", "vkx", "vky", "vkz", "vlw", 
        "vlx", "vly", "vlz"});
        assertEquals("3 digit should work", Main.allLetterCombinations("859"), expected);

    }

    @Test
    public void fourDigitTest(){
        replaceArray(expected, new String[]{"adgj", "adgk", "adgl", "adhj", "adhk", "adhl", "adij", "adik", "adil", "aegj", "aegk", "aegl", "aehj", "aehk", "aehl", "aeij", "aeik", "aeil", "afgj", "afgk", "afgl", "afhj", "afhk", "afhl", "afij", "afik", "afil", "bdgj", "bdgk", "bdgl", "bdhj", "bdhk", "bdhl", "bdij", "bdik", "bdil", "begj", "begk", "begl", "behj", "behk", "behl", "beij", "beik", "beil", "bfgj", "bfgk", "bfgl", "bfhj", "bfhk", "bfhl", "bfij", "bfik", "bfil", "cdgj", "cdgk", "cdgl", "cdhj", "cdhk", "cdhl", "cdij", "cdik", "cdil", "cegj", "cegk", "cegl", "cehj", "cehk", "cehl", "ceij", "ceik", "ceil", "cfgj", "cfgk", "cfgl", "cfhj", "cfhk", "cfhl", "cfij","cfik", "cfil"});
        assertEquals("4 digit should work", Main.allLetterCombinations("2345"), expected);
        replaceArray(expected, new String[]{"pgwm", "pgwn", "pgwo", "pgxm", "pgxn", "pgxo", "pgym", "pgyn", "pgyo", "pgzm", "pgzn", "pgzo", "phwm", "phwn", "phwo", "phxm", "phxn", "phxo", "phym", "phyn", "phyo", "phzm", "phzn", "phzo", "piwm", "piwn", "piwo", "pixm", "pixn", "pixo", "piym", "piyn", "piyo", "pizm", "pizn", "pizo", "qgwm", "qgwn", "qgwo", "qgxm", "qgxn", "qgxo", "qgym", "qgyn", "qgyo", "qgzm", "qgzn", "qgzo", "qhwm", "qhwn", "qhwo", "qhxm", "qhxn", "qhxo", "qhym", "qhyn", "qhyo", "qhzm", "qhzn", "qhzo", "qiwm", "qiwn", "qiwo", "qixm", "qixn", "qixo", "qiym", "qiyn", "qiyo", "qizm", "qizn", "qizo", "rgwm", "rgwn", "rgwo", "rgxm", "rgxn", "rgxo", "rgym", "rgyn", "rgyo", "rgzm", "rgzn", "rgzo", "rhwm", "rhwn", "rhwo", "rhxm", "rhxn", "rhxo", "rhym", "rhyn", "rhyo", "rhzm", "rhzn", "rhzo", "riwm", "riwn", "riwo", "rixm", "rixn", "rixo", "riym", "riyn", "riyo", "rizm", "rizn", "rizo", "sgwm", "sgwn", "sgwo", "sgxm", "sgxn", "sgxo", "sgym", "sgyn", "sgyo", "sgzm", "sgzn", "sgzo", "shwm", "shwn", "shwo", "shxm", "shxn", "shxo", "shym", "shyn", "shyo", "shzm", "shzn", "shzo", "siwm", "siwn", "siwo", "sixm", "sixn", "sixo", "siym", "siyn", "siyo", "sizm", "sizn", "sizo"});
        assertEquals("4 digit should work", Main.allLetterCombinations("7496"), expected);

    }

    // tests to check if it thorows an exception when input digits don't meet conditions
    @Test (expected = IllegalArgumentException.class)
    public void moreThanFourDigitTest(){
        Main.allLetterCombinations("83473");
    }

    @Test (expected = IllegalArgumentException.class)
    public void outOfBoudaryDigitTest(){
        Main.allLetterCombinations("2e73");
    }

    private void replaceArray(ArrayList<String> list, String[] array){
        list.clear();
        list.addAll(Arrays.asList(array));
    }
}
