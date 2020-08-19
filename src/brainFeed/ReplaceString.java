package brainFeed;

public class ReplaceString {
//java program to replace all occurence of a letter to a new character
	public static void main(String[] args) {
		String modified =replace("Mapping", 'p');
		String modified1 =replace("Napping", 'p');
		System.out.println(modified);
		System.out.println(modified1);

	}

	public static String replace(String str, char letter) {
		
		if(str.isEmpty()) return str;
		
	    char [] ch = str.toCharArray();
	    
	
//	    for(char c: ch) {
//	    	if(letter == c) {
//	    		 c= '*';
//	    	}
//	    }
	    

	    for(int i=0; i<ch.length;++i){
	        if(letter==ch[i]){
	            ch[i] = '*';
				
	        }		
		}
	    return String.valueOf(ch);
	    
	    
	}
	
	//still working on it
public static String replaceForEach(String str, char  character) {
		
		if(str.isEmpty()) return str;
		
	    char [] ch = str.toCharArray();
	    
	
	    

	    for(char letters: ch) {
			if(character==letters) {
			 letters = character;
	        }		
		}
	    return String.valueOf(ch);
	    
	    
	}
	

}
