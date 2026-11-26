class ResistorColor {
    private static String[] colors = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    
    int colorCode(String color) {
        for(int i = 0; i <= colors.length; i++){
            if(colors[i].equals(color)){
                return i;
            }
        }
        return 0;
    }

    String[] colors() {
        return colors;
    }
}
