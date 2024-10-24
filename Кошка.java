public class Кошка extends Животное {
    public Кошка(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("мурлыкать");
        команды.add("лежать");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " мяукает: Мяу-мяу!");
    }
}
