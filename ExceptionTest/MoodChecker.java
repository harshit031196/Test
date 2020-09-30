
public class MoodChecker {

	private String mood;
	public MoodChecker(String mood) {
		this.mood=mood;
	}
	public MoodChecker() {
		
	}
	
	public String checker() {
		try {
			if(this.mood.contains("sad")) {
				return "sad";
			}else {
				return "happy";
			}
		}catch(Exception e){
			if(this.mood==null) {
				System.out.println("NULL");
				return "happy";
			}else {
				return "happy";
			}
		}
	}
	
	public String checkerWhenInput(String input) {
		if(input.contains("sad")) {
			return "sad";
		}else {
			return "happy";
		}
	}
	

}
