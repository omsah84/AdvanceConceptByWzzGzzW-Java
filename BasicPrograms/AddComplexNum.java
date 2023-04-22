public class AddComplexNum {
    int real, image;

    AddComplexNum(int r, int i) {
        this.real = r;
        this.image = i;
    }



    public void show() {
        System.out.println(this.real + " i" + this.image);
    }
    
    
    public static AddComplexNum sum(AddComplexNum c1, AddComplexNum c2) {
        AddComplexNum res = new AddComplexNum(0, 0);

        res.real = c1.real + c2.real;

        res.image = c1.image + c2.image;

        return res;
    }


    public static void main(String[] args) {
        AddComplexNum c1 = new AddComplexNum(2, 2);
        AddComplexNum c2 = new AddComplexNum(2, 2);

        c1.show();

        c2.show();

        AddComplexNum res = sum(c1, c2);
        
        System.out.println("The addtion: ");
        res.show();

        
    }
    
}
