import java.util.*;

public final class Exercise {
  public static String commaSeparatedNamesOfLength(List<String> names, int length) {
    StringBuilder result = new StringBuilder();
    
    for(int i = 0; i < names.size(); i++) {
      if(names.get(i).length() == length) {     
        if(!result.toString().isEmpty()) {
          result.append(", ");
        }
        result.append(names.get(i).toUpperCase(new Locale("en")));
      }
    }                    
    
    return result.toString();
  }

  public static double calculate(List<Integer> numbers) {
    double result = 0;

    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 0 && numbers.get(i) > 3 &&
          Math.sqrt(numbers.get(i)) < 3) {
        result += numbers.get(i) * 2;
      }
    }
    
    return result;
  }

  public static void main(String[] args) {
    System.out.println(commaSeparatedNamesOfLength(Arrays.asList(
      "Tom", "Jerry", "Spike", "Tyke", "Butch"), 5));

    System.out.println(calculate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 12)));
    
  }
}

