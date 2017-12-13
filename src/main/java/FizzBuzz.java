
public class FizzBuzz {

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }
        if (number % 2 == 0) {
            fizzBuzzWord.append("O");
        }
		
        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }
}
