package code.random;

public class LinkListDemo {
    public static void main(String[] args) {
        Obj obj = new Obj(3);
        System.out.println("Original Obj:"+ obj + "  Original value: " + obj.val);
        changeValue(obj);
        System.out.println("Changed Obj:"+ obj + "  Changed value: " + obj.val);
    }

    public static void changeValue(Obj obj){
        Obj newObj = obj;
        newObj = new Obj(10);
        System.out.println(obj + "  " + obj.val);
        System.out.println(newObj + " " + newObj.val);
    }

    public static void changeValue(int val) {

    }
}

class Obj {
    int val;
    Obj(int val) {
        this.val = val;
    }
    Obj(){}
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}