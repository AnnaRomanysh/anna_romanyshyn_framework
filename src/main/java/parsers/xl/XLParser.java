package parsers.xl;

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
    private InputStream in;
    private XSSFWorkbook wb;
    private List<Cell> cells;

    public Sheet parseSheet(String name, int sheetIndex) {
        try {
            in = new FileInputStream(name);
            wb = new XSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wb.getSheetAt(sheetIndex);
    }

    public List<Cell> parseCells(String filePath, int sheetIndex) {
        cells = new ArrayList<>();
        Sheet sh = parseSheet(filePath, sheetIndex);
        sh.removeRow(sh.getRow(0));
        Iterator<Row> it = sh.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cell = row.iterator();
            while (cell.hasNext()) {
                cells.add(cell.next());
            }
        }
        return cells;
    }


}
