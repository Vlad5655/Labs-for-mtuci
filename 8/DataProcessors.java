import java.util.List;
import java.util.stream.Collectors;

public class DataProcessors {

    @DataProcessor(description = "Фильтрация коротких строк")
    public List<String> filter(List<String> data) {
        return data.stream()
                   .filter(line -> line.trim().length() >= 5)
                   .collect(Collectors.toList());
    }

    @DataProcessor(description = "Трансформация: trim + toUpperCase")
    public List<String> transform(List<String> data) {
        return data.stream()
                   .map(line -> line.trim().toUpperCase())
                   .collect(Collectors.toList());
    }

    @DataProcessor(description = "Агрегация: удаление дубликатов и сортировка")
    public List<String> aggregate(List<String> data) {
        return data.stream()
                   .distinct()
                   .sorted()
                   .collect(Collectors.toList());
    }
}
