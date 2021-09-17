package OOP;
class Album{
    String aName;
    int     aid;
    int     aPages;
    public void print(){
        System.out.println(aName+"\t"+aid+"\t"+aPages);
        System.out.println(aName+"\t"+aid+"\t"+aPages);
    }
}
public class newclass {
    public static void main(String[] args) {
        System.out.println("Today new Class and Object");
        Album al = new Album();
        Album al1 = new Album();
        al.aName = "Karizma";
        al.aid = 10;
        al.aPages = 36;
        al1.aid = 20;
        al.aPages = 40;
        al1.aName = "Photobook";
       al1.print();
       al.print();

    }
}
