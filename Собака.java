public class Собака extends Животное {
    public Собака(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("сидеть");
        команды.add("лежать");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " гавкает: Гав-гав!");
    }
}
