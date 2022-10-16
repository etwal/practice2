package cpen221practice;

class Resistor {
    int colorCode(String color) {

        int index = -1;

        String []colors = colors();
        for (int i =0; i< colors().length; i++){
            if(color  == colors[i]){
                index = i;
            }
        }
        return index;

    }

    String[] colors() {
        String []colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        return colors;
    }
}
