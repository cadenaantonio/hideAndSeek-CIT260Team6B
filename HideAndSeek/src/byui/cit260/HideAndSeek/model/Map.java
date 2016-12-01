/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author DragonMaster
 */
public class Map  implements Serializable{
    
    private Location currentLocation;
    private int currentRow;
    private int currentColumn;
    private int rowCount;
    private int columnCount;
    private Location[][] locations;
    
    private Game[] game;

    public Map() {
    }
    
    public Map(int rowCount, int columnCount) {
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
		for (int column = 0; column < columnCount; column++) {
		//create and initialize new Location object instance
		Location location = new Location();
		location.setColumn(column);
		location.setRow(row);
		location.setVisited(false);
		
		//assign the Location object to the current position in array
		locations[row][column] = location;
		}
        
        }
    }
    //write code here

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.currentLocation);
        hash = 47 * hash + this.rowCount;
        hash = 47 * hash + this.columnCount;
        hash = 47 * hash + Arrays.deepHashCode(this.locations);
        hash = 47 * hash + Arrays.deepHashCode(this.game);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Arrays.deepEquals(this.game, other.game)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "currentLocation=" + currentLocation + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", locations=" + locations + ", game=" + game + '}';
    }

}
