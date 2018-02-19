package parsers;

import models.api.reqres.User;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XLParser {
    public static String parse(String name) {

        String result = "";
        InputStream in = null;
        XSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new XSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<User> users = new ArrayList<>();
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();

            while (cells.hasNext()) {
//                System.out.println(cells.next());
//                Cell cell = cells.next();
//                System.out.println(cells.next());
//                Cell cell2= cells.next();
                users.add(new User(cells.next().toString(), cells.next().toString()));

            }
            result += "\n";
        }
        System.out.println(users);
        return result;
    }

}
