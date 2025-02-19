public class Car {
    private String name;
    private String model;
    private int obem;

    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String model ){
        this.model=model;
    }
    public void setObem(int obem){
        this.obem=obem;

    }
    public String getName(){
        return this.name;
    }
    public String getModel(){
        return this.model;
    }
    public int getobem(){
        return this.obem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", obem=" + obem +
                '}';
    }
}



