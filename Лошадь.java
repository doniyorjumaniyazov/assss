public class Лошадь extends Животное {
    public Лошадь(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("бежать галопом");
        команды.add("стоять");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " ржет: И-го-го!");
    }
}
