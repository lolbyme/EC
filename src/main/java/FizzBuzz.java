
public class FizzBuzz {

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }
	
	
        if (number % 15 == 0) {
            fizzBuzzWord.append("FizzBuzz");
        }
        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }
}
