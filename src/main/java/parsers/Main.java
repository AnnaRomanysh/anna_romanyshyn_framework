package parsers;

public class Main {

    public static void main(String [] args){
        XLParser xl = new XLParser();
        xl.parse("src\\test\\resources\\testdata\\api\\reqres\\reqResUsers.xlsx");
    }
}
