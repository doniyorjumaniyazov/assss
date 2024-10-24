public class Осел extends Животное {
    public Осел(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("нести груз");
        команды.add("стоять на месте");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " орет: И-а, И-а!");
    }
}
