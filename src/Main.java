import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> searchQueries = new HashMap<>();

        while (true) {
            System.out.println("введите поисковый запрос(или 'exit' для выхода):");
            String query = scanner.nextLine().trim();

            if
            (query.equalsIgnoreCase("exit")) {
                break;
            }
            //получаем текущее количество или 0, если новый запрос

            int count = searchQueries.getOrDefault(query,0);
            //обновляем счетчик усли меньше 100
            if (count < 100) {
                searchQueries.put(query, count + 1);
            }
            // выводим количество запросов


            System.out.println("запрос'" +query + "'искался"+ searchQueries.get(query) + "раз(а).");
        }
        scanner.close();
    }
}