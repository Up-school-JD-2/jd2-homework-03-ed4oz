import java.util.Scanner;

public class Homework {
    /* *Kullanıcıya doğru tahminlerine veya yanlış tahminlerine göre farklı cevaplar veren bir uygulama yapın.
       *Uygulamayı, kullanıcının tahmin sayısını da takip ederek bir liderlik tablosu yapın.

    Kullanıcıdan tahmin almadan önce 1-100 arasında rastgele olacak bir sayı üretilir, daha sonra kullanıcıdan
    1-100 arasında bir tahmini alınır. Kullanıcı her tahmininde, programın cevabına göre "Too low, try again"
    veya "Too high, try again" mesajlarını görür. Kullanıcının doğru sayıyı tahmin etmesi durumunda, program
    doğru tahmin sayısını gösterir.

       *Rastgele sayı üretmek için Math.random() kullanımını araştırabilirsiniz.
       *"if-else" yapısını kullanarak, kullanıcının girdiği sayıyı, rastgele seçilen sayıyla
    karşılaştırabilirsiniz. Doğru veya yanlış tahminlere göre, farklı bir mesaj veya cevap vermek için
    "if-else" bloklarını kullanabilirsiniz.
       *Uygulamayı, kullanıcının tahmin sayısını da takip ederek bir liderlik tablosu yapmak için, bir sayaç
    kullanarak doğru tahmin sayısını takip etmeniz gerekiyor. Tahmin sayısını saklayarak, kullanıcının ne kaç
    adımda doğru tahmin yaptığını gösterebilirsiniz. Ardından, liderlik tablosunu oluşturmak için, farklı
    kullanıcının doğru tahmin sayısını saklayabilecekleri bir dizi kullanabilirsiniz.
    Bonus : Uygulamayı, birden fazla kullanıcının aynı anda oynayabileceği bir çoklu oyuncu sürümüne dönüştürün.
    */

    public void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write number of player: ");
        int playerNumber = scanner.nextInt();
        for (int i = 0; i < playerNumber; i++) {
            int number = (int) (Math.random() * 100);
            // System.out.println(number);
            boolean condition = true;
            int count = 0;
            while (condition) {
                System.out.print((i + 1) + ". player please, guess a number: ");
                int guess = scanner.nextInt();
                count++;
                if (guess == number) {
                    System.out.println("Correct! :)");
                    condition = false;
                } else if (guess > (number + 50) && (guess >= 0 && guess <= 100)) {
                    System.out.println("Too high, try again!");
                } else if (guess > number && (guess < (number + 50)) && (guess >= 0 && guess <= 100)) {
                    System.out.println("High, try again!");
                } else if (guess < (number - 50) && (guess >= 0 && guess <= 100)) {
                    System.out.println("Too low, try again!");
                } else if (guess < number && (guess > (number - 50)) && (guess >= 0 && guess <= 100)) {
                    System.out.println("Low, try again!");
                } else if (guess < 0 || guess > 100) {
                    System.out.println("Please enter between 1-100!");
                }
            }
            System.out.println((i + 1) + ". player won after " + count + " times. :)");
        }
    }
   /* *Kullanıcılardan bir kelime girmelerini isteyecek ve kelimenin ters çevrilmiş halini gösterecek bir uygulama yapınız.
       Ayrıca, kelimenin bir palindrom olup olmadığını kontrol edecektir. Örneğin, "kayak" kelimesi bir palindromdur.
    Bu ödevi gerçekleştirmek için, öncelikle kullanıcının girdiği kelimeyi almanız gerekecek. Bunun için, Scanner
    sınıfını kullanabilirsiniz. Daha sonra, kelimeyi ters çevirmek için bir döngü yazmanız gerekecek. Ters çevrilmiş
    kelimeyi saklamak için bir String değişkeni kullanabilirsiniz.*/

    public void wordReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a word! ");
        String word = scanner.next();
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        if (reverseWord.equals(word)) {
            System.out.println("This word a palindrome! Reversed word: " + reverseWord);
        } else {
            System.out.println("Reversed word : " + reverseWord);
        }
    }
}




