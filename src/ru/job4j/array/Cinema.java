package ru.job4j.array;


import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int lng = places.length - 1;
        int row1 = 0;
        int cell1 = 0;
        Place place = null;
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places.length; j++) {
                if (i == 0 && j == 0 && places[0][1] == null && places[1][0] == null && places[i][j] == null) {
                    place = new Place(0, 0);
                }  else if ( i == 0 && j > 0 && j < lng && places[0][j] == null && places[0][j - 1] == null && places[0][j + 1] == null && places[1][j] == null){
                    place = new Place(0, j);
                }  else if (i != 0 && i != lng && j != 0 && j != lng && places[i][j] == null && places[i - 1][j] == null && places[i + 1][j] == null && places[i][j - 1] == null && places[i][j + 1] == null){
                    place = new Place(i, j);
                } else if (i == 0 && j == lng && places[0][lng - 1] == null && places[1][lng] == null && places[i][j] == null) {
                    place = new Place(0, lng);
                } else if (i == lng && j == lng && places[lng - 1][lng] == null && places[lng][lng - 1] == null && places[i][j] == null) {
                    place = new Place(lng, lng);
                } else if (i == lng && j == 0 && places[lng - 1][0] == null && places[lng][1] == null && places[i][j] == null) {
                    place = new Place(lng, 0);
                }  else if ( i == lng && j > 0 && j < lng && places[lng][j] == null && places[lng][j - 1] == null && places[lng][j + 1] == null && places[lng - 1][j] == null){
                    place = new Place(lng, j);
                } else if ( i > 0 && i < lng && j == 0 && places[i][0] == null && places[i - 1][0] == null && places[i + 1][0] == null && places[i][1] == null){
                    place = new Place(i, 0);
                } else if ( i > 0 && i < lng && j == lng && places[i][lng] == null && places[i - 1][lng] == null && places[i + 1][lng] == null && places[i][lng - 1] == null){
                    place = new Place(i, lng);
                }
            }
        }


        return place;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row &&
                    cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
    public static void main(String[] args) {
        Place place = checkEmptyPlace( new Place[][] {
                {new Place(0, 0), null, new Place(0, 2), null, new Place(0, 4)},
                {null, new Place(1, 1), null, new Place(1, 3), null},
                {new Place(2, 0), null, null, null, new Place(2, 4)},
                {null, new Place(3, 1), null, new Place(3, 3), null},
                {new Place(4, 0), new Place(4, 1), new Place(4, 2), null, null}
        });

        System.out.println("row " + place.row + " cell " + place.cell);

    }

}
