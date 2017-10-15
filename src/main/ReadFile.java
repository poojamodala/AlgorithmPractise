package main;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class ReadFile {
    
    static HashMap <String, Integer> countMap = new HashMap<String, Integer> ();
    static ArrayList<String> strings = new ArrayList<String>();
    
    public static void readTxtFile() {
        /*File file = new File("/desktop/read.txt");
        BufferedReader textBuffer;
		try {
			textBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		
        String line = null;
        
        while((line = textBuffer.readLine()) !=null ) {*/
            //split the line based on whitespaces, . and ,
            
        	String line = "hello I'm, fine. How";
            String[] words = line.split("\\s|\\.|,");
            for (String s: words) {
            	System.out.println(s);
                int wordCount = numberOfOccurance(words, s);
                countMap.put(s,wordCount);
                
                
                if(s.charAt(0) == s.charAt(s.length()-1)) {
                    strings.add(s);
                }
                largestWord(strings);
                
            }
                
           /* }
        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
    }
    public static int numberOfOccurance(String[] words, String word) {
        int count = 0;
        
        for(String s: words) {
            if(s.equals(word)) {
                count++;
            }
        }
        return count;    
        }
    
    public static String largestWord(ArrayList<String> strList) {
        
        int wordLength = 0;
        
        Iterator itr = strList.iterator();
        String largestWord = "";
        
        while(itr.hasNext()) {
            Object str = itr.next();
            if(((String) str).length() > wordLength ) {
                largestWord = (String) str;
            }
            
        }
        return largestWord;
    }
    
    public static void main(String[] args) {
    	readTxtFile();
    	Iterator it = countMap.entrySet().iterator();
        while(it.hasNext()) {
        	Entry value = (Entry) it.next();
            
            System.out.println(value.getKey()+" -> "+value.getValue());
            it.remove(); //removes concurrent modification exception
        }
    }
}