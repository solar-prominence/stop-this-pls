import java.util.Scanner;

  class IsPalindrome {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your word: ");
      String s = scan.next();
      System.out.println("Palindrom: "+isPalindrome(s));
  }

  public static boolean isPalindrome(String text) {
      text = text.replaceAll("\\W","");//удаляем все ненужное
      StringBuilder strBuilder = new StringBuilder(text);
      strBuilder.reverse(); //переворачиваем строку
      String invertedText = strBuilder.toString();//присваиваем перевернутую строку

      return text.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра
  }
}
