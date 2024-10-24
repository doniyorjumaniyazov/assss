public class Хомяк extends Животное {
    public Хомяк(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("бегать в колесе");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " пищит: Пи-пи!");
    }
}
