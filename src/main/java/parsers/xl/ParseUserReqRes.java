package parsers.xl;
import models.api.reqres.User;
import org.apache.poi.ss.usermodel.Cell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParseUserReqRes {
    private static final String USERS_DATA_PATH = "src\\test\\resources\\testdata\\api\\reqres\\reqResUsers.xlsx";
    private XLParser xl = new XLParser();
    private List<User> users;

    public List<User> parseUsers(String filePath) {
        users = new ArrayList<>();
        Iterator<Cell> it = xl.parseCells(filePath, 0).iterator();
        while (it.hasNext()){
            users.add(new User(it.next().toString(), it.next().toString()));
        }
        return  users;

    }
}