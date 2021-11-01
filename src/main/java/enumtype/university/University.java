package enumtype.university;

public enum University {
    BME("Budapesti Muszaki Egyetem"), SZE("Szechenyi Istvan Egyetem"), BKE("Bpi Kozgaz Egyetem")   ;

    String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
