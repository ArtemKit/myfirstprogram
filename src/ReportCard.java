
public class ReportCard {
	public char convertGrades( int testResult){
		char grade;
		if (testResult >= 90){
		grade = 'A';
		}else if (testResult >= 80 && testResult < 90){
		grade = 'B';
		}else if (testResult >= 70 && testResult < 80){
		grade = 'C';
		}else {
		grade = 'D';
		}
		return grade;
	}

	private final static double CONSTFTOC = 0.5555555555555556D;
    private final static double CONSTCTOF = 1.8D;
 
    public static void main(String[] args)
    {        
        System.out.println(new ReportCard().convertTemp(51,'F'));
    }
 
    public String convertTemp (int temperature, char convertTo){
 
        double tmp = temperature;
 
        if (convertTo == 'F'){
            tmp = (tmp * CONSTCTOF) + 32;
        }else if (convertTo == 'C'){
            tmp = (tmp - 32) * CONSTFTOC;
        }
        return String.format("%.1f ",tmp) + convertTo;
 
    }
	

	}

