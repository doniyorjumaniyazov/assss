public class Лошадь extends Животное {
    public Лошадь(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("бежат галопом");
        команды.add("стоять");
        команды.add("стоп");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " ржет: И-го-го!");
    }
}
