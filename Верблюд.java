public class Верблюд extends Животное {
    public Верблюд(String имя, String датаРождения) {
        super(имя, датаРождения);
        команды.add("идти по пустыне");
        команды.add("присесть");
    }

    @Override
    public void издатьЗвук() {
        System.out.println(имя + " издает звук: Ур-ур-ур!");
    }
}
