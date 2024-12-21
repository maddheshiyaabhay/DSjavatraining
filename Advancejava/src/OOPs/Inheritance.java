package OOPs;

public class Inheritance {
    public static void main(String[]args){
        Parents parents = new Parents();
        parents.printparent();
        //Using inheritence call grandparent method
        parents.printGrandParent();

    }


}
class Parents extends GrandParents{
    void printparent(){
        System.out.println("Im parent");
    }
}
class GrandParents{
    void printGrandParent(){
        System.out.println("Im garndparents");
    }
}