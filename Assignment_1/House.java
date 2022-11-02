//Name: Aarsh Patel
//Assignment-1
//Semester-2

public class House {

    public int j = 30; //i
    protected String k = "Aarsh"; //s
    private float l = 18.9f; //f

    public House(int a) {

        this.j=a;
    }

    public  House() {
    }

    public House(String k) {
        this.k = k;

    }

    public House(float l) {

        this.l = l;
    }

    public House(int j, float l) {
        this.j = j;
        this.l = l;
    }

    public House(float l, int j) {
    }

    public House(float l, String k) {
    }

    public House(String k, float l) {
    }

    public  House(String k, int j) {
    }

    public House(int j, String k) {
    }

    public  House(int j, float l, String k) {
        this.j = j;
        this.l = l;
        this.k = k;
    }

    public House(int j, String k, float l) {
        this.j = j;
        this.l = l;
        this.k = k;
    }

    public  House(float l, int j, String k) {
        this.j = j;
        this.l = l;
        this.k = k;
    }

    public House(float l, String k, int j) {
        this.j = j;
        this.l = l;
        this.k = k;
    }

    public  House(String k, int j, float l) {
    }

    public House(String k, float l, int j) {
    }

    public int getInteger() {

        return j;
    }

    public float getFloat() {

        return l;
    }
    public String getString()
    {
        return k;
    }
}
