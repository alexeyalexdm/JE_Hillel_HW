package HW17.com.hillel.hw17.punctuatonmarks;

public class Runner {
    public static void main(String[] args) {

        String text = "1. Береза, красавица наших лесов,— любимое дерево русского народа." +
                " 2. Река, кусты, росшие по берегам,— все было скрыто туманом. " +
                "3. Н. В. Гоголь, автор поэмы «Мертвые души»,— великий русский писатель. " +
                "4. Один раз, сидя на окошке (с этой минуты я все уже твердо помню), услышал я какой-то жалобный визг в саду.\n" +
                "\n";
        int before = text.length();
        int after = text.replaceAll("[,.]", "").length();
        System.out.println("Количество знаков: " + (before - after));

    }
}

