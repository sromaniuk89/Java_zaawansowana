public enum Color {
    RED(false),
    BLUE(true),
    GREEN(true);

    boolean nice;

    private Color(boolean isNice) {
        this.nice = isNice;
    }
}
