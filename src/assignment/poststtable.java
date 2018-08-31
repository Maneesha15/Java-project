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
public class poststtable extends AbstractTableModel{
    
    private static final String [] COLUMN_NAMES={"Student id","First name", "Last name","age","Email","Phone number","Gender","Admission year","Department"};
    private static ArrayList<poststudents> list;
    
    poststtable(ArrayList<poststudents> stlist){
        
        list=stlist;
    
    }

    public String getColumnName(int columnIndex){
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
        switch (columnIndex){
                case 0:
                    return list.get(rowIndex).getPstudent_id();
                case 1:
                    return list.get(rowIndex).getFirst_name();
                case 2:
                    return list.get(rowIndex).getLast_name();
                case 3:
                    return list.get(rowIndex).getAge();
                case 4:
                    return list.get(rowIndex).getEmail();
                case 5:
                    return list.get(rowIndex).getPhone_number();
                case 6:
                    return list.get(rowIndex).getGender();
                case 7:
                    return list.get(rowIndex).getAdmission_year();
                case 8:
                    return list.get(rowIndex).getFaculty_name();
                default:
                    return "Error";
        }
    }
    
}
