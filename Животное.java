import java.util.ArrayList;
import java.util.List;

public abstract class Животное {
    protected String имя;
    protected String датаРождения;
    protected List<String> команды;

    private static int счетчикЖивотных = 0;

    public Животное(String имя, String датаРождения) {
        this.имя = имя;
        this.датаРождения = датаРождения;
        this.команды = new ArrayList<>();
        счетчикЖивотных++;
    }

    public abstract void издатьЗвук();

    public void добавитьКоманду(String команда) {
        команды.add(команда);
    }

    public List<String> получитьКоманды() {
        return команды;
    }

    public String получитьИнформацию() {
        return "Имя: " + имя + ", Дата рождения: " + датаРождения;
    }

    public static int получитьСчетчикЖивотных() {
        return счетчикЖивотных;
    }
}
