public class AddComplexNum {
    //instance variable 
    int real, image;

    //constructor whick make real and image part 
    AddComplexNum(int r, int i) {
        this.real = r;
        this.image = i;
    }



    //complext value display
    public void show() {
        System.out.println(this.real + " i" + this.image);
    }
    
    //adding two complex number
    public static AddComplexNum sum(AddComplexNum c1, AddComplexNum c2) {
        AddComplexNum res = new AddComplexNum(0, 0);

        res.real = c1.real + c2.real;

        res.image = c1.image + c2.image;

        return res;
    }


    //driver code
    public static void main(String[] args) {
        //two complext number
        AddComplexNum c1 = new AddComplexNum(2, 2);
        AddComplexNum c2 = new AddComplexNum(2, 2);

        //printing first complex number
        c1.show();
        
        //printing first complex number
        c2.show();

        //add function
        AddComplexNum res = sum(c1, c2);
        
        //display result
        System.out.println("The addtion: ");
        res.show();

        
    }
    
}
