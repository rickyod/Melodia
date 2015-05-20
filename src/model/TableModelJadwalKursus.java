/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TableModelJadwalKursus extends AbstractTableModel{
    protected String[][] data;
    protected int count;

    public TableModelJadwalKursus() {
        
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
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0: return "ID Jadwal";
            case 1: return "ID Paket";
            case 2: return "Hari";
            case 3: return "Jam Mulai";
            case 4: return "Jam Akhir";
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
}

