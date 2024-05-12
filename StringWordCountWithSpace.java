public class StringWordCountWithSpace {
    public static void main(String[] args) {
        String str = "ve   sala   cup   namdne";
        String[]word = str.split("\\s+");
        int count = word.length;
        System.out.println("total word space " + count);
    }
}
