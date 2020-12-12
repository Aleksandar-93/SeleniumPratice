package com.cybertek.tests;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcelIO {
    @Test
    public void readDataFromExcel() throws IOException {
        String path ="C:\\Users\\Kagera\\Desktop\\New folder\\Book.xlsx";
        Workbook workbook = WorkbookFactory.create(new File(path));
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell.getStringCellValue());
        System.out.println();
        int lastRow = sheet.getLastRowNum();

        for(int i=0; i<= lastRow; i++){
            int lastColumn = sheet.getRow(i).getLastCellNum()-1;
        System.out.println(sheet.getRow(i).getCell(0));
        System.out.println(sheet.getRow(i).getCell(lastColumn));
            System.out.println();

        }
}
}
