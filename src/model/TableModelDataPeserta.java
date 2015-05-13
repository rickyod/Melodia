/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Riky Setiawan 2013730041 , Sukamto 2013730026
 */
public class TableModelDataPeserta extends AbstractTableModel{
    protected String[][] data;
    protected int count;

    public TableModelDataPeserta() {
        
    }

    @Override
    public int getRowCount() {
        return count;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0: return "ID Peserta";
            case 1: return "Nama Lengkap";
            case 2: return "Tanggal Lahir";
            case 3: return "Alamat";
            case 4: return "Nomor Telepon";
        }
        return null;
    }

    public void clearData()
    {
        this.count=0;
        this.fireTableRowsDeleted(0, count);
    }
    
    public void updateData(String[][] input ,int count){
        this.data=input;
        this.fireTableRowsInserted(count, count);
        this.count = count;
    }
    
    public void deleteData(int index){
        this.fireTableRowsDeleted(index, index);
        this.count--;
    }
}