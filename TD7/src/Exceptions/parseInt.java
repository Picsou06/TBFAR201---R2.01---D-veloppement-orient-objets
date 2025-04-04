package Exceptions;

public class parseInt {
    public Integer parseIntFromList(String[] tab) {
        Integer answer = 0;
        for (String s : tab) {
            try {
                answer += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        parseInt parser = new parseInt();
        String[] tab = {"MaClasse", "2", "toto", "3.5", "12", "a", "1", "test"};
        Integer result = parser.parseIntFromList(tab);
        System.out.println("Parsed integer: " + result);
    }
}
