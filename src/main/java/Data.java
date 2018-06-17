import java.util.HashMap;
import java.util.Map;

public class Data {

    public static String defaultServerInfo = "DictionaryService web service version 3.0.5383.24271\n" +
            "\n" +
            "Remote Server information:\n" +
            "Dictionary     Headwords\n" +
            "devils         989\n" +
            "easton         3965\n" +
            "elements       130\n" +
            "foldoc         13465\n" +
            "gazetteer      52953\n" +
            "gcide          166876\n" +
            "hitchcock      2614\n" +
            "jargon         2374\n" +
            "vera           7117\n" +
            "wn             149323\n" +
            "world02        279\n";

    public static String hitchcockDictResponse = "This file was converted from the original database on:\n" +
            "          Sun Jul  5 21:43:41 1998\n" +
            "\n" +
            "\n" +
            "The original data is available from:\n" +
            "    \n" +
            "ftp://ccel.wheaton.edu/ebooks/HTML/bible_names/bible_names.txt\n" +
            "\n" +
            "The original data was distributed with the notice shown below.  No\n" +
            "additional restrictions are claimed.  Please redistribute this\n" +
            "changed version under the same conditions and restriction that\n" +
            "apply to the original version.\n" +
            "\n" +
            "   HITCHCOCK'S BIBLE NAMES DICTIONARY\n" +
            "   \n" +
            "   This dictionary is from \"Hitchcock's New and Complete Analysis of\n" +
            "   the Holy Bible,\" published in the late 1800s.  It contains more\n" +
            "   than 2,500 Bible and Bible-related proper names and their\n" +
            "   meanings.  Some Hebrew words of uncertain meaning have been left\n" +
            "   out. It is out of copyright, so feel free to copy and distribute\n" +
            "   it. I pray it will help in your study of God's Word.\n" +
            "   \n" +
            "                                --Brad Haugaard\n" +
            "   \n" +
            "   \n";

    public static Map getCorrectDictionaries(){
        Map<String, String> correctDictionaries = new HashMap<String, String>();
        correctDictionaries.put("devils",       "THE DEVIL'S DICTIONARY ((C)1911 Released April 15 1993)");
        correctDictionaries.put("easton",       "Easton's 1897 Bible Dictionary");
        correctDictionaries.put("elements",     "Elements database 20001107");
        correctDictionaries.put("foldoc",       "The Free On-line Dictionary of Computing (27 SEP 03)");
        correctDictionaries.put("gazetteer",    "U.S. Gazetteer (1990)");
        correctDictionaries.put("gcide",        "The Collaborative International Dictionary of English v.0.44");
        correctDictionaries.put("hitchcock",    "Hitchcock's Bible Names Dictionary (late 1800's)");
        correctDictionaries.put("jargon",       "Jargon File (4.3.1, 29 Jun 2001)");
        correctDictionaries.put("vera",         "Virtual Entity of Relevant Acronyms (Version 1.9, June 2002)");
        correctDictionaries.put("wn",           "WordNet (r) 2.0");
        correctDictionaries.put("world02",      "CIA World Factbook 2002");
        return correctDictionaries;
    }

}
