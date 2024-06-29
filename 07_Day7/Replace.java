package dayseven;

public class Replace {
    public static void main(String[] args) {
        StringBuilder replace = new StringBuilder("hello Github @");

        // @ is not good ! , lets replace it , as index it -- > 14;

        replace.replace(13  , 14, "!");

        System.out.println(replace);

    }
}
