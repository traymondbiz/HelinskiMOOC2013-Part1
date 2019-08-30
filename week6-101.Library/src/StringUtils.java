public class StringUtils {
	
	public static boolean included(String word, String searched){
		if (word == null || searched == null){
			return false;
		}
		word = word.toUpperCase();
		searched = searched.trim().toUpperCase();
		
		if (word.contains(searched)){
			return true;
		}
		else {
			return false;
		}
	}
}
