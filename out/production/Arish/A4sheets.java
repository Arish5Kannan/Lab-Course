
public class A4sheets {
    public static void main(String[] args) {
        int totstd = 66;
        int sheet = 50;
        int labcourse = 3;//3 labcourse for this sem
        int sstd = labcourse*sheet;// sheets for one student
        int SheetstotFulStd = sstd * totstd;
        int packet = 500;//one packet contains 500 sheets
        System.out.println("Total no of sheets: "+(SheetstotFulStd));//printing total number of sheets of total students
        int totpackets = 0;
        if(SheetstotFulStd % packet == 0)
        {
            totpackets = SheetstotFulStd/packet;
        }
        else{
            totpackets = 1 + (SheetstotFulStd / packet);
        }
        System.out.println("Number of packets: "+(totpackets));
    }
}
