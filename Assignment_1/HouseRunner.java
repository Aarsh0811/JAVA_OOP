//Name: Aarsh Patel
//Assignment-1
//Semester-2

public class HouseRunner {
    public static void main(String[] args) {
        House Hou1 = new House(605,"Sachin",15.5f);

        System.out.printf("Integer:%d" + "String:%s"+"FLoat:%f",Hou1.getInteger(),Hou1.getString(),Hou1.getFloat());

        System.out.println();

        House Hou2 = new House(126.8f,500,"Dhoni");
        System.out.printf("Float:%f"+" Integer:%d"+"String:%s",Hou2.getFloat(),Hou2.getInteger(),Hou2.getString());


        System.out.println();

        House Hou3 = new House(1000,125.4f,"Virat");
        System.out.printf("Integer:%d"+"Float:%f"+"String:%s",Hou3.getInteger(),Hou3.getFloat(),Hou3.getString());
    }
}
