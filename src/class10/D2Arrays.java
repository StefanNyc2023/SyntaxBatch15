package class10;

public class D2Arrays {
    public static void main(String[] args) {
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Annes"};
        String[] cabin2={"Safi","Abeera","Zahra"};
        String [][] thomsonTrain=new String[3][];

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;
        //in the first [] we specify the address of 1 D ARRAY
        System.out.println(thomsonTrain[1][2]);
        //with only one [] we have to add arrays.tostring9thomastrain[0] to get all three names



    }
}
