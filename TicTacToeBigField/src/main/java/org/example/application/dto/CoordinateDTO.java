package org.example.application.dto;

public class CoordinateDTO {
    int row;
    int col;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CoordinateDTO(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public CoordinateDTO() {
    }
}
