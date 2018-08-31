/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Acer
 */
public class InsTable extends AbstractTableModel {

    private static final String[] COLUMN_NAMES = {"Instructor_id", "Instructor_name", "Email", "Department_id", "subject_code"};
    private static ArrayList<Instructor> list;

    InsTable(ArrayList<Instructor> stlist) {

        list = stlist;

    }
    
     public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getInstructor_id();
            case 1:
                return list.get(rowIndex).getName();
            case 2:
                return list.get(rowIndex).getEmail();
            case 3:
                return list.get(rowIndex).getAge();
            case 4:
                return list.get(rowIndex).getDepartment_id();
            case 5:
                return list.get(rowIndex).getSubject_code();
            default:
                return "Error";
        }
    }

}
