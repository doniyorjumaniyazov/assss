import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ЖивотноеUI {
    private List<Животное> реестрЖивотных;

    public ЖивотноеUI() {
        реестрЖивотных = new ArrayList<>();
    }

    public void показатьМеню() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Меню реестра животных ---");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Показать список команд для животного");
            System.out.println("3. Обучить новое животное команде");
            System.out.println("4. Показать всех животных по дате рождения");
            System.out.println("5. Показать общее количество животных");
            System.out.println("6. Выйти");

            System.out.print("Выберите пункт меню: ");
            int выбор = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (выбор) {
                case 1:
                    добавитьЖивотное(scanner);
                    break;
                case 2:
                    показатьКоманды(scanner);
                    break;
                case 3:
                    обучитьКоманде(scanner);
                    break;
                case 4:
                    показатьВсехЖивотных();
                    break;
                case 5:
                    показатьОбщееКоличествоЖивотных();
                    break;
                case 6:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }

    private void добавитьЖивотное(Scanner scanner) {
        System.out.print("Введите тип животного (собака, кошка, хомяк, лошадь, верблюд, осел): ");
        String тип = scanner.nextLine();
        System.out.print("Введите имя животного: ");
        String имя = scanner.nextLine();
        System.out.print("Введите дату рождения (dd.mm.yyyy): ");
        String датаРождения = scanner.nextLine();

        Животное новоеЖивотное = null;
        switch (тип.toLowerCase()) {
            case "собака":
                новоеЖивотное = new Собака(имя, датаРождения);
                break;
            case "кошка":
                новоеЖивотное = new Кошка(имя, датаРождения);
                break;
            case "хомяк":
                новоеЖивотное = new Хомяк(имя, датаРождения);
                break;
            case "лошадь":
                новоеЖивотное = new Лошадь(имя, датаРождения);
                break;
            case "верблюд":
                новоеЖивотное = new Верблюд(имя, датаРождения);
                break;
            case "осел":
                новоеЖивотное = new Осел(имя, датаРождения);
                break;
            default:
                System.out.println("Неизвестный тип животного.");
                return;
        }

        реестрЖивотных.add(новоеЖивотное);
        System.out.println("Животное добавлено: " + новоеЖивотное.получитьИнформацию());
    }

    private void показатьКоманды(Scanner scanner) {
        System.out.print("Введите имя животного для показа команд: ");
        String имя = scanner.nextLine();
        for (Животное животное : реестрЖивотных) {
            if (животное.имя.equals(имя)) {
                System.out.println("Команды для " + имя + ": " + животное.получитьКоманды());
                return;
            }
        }
        System.out.println("Животное с именем " + имя + " не найдено.");
    }

    private void обучитьКоманде(Scanner scanner) {
        System.out.print("Введите имя животного для обучения: ");
        String имя = scanner.nextLine();
        for (Животное животное : реестрЖивотных) {
            if (животное.имя.equals(имя)) {
                System.out.print("Введите новую команду: ");
                String команда = scanner.nextLine();
                животное.добавитьКоманду(команда);
                System.out.println("Животное " + имя + " обучено новой команде.");
                return;
            }
        }
        System.out.println("Животное с именем " + имя + " не найдено.");
    }

    private void показатьВсехЖивотных() {
        for (Животное животное : реестрЖивотных) {
            System.out.println(животное.получитьИнформацию());
        }
    }

    private void показатьОбщееКоличествоЖивотных() {
        System.out.println("Общее количество животных: " + Животное.получитьСчетчикЖивотных());
    }
}
