
public class Fish extends Pet {
	int currentDepth=0;
	final int DEFAULT_DIVING=5;
	public int dive(){
	currentDepth=currentDepth + DEFAULT_DIVING;//поточна глибина + на скільки глибоко
	if (currentDepth > 100){
	System.out.println("Я маленькая рыбка"+
	" и не могу плавать глубже 100 метров");
	currentDepth=currentDepth - DEFAULT_DIVING;
	}else{
	System.out.println("Погружаюсь ещё на " + DEFAULT_DIVING +
	" метра");
	System.out.println("Я на глубине " + currentDepth +
	" метров");
	}
	return currentDepth;}
	public int dive(int howDeep){
		currentDepth=currentDepth + howDeep;
		if (currentDepth > 100){
		System.out.println("Я маленькая рыбка и " +
		" не могу нырять глубже 100 метров");
		currentDepth=currentDepth - howDeep;
		}else{
		System.out.println("Погружаюсь на "+howDeep+" м.");
		System.out.println("Я на " + currentDepth +
		" м. ниже уровня моря");
		}
		return currentDepth;
		}
	public String say(String something){
		return "Ты не знаешь, что рыбы не умеют говорить?";
		}
		// constructor
		Fish(int startingPosition){
		currentDepth=startingPosition;
		}
		}

