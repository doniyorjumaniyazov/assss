import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ЖивотноеService {
    private List<Животное> животные = new ArrayList<>();

    public void добавитьЖивотное(Животное новоеЖивотное) {
        животные.add(новоеЖивотное);
        System.out.println("Животное добавлено.");
    }

    public Животное найтиЖивотноеПоИмени(String имя) {
        return животные.stream()
                .filter(животное -> животное.имя.equalsIgnoreCase(имя))
                .findFirst()
                .orElse(null);
    }

    public List<Животное> получитьВсеЖивотные() {
        return животные;
    }

    public void сортироватьПоДатеРождения() {
        животные.sort(Comparator.comparing(животное -> животное.датаРождения));
    }
}

