public enum Days {
    Monday("bugun java sabagi bolot", "Monday"),
    Tuesday("bugun English sabai bolot", "Tuesday");
    private String sabak;
    private String vtornik;

    public String getVtornik() {
        return vtornik;
    }

    public void setVtornik(String vtornik) {
        this.vtornik = vtornik;
    }

    public String getSabak() {
        return sabak;
    }

    public void setSabak(String sabak, String vtornik) {
        this.sabak = sabak;
    }

    Days(String sabak, String vtornik) {
        this.sabak = sabak;
    }

    @Override
    public String toString() {
        return
                "sabak =  " + sabak;
    }
}
